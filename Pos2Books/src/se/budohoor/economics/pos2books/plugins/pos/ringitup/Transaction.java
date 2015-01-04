package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries( { 
        @NamedQuery(name = "Transaction.findAll", query = "select o from Transaction o"),
        @NamedQuery(name = "Transaction.findAllSalesAfterId", query = "select o from Transaction o where o.transactionId > :txId and o.transactionType = :txType")
})
@Table(name = "\"transactions\"")
public class Transaction implements Serializable {
    @Column(name = "apply_taxrate1_to_labor")
    private int applyTaxRate1ToLabor;
    @Column(name = "apply_taxrate1_to_other")
    private int applyTaxRate1ToOther;
    @Column(name = "apply_taxrate1_to_shipping")
    private int applyTaxRate1ToShipping;
    @Column(name = "apply_taxrate2_to_labor")
    private int applyTaxRate2ToLabor;
    @Column(name = "apply_taxrate2_to_other")
    private int applyTaxRate2ToOther;
    @Column(name = "apply_taxrate2_to_shipping")
    private int applyTaxRate2ToShipping;
    @Column(name = "balance")
    private double balance;
    @Column(name = "change_due")
    private double changeDue;
    @Column(name = "discount_is_percent")
    private int discountIsPercent;
    @Column(name = "discount_only_includes_subtotal")
    private int discountOnlyIncludesSubtotal;
    @Column(name = "discount_subtotal")
    private double discountSubtotal;
//    @Column(name = "fk_contact_id")
//    private int contactId;
    @Column(name = "flagged")
    private int flagged;
    @Column(name = "items_were_received")
    private int itemsWereReceived;
    @Column(name = "labor_qty")
    private double laborQty;
    @Column(name = "labor_rate")
    private double laborRate;
    @Column(name = "labor_subtotal")
    private double laborSubtotal;
    @Column(name = "locked")
    private int locked;
    @Column(name = "nontaxable_subtotal")
    private double nonTaxableSubtotal;
    @Column(name = "other_subtotal")
    private double otherSubtotal;
    @Column(name = "other_subtotal_description")
    private String otherSubtotalDescription;
    @Column(name = "payment_status")
    private int paymentStatus;
    @Column(name = "payments_subtotal")
    private double paymentsSubtotal;
    @Id
    @Column(name = "pk", nullable = false)
    private int transactionId;
    @Column(name = "raw_discount")
    private double rawDiscount;
    @Column(name = "shipping_subtotal")
    private double shippingSubtotal;
    @Column(name = "signature_image")
    private byte[] signatureImage;
    @Column(name = "subtotal")
    private double subtotal;
    @Column(name = "tax1_subtotal")
    private double tax1Subtotal;
    @Column(name = "tax2_subtotal")
    private double tax2Subtotal;
    @Column(name = "taxable_subtotal")
    private double taxableSubtotal;
    @Column(name = "taxrate1")
    private double taxRate1;
    @Column(name = "taxrate2")
    private double taxRate2;
    @Column(name = "ticket_id")
    private int ticketId;
    @Column(name = "tip_subtotal")
    private double tipSubtotal;
    @Column(name = "total")
    private double total;
    @Column(name = "transaction_date")
    private double transactionDate;
    @Column(name = "transaction_type")
    @Enumerated
    private TransactionType transactionType;
    @OneToMany(mappedBy = "transaction")
    private List<CartItem> cartItems;
    @OneToMany(mappedBy = "transaction")
    private List<Payment> paymentList;
    @OneToMany
    @JoinColumn(name="fk_parent_record_id")
    private List<TransactionNote> notes;
    @ManyToOne
    @JoinColumn(name = "fk_contact_id", referencedColumnName = "pk")
    private Contact contact;


    public Transaction() {
    }

    public Transaction(int applyTaxRate1ToLabor, int applyTaxRate1ToOther, int apply_taxrate1_to_shipping,
                       int apply_taxrate2_to_labor, int apply_taxrate2_to_other, int apply_taxrate2_to_shipping,
                       double balance, double change_due, int discount_is_percent, int discount_only_includes_subtotal,
                       double discount_subtotal, int fk_contact_id, int flagged, int items_were_received,
                       double labor_qty, double labor_rate, double labor_subtotal, int locked,
                       double nontaxable_subtotal, double other_subtotal, String other_subtotal_description,
                       int payment_status, double payments_subtotal, int pk, double raw_discount,
                       double shipping_subtotal, double subtotal, double tax1_subtotal, double tax2_subtotal,
                       double taxable_subtotal, double taxrate1, double taxrate2, int ticket_id, double tip_subtotal,
                       double total, float transaction_date, TransactionType transaction_type) {
        this.applyTaxRate1ToLabor = applyTaxRate1ToLabor;
        this.applyTaxRate1ToOther = applyTaxRate1ToOther;
        this.applyTaxRate1ToShipping = apply_taxrate1_to_shipping;
        this.applyTaxRate2ToLabor = apply_taxrate2_to_labor;
        this.applyTaxRate2ToOther = apply_taxrate2_to_other;
        this.applyTaxRate2ToShipping = apply_taxrate2_to_shipping;
        this.balance = balance;
        this.changeDue = change_due;
        this.discountIsPercent = discount_is_percent;
        this.discountOnlyIncludesSubtotal = discount_only_includes_subtotal;
        this.discountSubtotal = discount_subtotal;
//        this.contactId = fk_contact_id;
        this.flagged = flagged;
        this.itemsWereReceived = items_were_received;
        this.laborQty = labor_qty;
        this.laborRate = labor_rate;
        this.laborSubtotal = labor_subtotal;
        this.locked = locked;
        this.nonTaxableSubtotal = nontaxable_subtotal;
        this.otherSubtotal = other_subtotal;
        this.otherSubtotalDescription = other_subtotal_description;
        this.paymentStatus = payment_status;
        this.paymentsSubtotal = payments_subtotal;
        this.transactionId = pk;
        this.rawDiscount = raw_discount;
        this.shippingSubtotal = shipping_subtotal;
        this.subtotal = subtotal;
        this.tax1Subtotal = tax1_subtotal;
        this.tax2Subtotal = tax2_subtotal;
        this.taxableSubtotal = taxable_subtotal;
        this.taxRate1 = taxrate1;
        this.taxRate2 = taxrate2;
        this.ticketId = ticket_id;
        this.tipSubtotal = tip_subtotal;
        this.total = total;
        this.transactionDate = transaction_date;
        this.transactionType = transaction_type;
    }


    public int getApplyTaxRate1ToLabor() {
        return applyTaxRate1ToLabor;
    }

    public void setApplyTaxRate1ToLabor(int applyTaxRate1ToLabor) {
        this.applyTaxRate1ToLabor = applyTaxRate1ToLabor;
    }

    public int getApplyTaxRate1ToOther() {
        return applyTaxRate1ToOther;
    }

    public void setApplyTaxRate1ToOther(int applyTaxRate1ToOther) {
        this.applyTaxRate1ToOther = applyTaxRate1ToOther;
    }

    public int getApplyTaxRate1ToShipping() {
        return applyTaxRate1ToShipping;
    }

    public void setApplyTaxRate1ToShipping(int applyTaxRate1ToShipping) {
        this.applyTaxRate1ToShipping = applyTaxRate1ToShipping;
    }

    public int getApplyTaxRate2ToLabor() {
        return applyTaxRate2ToLabor;
    }

    public void setApplyTaxRate2ToLabor(int applyTaxRate2ToLabor) {
        this.applyTaxRate2ToLabor = applyTaxRate2ToLabor;
    }

    public int getApplyTaxRate2ToOther() {
        return applyTaxRate2ToOther;
    }

    public void setApplyTaxRate2ToOther(int applyTaxRate2ToOther) {
        this.applyTaxRate2ToOther = applyTaxRate2ToOther;
    }

    public int getApplyTaxRate2ToShipping() {
        return applyTaxRate2ToShipping;
    }

    public void setApplyTaxRate2ToShipping(int applyTaxRate2ToShipping) {
        this.applyTaxRate2ToShipping = applyTaxRate2ToShipping;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getChangeDue() {
        return changeDue;
    }

    public void setChangeDue(double changeDue) {
        this.changeDue = changeDue;
    }

    public int getDiscountIsPercent() {
        return discountIsPercent;
    }

    public void setDiscountIsPercent(int discountIsPercent) {
        this.discountIsPercent = discountIsPercent;
    }

    public int getDiscountOnlyIncludesSubtotal() {
        return discountOnlyIncludesSubtotal;
    }

    public void setDiscountOnlyIncludesSubtotal(int discountOnlyIncludesSubtotal) {
        this.discountOnlyIncludesSubtotal = discountOnlyIncludesSubtotal;
    }

    public double getDiscountSubtotal() {
        return discountSubtotal;
    }

    public void setDiscountSubtotal(double discountSubtotal) {
        this.discountSubtotal = discountSubtotal;
    }
/*
    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
*/
    public int getFlagged() {
        return flagged;
    }

    public void setFlagged(int flagged) {
        this.flagged = flagged;
    }

    public int getItemsWereReceived() {
        return itemsWereReceived;
    }

    public void setItemsWereReceived(int itemsWereReceived) {
        this.itemsWereReceived = itemsWereReceived;
    }

    public double getLaborQty() {
        return laborQty;
    }

    public void setLaborQty(double laborQty) {
        this.laborQty = laborQty;
    }

    public double getLaborRate() {
        return laborRate;
    }

    public void setLaborRate(double laborRate) {
        this.laborRate = laborRate;
    }

    public double getLaborSubtotal() {
        return laborSubtotal;
    }

    public void setLaborSubtotal(double laborSubtotal) {
        this.laborSubtotal = laborSubtotal;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public double getNonTaxableSubtotal() {
        return nonTaxableSubtotal;
    }

    public void setNontaxableSubtotal(double nonTaxableSubtotal) {
        this.nonTaxableSubtotal = nonTaxableSubtotal;
    }

    public double getOtherSubtotal() {
        return otherSubtotal;
    }

    public void setOtherSubtotal(double otherSubtotal) {
        this.otherSubtotal = otherSubtotal;
    }

    public String getOtherSubtotalDescription() {
        return otherSubtotalDescription;
    }

    public void setOtherSubtotalDescription(String other_subtotal_description) {
        this.otherSubtotalDescription = other_subtotal_description;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int payment_status) {
        this.paymentStatus = payment_status;
    }

    public double getPaymentsSubtotal() {
        return paymentsSubtotal;
    }

    public void setPaymentsSubtotal(double payments_subtotal) {
        this.paymentsSubtotal = payments_subtotal;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int pk) {
        this.transactionId = pk;
    }

    public double getRawDiscount() {
        return rawDiscount;
    }

    public void setRawDiscount(double raw_discount) {
        this.rawDiscount = raw_discount;
    }

    public double getShippingSubtotal() {
        return shippingSubtotal;
    }

    public void setShippingSubtotal(double shipping_subtotal) {
        this.shippingSubtotal = shipping_subtotal;
    }

    public byte[] getSignatureImage() {
        return signatureImage;
    }

    public void setSignatureImage(byte[] signature_image) {
        this.signatureImage = signature_image;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTax1Subtotal() {
        return tax1Subtotal;
    }

    public void setTax1Subtotal(double tax1_subtotal) {
        this.tax1Subtotal = tax1_subtotal;
    }

    public double getTax2Subtotal() {
        return tax2Subtotal;
    }

    public void setTax2Subtotal(double tax2_subtotal) {
        this.tax2Subtotal = tax2_subtotal;
    }

    public double getTaxableSubtotal() {
        return taxableSubtotal;
    }

    public void setTaxableSubtotal(double taxable_subtotal) {
        this.taxableSubtotal = taxable_subtotal;
    }

    public double getTaxRate1() {
        return taxRate1;
    }

    public void setTaxRate1(double taxrate1) {
        this.taxRate1 = taxrate1;
    }

    public double getTaxRate2() {
        return taxRate2;
    }

    public void setTaxRate2(double taxrate2) {
        this.taxRate2 = taxrate2;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticket_id) {
        this.ticketId = ticket_id;
    }

    public double getTipSubtotal() {
        return tipSubtotal;
    }

    public void setTipSubtotal(double tip_subtotal) {
        this.tipSubtotal = tip_subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getTransactionDate() {
        return new Date(new Double(transactionDate * 1000).longValue());
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate.getTime()/1000;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transaction_type) {
        this.transactionType = transaction_type;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("apply_taxrate1_to_labor=");
        buffer.append(getApplyTaxRate1ToLabor());
        buffer.append(',');
        buffer.append("apply_taxrate1_to_other=");
        buffer.append(getApplyTaxRate1ToOther());
        buffer.append(',');
        buffer.append("apply_taxrate1_to_shipping=");
        buffer.append(getApplyTaxRate1ToShipping());
        buffer.append(',');
        buffer.append("apply_taxrate2_to_labor=");
        buffer.append(getApplyTaxRate2ToLabor());
        buffer.append(',');
        buffer.append("apply_taxrate2_to_other=");
        buffer.append(getApplyTaxRate2ToOther());
        buffer.append(',');
        buffer.append("apply_taxrate2_to_shipping=");
        buffer.append(getApplyTaxRate2ToShipping());
        buffer.append(',');
        buffer.append("balance=");
        buffer.append(getBalance());
        buffer.append(',');
        buffer.append("change_due=");
        buffer.append(getChangeDue());
        buffer.append(',');
        buffer.append("discount_is_percent=");
        buffer.append(getDiscountIsPercent());
        buffer.append(',');
        buffer.append("discount_only_includes_subtotal=");
        buffer.append(getDiscountOnlyIncludesSubtotal());
        buffer.append(',');
        buffer.append("discount_subtotal=");
        buffer.append(getDiscountSubtotal());
//        buffer.append(',');
//        buffer.append("fk_contact_id=");
//        buffer.append(getContactId());
        buffer.append(',');
        buffer.append("flagged=");
        buffer.append(getFlagged());
        buffer.append(',');
        buffer.append("items_were_received=");
        buffer.append(getItemsWereReceived());
        buffer.append(',');
        buffer.append("labor_qty=");
        buffer.append(getLaborQty());
        buffer.append(',');
        buffer.append("labor_rate=");
        buffer.append(getLaborRate());
        buffer.append(',');
        buffer.append("labor_subtotal=");
        buffer.append(getLaborSubtotal());
        buffer.append(',');
        buffer.append("locked=");
        buffer.append(getLocked());
        buffer.append(',');
        buffer.append("nontaxable_subtotal=");
        buffer.append(getNonTaxableSubtotal());
        buffer.append(',');
        buffer.append("other_subtotal=");
        buffer.append(getOtherSubtotal());
        buffer.append(',');
        buffer.append("other_subtotal_description=");
        buffer.append(getOtherSubtotalDescription());
        buffer.append(',');
        buffer.append("payment_status=");
        buffer.append(getPaymentStatus());
        buffer.append(',');
        buffer.append("payments_subtotal=");
        buffer.append(getPaymentsSubtotal());
        buffer.append(',');
        buffer.append("pk=");
        buffer.append(getTransactionId());
        buffer.append(',');
        buffer.append("raw_discount=");
        buffer.append(getRawDiscount());
        buffer.append(',');
        buffer.append("shipping_subtotal=");
        buffer.append(getShippingSubtotal());
        buffer.append(',');
        buffer.append("signature_image=");
        buffer.append(getSignatureImage());
        buffer.append(',');
        buffer.append("subtotal=");
        buffer.append(getSubtotal());
        buffer.append(',');
        buffer.append("tax1_subtotal=");
        buffer.append(getTax1Subtotal());
        buffer.append(',');
        buffer.append("tax2_subtotal=");
        buffer.append(getTax2Subtotal());
        buffer.append(',');
        buffer.append("taxable_subtotal=");
        buffer.append(getTaxableSubtotal());
        buffer.append(',');
        buffer.append("taxrate1=");
        buffer.append(getTaxRate1());
        buffer.append(',');
        buffer.append("taxrate2=");
        buffer.append(getTaxRate2());
        buffer.append(',');
        buffer.append("ticket_id=");
        buffer.append(getTicketId());
        buffer.append(',');
        buffer.append("tip_subtotal=");
        buffer.append(getTipSubtotal());
        buffer.append(',');
        buffer.append("total=");
        buffer.append(getTotal());
        buffer.append(',');
        buffer.append("transaction_date=");
        buffer.append(getTransactionDate());
        buffer.append(',');
        buffer.append("transaction_type=");
        buffer.append(getTransactionType());
        buffer.append(']');
        return buffer.toString();
    }


    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }


    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
    
    public List<TransactionNote> getNotes() {
        return notes;
    }
    
    public Contact getContact() {
        return contact;
    }

}
