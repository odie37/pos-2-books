package se.budohoor.economics.pos2books.plugins.books.economic;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.logging.Logger;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.BindingProvider;

import se.budohoor.economics.pos2books.model.BookEntry;
import se.budohoor.economics.pos2books.model.Books;
import se.budohoor.economics.pos2books.model.CashBookEntry;
import se.budohoor.economics.pos2books.model.InvoiceEntry;
import se.budohoor.economics.pos2books.model.CustomerPaymentsCashBookEntry;
import se.budohoor.economics.pos2books.model.InvoiceCustomer;
import se.budohoor.economics.pos2books.model.InvoiceItem;
import se.budohoor.economics.pos2books.model.Pos;
import se.budohoor.economics.pos2books.model.ProductDefinition;
import se.budohoor.economics.pos2books.model.TxLogStatus;
import se.budohoor.economics.pos2books.plugins.books.economic.types.AccountHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.ArrayOfCashBookEntryData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.ArrayOfCashBookEntryHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CashBookEntryData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CashBookEntryHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CashBookEntryType;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CashBookHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrencyHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceLineData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceLineHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.DebtorData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.DebtorHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.InvoiceData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.InvoiceHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.ProductData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.ProductGroupHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.ProductHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.TermOfPaymentHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.UnitHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.VatZone;
import se.budohoor.economics.pos2books.settings.AccountMapTool;
import se.budohoor.economics.pos2books.settings.Settings;
import se.budohoor.economics.pos2books.tool.Pos2BooksException;
import se.budohoor.economics.pos2books.tool.membershipinvoicer.MemberData;

public class BooksImpl implements Books {
    private static final Logger log = Logger.getLogger(BooksImpl.class.getName());

    private static final String INVOICE_HEADER = "Inköp från budohallen";
    private static final int DEBTOR_GROUP_NR = 10;
    private static final int OUR_REF_EMP_NR = 1;
    private static final String TERM_OF_PAYMENT = "10 dagar netto";
    private static final String CURRENCY = "SEK";
    private static final int PAYMENT_DUE_IN_DAYS = 10;
    private static final String DUMMY_CUSTOMER = "Dummy Customer";
    
    private EconomicWebServiceSoap ews;
    
    private AccountHandle pettyCashAccount;
    private CashBookHandle cashBook;
    private CashBookHandle customerPaymentsCashBook;
    private CurrencyHandle currency;
    private UnitHandle unitPerItem;
    
    public BooksImpl() {
        super();
        EconomicWebService economicWebService = new EconomicWebService();
        ews = economicWebService.getEconomicWebServiceSoap12();
        ((BindingProvider)ews).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
        ews.connect(
            Settings.getInstance().getEconomicAgreementNumber(),
            Settings.getInstance().getEconomicUserName(),
            Settings.getInstance().getEconomicPassword());
        log.info("Connected to e-conomic.se!");
        cashBook = ews.cashBookFindByName(Settings.getInstance().getCashBookName());
        customerPaymentsCashBook = ews.cashBookFindByName(Settings.getInstance().getCustomerPaymentsCashBookName());
        pettyCashAccount = ews.accountFindByNumber(Settings.getInstance().getPettyCashAccount());
        currency = ews.currencyFindByCode("SEK");
        unitPerItem = ews.unitFindByName("St").getUnitHandle().get(0);
    }

    @Override
    public void sendEntries(BookEntry[] entries) throws Pos2BooksException {
        try {
            DatatypeFactory dtFactory = DatatypeFactory.newInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
            ArrayOfCashBookEntryData cashBookEntries = new ArrayOfCashBookEntryData();
            ArrayList<BookEntry> handledEntries = new ArrayList<BookEntry>();
            int i = 0;
            int voucherNo = ews.cashBookGetNextVoucherNumber(cashBook);
            for (BookEntry e : entries) {
                i++;
                if(e instanceof CustomerPaymentsCashBookEntry) {
                    log.info("Registering customer payment entry...");
                    CustomerPaymentsCashBookEntry entry = (CustomerPaymentsCashBookEntry) e;
                    InvoiceHandle invoiceHandle = ews.invoiceFindByNumber(entry.getInvoiceNumber());
                    InvoiceData invoice = ews.invoiceGetData(invoiceHandle);
                    CashBookEntryHandle entryHandle = ews.cashBookEntryCreateDebtorPayment(
                            customerPaymentsCashBook, 
                            invoice.getDebtorHandle(), 
                            pettyCashAccount);
                    ews.cashBookEntrySetDebtorInvoiceNumber(entryHandle, entry.getInvoiceNumber());
                    int paymentVoucherNo = ews.cashBookEntryGetVoucherNumber(entryHandle);
                    e.setBookRef("" + paymentVoucherNo);
                    handledEntries.add(e);
                    log.info("Invoice payment registered (" + paymentVoucherNo + ")!");
                } else if(e instanceof CashBookEntry) {
                    log.info("Registering cashbook entry...");
                    CashBookEntry entry = (CashBookEntry) e;
                    CashBookEntryData entryData = new CashBookEntryData();
                    entryData.setType(CashBookEntryType.FINANCE_VOUCHER);
                    entryData.setVoucherNumber(voucherNo);
                    entryData.setCashBookHandle(cashBook);
                    if(entry.getPrimaryAccount() != null) {
                        entryData.setAccountHandle(ews.accountFindByNumber(entry.getPrimaryAccount()));
                    }
                    entryData.setAmount(new BigDecimal(entry.getAmount()));
                    entryData.setAmountDefaultCurrency(new BigDecimal(entry.getAmount()));
                    entryData.setCurrencyHandle(currency);
                    entryData.setDate(dtFactory.newXMLGregorianCalendar(sdf.format(entry.getBookDate())));
                    entryData.setText(entry.getText());
                    if(entry.getSecondaryAccount() != null) {
                        entryData.setContraAccountHandle(ews.accountFindByNumber(entry.getSecondaryAccount()));
                    }
                    cashBookEntries.getCashBookEntryData().add(entryData);
                    e.setBookRef("" + voucherNo);
                    handledEntries.add(e);
                    log.info("Cashbook entry registered (" + voucherNo + ")!");
                } else if (e instanceof InvoiceEntry) {
                    log.info("Registering invoice entry...");
                    InvoiceEntry entry = (InvoiceEntry) e;
                    CurrencyHandle currency = ews.currencyFindByCode(CURRENCY);
                    TermOfPaymentHandle termOfPayment = ews.termOfPaymentFindByName(TERM_OF_PAYMENT).getTermOfPaymentHandle().get(0);

                    DebtorHandle debtor = null;
                    InvoiceCustomer customer = entry.getCustomer();
                    try {
                        if (customer != null) {
                            debtor = ews.debtorFindByName(customer.getName()).getDebtorHandle().get(0);
                        } else {
                            debtor = ews.debtorFindByName(DUMMY_CUSTOMER).getDebtorHandle().get(0);
                        }
                    } catch (IndexOutOfBoundsException ioobe) {
                        DebtorData debtorData = new DebtorData();
                        debtorData.setIsAccessible(true);
                        debtorData.setVatZone(VatZone.HOME_COUNTRY);
                        debtorData.setTermOfPaymentHandle(termOfPayment);
                        debtorData.setCurrencyHandle(currency);
                        debtorData.setName(customer.getName());
                        debtorData.setEmail(customer.getEmail());
                        if (customer.getAddress() != null)
                            debtorData.setAddress(customer.getAddress());
                        if (customer.getZip() != null)
                            debtorData.setPostalCode(customer.getZip());
                        if (customer.getCity() != null)
                            debtorData.setCity(customer.getCity());
                        debtorData.setDebtorGroupHandle(ews.debtorGroupFindByNumber(DEBTOR_GROUP_NR));
                        debtorData.setOurReferenceHandle(ews.employeeFindByNumber(OUR_REF_EMP_NR));
                        debtor = ews.debtorCreateFromData(debtorData);
                    }
                    
                    CurrentInvoiceHandle inv = ews.currentInvoiceCreate(debtor);
                    ews.currentInvoiceSetHeading(inv, INVOICE_HEADER);
                    ews.currentInvoiceSetTextLine1(inv, "Utlämnat " + entry.getPurchaseDate());
                    ews.currentInvoiceSetTextLine2(inv, entry.getComments());
                    for (InvoiceItem item : entry.getItems()) {
                        sendItemToEconomics(item, inv);
                    }
                    String invoiceNumber = "F" + inv.getId();
                    e.setBookRef(invoiceNumber);
                    handledEntries.add(e);
                    log.info("Invoice registered (" + invoiceNumber + ")!");
                }
            }
            int numberOfCashBookEntries = cashBookEntries.getCashBookEntryData().size();
            if (numberOfCashBookEntries > 0) {
                log.info("Sending " + numberOfCashBookEntries + " cashbook entries...");
                ews.cashBookEntryCreateFromDataArray(cashBookEntries);
                log.info("Cashbook entries sent!");
            }
            log.info("Handled " + handledEntries.size() + " entries!");
            Settings.getInstance().auditLogEntries(handledEntries, TxLogStatus.BOOKED);
        } catch (Exception e) {
            throw new Pos2BooksException("Sending of entries failed: " + e.getMessage(), e);
        }
    }
    
    private void sendItemToEconomics(InvoiceItem item, CurrentInvoiceHandle inv) {
        CurrentInvoiceLineHandle invLine = ews.currentInvoiceLineCreate(inv);
        CurrentInvoiceLineData lineData = ews.currentInvoiceLineGetData(invLine);
        ProductHandle product = ews.productFindByNumber(item.getProductNumber());
        if (product == null) {
            product = defineNewProduct(item);
        }
        ProductData productData = ews.productGetData(product);
        lineData.setProductHandle(product);
        lineData.setQuantity(new BigDecimal(item.getQuantity()));
        StringBuffer description = new StringBuffer();
        description.append(productData.getName());
        lineData.setDescription(description.toString());
        lineData.setUnitHandle(productData.getUnitHandle());
        lineData.setUnitNetPrice(new BigDecimal(item.getItemPrice()));
        if (item.getDiscountPercent() > 0) {
            lineData.setDiscountAsPercent(new BigDecimal(item.getDiscountPercent()));
        }
        ews.currentInvoiceLineUpdateFromData(lineData);        
    }
    
    private ProductHandle defineNewProduct(InvoiceItem item) {
        Pos pos = Settings.getInstance().getPos();
        ProductDefinition def = pos.getProductDefinition(item.getProductNumber());
        log.info("Finding product group for category = " + def.getCategory());
        ProductGroupHandle groupHandle = ews.productGroupFindByName(def.getCategory()).getProductGroupHandle().get(0);
        ProductHandle handle = ews.productCreate(def.getId(), groupHandle, def.getName());
        ProductData prod = ews.productGetData(handle);
        prod.setCostPrice(new BigDecimal(def.getItemCost()));
        prod.setDescription(def.getDescription());
        prod.setRecommendedPrice(new BigDecimal(def.getItemPrice()));
        prod.setSalesPrice(new BigDecimal(def.getItemPrice()));
        prod.setIsAccessible(true);
        prod.setUnitHandle(unitPerItem);
        ews.productUpdateFromData(prod);
        return handle;
    }
}
