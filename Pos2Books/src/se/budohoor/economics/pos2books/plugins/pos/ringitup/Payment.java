package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "Payment.findAll", query = "select o from Payment o") })
@Table(name = "\"payments\"")
public class Payment implements Serializable {
    @Column(name = "memo")
    private String memo;
    @Column(name = "payment_amount")
    private double paymentAmount;
    @Column(name = "payment_date")
    private float paymentDate;
    @Id
    @Column(name = "pk")
    private int paymentId;
    @ManyToOne
    @JoinColumn(name = "fk_transaction_id", referencedColumnName = "pk")
    private Transaction transaction;
    @ManyToOne
    @JoinColumn(name = "fk_payment_type", referencedColumnName = "pk")
    private PaymentType paymentType;

    public Payment() {
    }

    public Payment(String memo, double paymentAmount, float paymentDate, int paymentId, PaymentType paymentType) {
        this.memo = memo;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.paymentId = paymentId;
        this.paymentType = paymentType;
    }


    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPaymentDate() {
        return new Date(new Double(paymentDate * 1000).longValue());
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate.getTime()/1000;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("memo=");
        buffer.append(getMemo());
        buffer.append(',');
        buffer.append("paymentAmount=");
        buffer.append(getPaymentAmount());
        buffer.append(',');
        buffer.append("paymentDate=");
        buffer.append(getPaymentDate());
        buffer.append(',');
        buffer.append("paymentId=");
        buffer.append(getPaymentId());
        buffer.append(',');
        buffer.append("paymentType=");
        buffer.append(getPaymentType());
        buffer.append(']');
        return buffer.toString();
    }


    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

}
