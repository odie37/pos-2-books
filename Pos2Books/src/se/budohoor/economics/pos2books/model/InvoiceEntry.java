package se.budohoor.economics.pos2books.model;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import se.budohoor.economics.pos2books.plugins.books.economic.EconomicWebServiceSoap;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrencyHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.DebtorData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.DebtorHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.InvoiceHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.TermOfPaymentHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.VatZone;

public class InvoiceEntry extends BookEntry {
    private static Logger log = Logger.getLogger(InvoiceEntry.class.getName());

    private boolean isFamily = false;
    private int invoiceNumber;
    private InvoiceCustomer customer;
    private String comments;
    private Date purchaseDate;
    private ArrayList<InvoiceItem> items = new ArrayList<InvoiceItem>();
    
    public InvoiceEntry() {
        super();
    }
    
    public InvoiceEntry(int invoiceNumber) {
        super();
        this.invoiceNumber = invoiceNumber;
        log.info("Invoice created - " + invoiceNumber);
    }
    
    public void addItem(InvoiceItem item) {
        items.add(item);
    }
    
    public void addItem(MemberData mData) {
        if(!isFamily) {
            MembershipInvoiceItem item = new MembershipInvoiceItem(mData);
            items.add(item);
            if (item.getItemType() == MembershipInvoiceItem.InvoiceItemType.FAMILY) {
                isFamily = true;
            }
            log.info("Item added - <" + item.getItemType() + ">[" + mData.getMembershipNumber() + "]: " + mData.getName());
        } else {
            MembershipInvoiceItem membershipItem = (MembershipInvoiceItem) items.get(0);
            membershipItem.addMember(mData);
            log.info("Member added - [" + mData.getMembershipNumber() + "]: " + mData.getName());
        }
    }
    
    public ArrayList<InvoiceItem> getItems() {
        return items;
    }

    public void setCustomer(InvoiceCustomer customer) {
        this.customer = customer;
    }

    public InvoiceCustomer getCustomer() {
        return customer;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public int getAmount() {
        int amount = 0;
        for (InvoiceItem item : items) {
            amount += item.getAmount();
        }
        return amount;
    }
    
/*
    public void sendToEconomic(EconomicWebServiceSoap ews) throws DatatypeConfigurationException { 
        DatatypeFactory dtFactory = DatatypeFactory.newInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
        CurrencyHandle currency = ews.currencyFindByCode(CURRENCY);
        TermOfPaymentHandle termOfPayment = ews.termOfPaymentFindByName(TERM_OF_PAYMENT).getTermOfPaymentHandle().get(0);

        DebtorHandle debtor = null;
        try {
            debtor = ews.debtorFindByName(customer.getName()).getDebtorHandle().get(0);
        } catch (IndexOutOfBoundsException ioobe) {
            DebtorData debtorData = new DebtorData();
            debtorData.setIsAccessible(true);
            debtorData.setVatZone(VatZone.HOME_COUNTRY);
            debtorData.setTermOfPaymentHandle(termOfPayment);
            debtorData.setCurrencyHandle(currency);
            debtorData.setName(customer.getName());
            debtorData.setEmail(customer.getEmail());
            debtorData.setAddress(customer.getAddress());
            debtorData.setPostalCode(customer.getZip());
            debtorData.setCity(customer.getCity());
            debtorData.setDebtorGroupHandle(ews.debtorGroupFindByNumber(DEBTOR_GROUP_NR));
            debtorData.setOurReferenceHandle(ews.employeeFindByNumber(OUR_REF_EMP_NR));
            debtor = ews.debtorCreateFromData(debtorData);
        }
        
        CurrentInvoiceHandle inv = ews.currentInvoiceCreate(debtor);
        ews.currentInvoiceSetHeading(inv, INVOICE_HEADER);
        for (InvoiceItem item : items) {
            item.sendToEconomics(ews, inv);
        }
    }
*/
    @Override
    public void log() {
        StringBuffer logEntry = new StringBuffer();
        logEntry.append("Date: " + purchaseDate);
        logEntry.append(", Items: " + items.size());
        logEntry.append(", Comments: " + comments);
        log.info(logEntry.toString());
    }

    @Override
    public boolean isComplete() {
        return false;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }
}
