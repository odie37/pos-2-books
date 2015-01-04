package se.budohoor.economics.pos2books.model;

public class CustomerPaymentsCashBookEntry extends CashBookEntry {
    private Integer invoiceNumber;
    
    public CustomerPaymentsCashBookEntry() {
        super();
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }
}
