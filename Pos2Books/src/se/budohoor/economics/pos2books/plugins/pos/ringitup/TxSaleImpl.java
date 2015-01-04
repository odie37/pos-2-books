package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import se.budohoor.economics.pos2books.model.BatchCategory;
import se.budohoor.economics.pos2books.model.BookEntry;
import se.budohoor.economics.pos2books.model.CashBookEntry;
import se.budohoor.economics.pos2books.model.CustomerPaymentsCashBookEntry;
import se.budohoor.economics.pos2books.model.InvoiceCustomer;
import se.budohoor.economics.pos2books.model.InvoiceEntry;
import se.budohoor.economics.pos2books.model.InvoiceItem;
import se.budohoor.economics.pos2books.model.TxCashSale;
import se.budohoor.economics.pos2books.model.TxInvoicePayment;
import se.budohoor.economics.pos2books.model.TxInvoiceSale;
import se.budohoor.economics.pos2books.model.TxLogStatus;
import se.budohoor.economics.pos2books.model.TxType;
import se.budohoor.economics.pos2books.settings.AccountMapTool;
import se.budohoor.economics.pos2books.settings.Settings;
import se.budohoor.economics.pos2books.settings.TxAuditLog;
import se.budohoor.economics.pos2books.tool.UI;


public class TxSaleImpl implements TxCashSale, TxInvoicePayment, TxInvoiceSale {
    private static final Logger log = Logger.getLogger(TxSaleImpl.class.getName());
    private Transaction tx;
    private ArrayList<BookEntry> entries;

    public TxSaleImpl() {
        super();
        entries = new ArrayList<BookEntry>();
    }
    
    public TxSaleImpl(Transaction tx) {
        this();
        this.tx = tx;
    }
    
    public String getTxId() {
        return "" + tx.getTransactionId();
    }
    
    public String getPosReference() {
        return "" + tx.getTicketId();
    }

    public Date getTxDate() {
        return tx.getTransactionDate();
    }

    public Double getTxAmount() {
        return tx.getTotal();
    }

    public String getTxDescription() {
        return ""; //TODO
    }

    public TxType getTxType() {
        for (Payment p : tx.getPaymentList()) {
            if (p.getPaymentType().getPaymentTypeName().equalsIgnoreCase("invoice")) {
                return TxType.INVOICE_SALE;
            }
        }
        for (CartItem item : tx.getCartItems()) {
            if (item.getCatalogItem().getCategory().getCategoryName().equalsIgnoreCase("fakturor")) {
                return TxType.INVOICE_PAYMENT;
            }
        }
        return TxType.CASH_SALE;
    }

    @Override
    public BookEntry[] translate(boolean forceCompleteEntries) {
        switch (getTxType()) {
        case INVOICE_SALE:
            //TODO: Check that invoice amount equals full ticket amount!
            //TODO: Create entry with null amount and reference invoice number.
            InvoiceEntry invEntry = new InvoiceEntry();
            Contact contact = tx.getContact();
            if (contact != null) {
                InvoiceCustomer customer = new InvoiceCustomer(contact.getFirstName() + " " + contact.getLastName(),
                                                           contact.getEmail(),
                                                           contact.getStreet() + " " + contact.getApartment(),
                                                           contact.getPostalCode(),
                                                           contact.getCity());
                invEntry.setCustomer(customer);
            }
            
            StringBuffer comments = new StringBuffer();
            for (TransactionNote note : tx.getNotes()) {
                comments.append(note.getNote() + "\r\n");
            }
            invEntry.setComments(comments.toString());
            
            invEntry.setPurchaseDate(tx.getTransactionDate());
            
            for (CartItem item : tx.getCartItems()) {
                InvoiceItem invoiceItem = new InvoiceItem();
                invoiceItem.setDescription(item.getItemDescription());
                invoiceItem.setProductNumber(item.getItemSku());
                invoiceItem.setQuantity(item.getQuantity());
                invoiceItem.setItemPrice(item.getTier1Price());
                invoiceItem.setDiscountPercent(item.getRawDiscount());
                invEntry.addItem(invoiceItem);
            }
            invEntry.addTx(this);
            entries.add(invEntry);
            break;
        case INVOICE_PAYMENT:
            List<CartItem> invoiceItems = tx.getCartItems();
            for (CartItem item : invoiceItems) {
                CustomerPaymentsCashBookEntry entry = new CustomerPaymentsCashBookEntry();
                if(item.getNotes().size() > 0) {
                    entry.setInvoiceNumber(new Integer(item.getNotes().get(0).getNote()));
                }
                entry.setBookDate(tx.getTransactionDate());
                entry.setAmount(item.getSubtotal());
                entry.addTx(this);
                entries.add(entry);
            } 
            break;
        case CASH_SALE:            
            CashBookEntry mainEntry = new CashBookEntry();
            mainEntry.addTx(this);
            mainEntry.setBookDate(tx.getTransactionDate());
            mainEntry.setAmount(tx.getTotal());
            mainEntry.setPrimaryAccount(Settings.getInstance().getPettyCashAccount());
            List<CartItem> items = tx.getCartItems();
            if (items.size() == 1) { //do single entry
                CartItem item = items.get(0);
                mainEntry.setText("Kvitto [" + tx.getTicketId() + "]: " + item.getQuantity() + item.getUnitLabel() + " " + item.getItemName() + " à " + item.getTier1Price() + "kr");
                Integer accountNo = AccountMapTool.getInstance().getAccountByItemCategory(item.getCatalogItem().getCategory().getCategoryName());
                if (accountNo != null && (accountNo == 0 || accountNo == 9999) && forceCompleteEntries) {
                    //accountNo = UI.queryAccountForItem(item);
                    accountNo = 9999;
                }
                mainEntry.setSecondaryAccount(accountNo);
                entries.add(mainEntry);
            } else { //do multiple entries
                mainEntry.setText("Kvitto [" + tx.getTicketId() + "]");
                entries.add(mainEntry);
                for(CartItem item : items) {
                    CashBookEntry entry = new CashBookEntry();
                    entry.setBookDate(mainEntry.getBookDate());
                    entry.setText(item.getQuantity() + item.getUnitLabel() + " " + item.getItemName() + " à " + item.getTier1Price() + "kr");
                    entry.setAmount(-item.getSubtotal());
                    Integer accountNo = AccountMapTool.getInstance().getAccountByItemCategory(item.getCatalogItem().getCategory().getCategoryName());
                    if (accountNo != null && (accountNo == 0 || accountNo == 9999) && forceCompleteEntries) {
                        //accountNo = UI.queryAccountForItem(item);
                        accountNo = 9999;
                    }
                    entry.setPrimaryAccount(accountNo);
                    entries.add(entry);
                }
            }
            break;
        default:
            log.warning("This should not happen!");
            break;
        }
        Settings.getInstance().auditLogEntries(entries, TxLogStatus.TRANSLATED, null);
        return entries.toArray(new BookEntry[entries.size()]);
    }

    @Override
    public void log() {
        log.info("TxType: " + getTxType() + " txId: "+ tx.getTransactionId() + " ticketId: " + tx.getTicketId() + " date: " + tx.getTransactionDate() + " total: " + tx.getTotal() + " balance: " + tx.getBalance());
        for (Payment pmt : tx.getPaymentList()) {
            log.info("--pmt-amount: " + pmt.getPaymentAmount() + " type: " + pmt.getPaymentType().getPaymentTypeName() + " date: " + pmt.getPaymentDate() + " memo: " + pmt.getMemo());
        }
        for (CartItem item : tx.getCartItems()) {
            log.info("----item-id: " + item.getItemSku() + " name: " + item.getItemName() + " qty: " + item.getQuantity() + " price: " + item.getTier1Price() + " subtotal: " + item.getSubtotal());
        }
    }

    @Override
    public BookEntry[] getBookEntries() {
        return entries.toArray(new CashBookEntry[entries.size()]);
    }

    @Override
    public boolean hasIncompleteEntries() {
        if (entries.size() > 0) {
            for (BookEntry entry : entries) {
                if(!entry.isComplete()) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void categorizeSale(HashMap<String, BatchCategory> categories) {
        for(CartItem item : tx.getCartItems()) {
            String categoryName = item.getCatalogItem().getCategory().getCategoryName();
            BatchCategory category;
            if(categories.containsKey(categoryName)) {
                category = categories.get(categoryName);
            } else {
                category = new BatchCategory(categoryName);
                categories.put(categoryName, category);
            }
            category.addSale(item.getQuantity(), item.getSubtotal());
        }
    }

    @Override
    public String getReceiptId() {
        return "" + tx.getTicketId();
    }
}
