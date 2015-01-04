package se.budohoor.economics.pos2books.tool.membershipinvoicer;

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

public class Invoice {
    private static final String INVOICE_HEADER = "Medlemsavgift HT 2014";
    private static final int DEBTOR_GROUP_NR = 10;
    private static final int OUR_REF_EMP_NR = 1;
    private static final String TERM_OF_PAYMENT = "10 dagar netto";
    private static final String CURRENCY = "SEK";
    private static final int PAYMENT_DUE_IN_DAYS = 10;
    
    private static Logger log = Logger.getLogger(Invoice.class.getName());

    private boolean isFamily = false;
    private int invoiceNumber;
    private Customer customer;
    private ArrayList<InvoiceItem> items = new ArrayList<InvoiceItem>();
    
    public Invoice(int invoiceNumber) {
        super();
        this.invoiceNumber = invoiceNumber;
        log.info("Invoice created - " + invoiceNumber);
    }
    
    public void addItem(MemberData mData) {
        if(!isFamily) {
            InvoiceItem item = new InvoiceItem(mData);
            items.add(item);
            if (item.getItemType() == InvoiceItem.InvoiceItemType.FAMILY) {
                isFamily = true;
            }
            log.info("Item added - <" + item.getItemType() + ">[" + mData.getMembershipNumber() + "]: " + mData.getName());
        } else {
            items.get(0).addMember(mData);
            log.info("Member added - [" + mData.getMembershipNumber() + "]: " + mData.getName());
        }
    }
    
    public ArrayList<InvoiceItem> getItems() {
        return items;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
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
        /*
        CurrentInvoiceData invData = new CurrentInvoiceData();
        invData.setDebtorHandle(debtor);
        invData.setDebtorName(customer.getName());
        invData.setHeading(INVOICE_HEADER);
        invData.setDate(dtFactory.newXMLGregorianCalendar(sdf.format(new Date())));
        invData.setCurrencyHandle(currency);
        invData.setExchangeRate(new BigDecimal(1));
        int amount = getAmount();
        invData.setNetAmount(new BigDecimal(amount));
        invData.setVatAmount(new BigDecimal(0));
        invData.setGrossAmount(new BigDecimal(amount));
        invData.setMargin(new BigDecimal(amount));
        invData.setMarginAsPercent(new BigDecimal(100));
        invData.setTermOfPaymentHandle(termOfPayment);
        GregorianCalendar dueDate = new GregorianCalendar();
        dueDate.roll(Calendar.DAY_OF_YEAR, PAYMENT_DUE_IN_DAYS);
        invData.setDueDate(dtFactory.newXMLGregorianCalendar(sdf.format(dueDate.getTime())));
        CurrentInvoiceHandle inv = ews.currentInvoiceCreateFromData(invData);
        */
        
        CurrentInvoiceHandle inv = ews.currentInvoiceCreate(debtor);
        ews.currentInvoiceSetHeading(inv, INVOICE_HEADER);
        for (InvoiceItem item : items) {
            item.sendToEconomics(ews, inv);
        }
    }
}
