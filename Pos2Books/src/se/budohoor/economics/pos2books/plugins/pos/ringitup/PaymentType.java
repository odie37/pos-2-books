package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "PaymentType.findAll", query = "select o from PaymentType o") })
@Table(name = "\"payment_types\"")
public class PaymentType implements Serializable {
    @Id
    @Column(name = "pk", nullable = false)
    private int paymentTypeId;
    @Column(name = "payment_type_name")
    private String paymentTypeName;

    public PaymentType() {
    }

    public PaymentType(int paymentTypeId, String paymentTypeName) {
        this.paymentTypeId = paymentTypeId;
        this.paymentTypeName = paymentTypeName;
    }


    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("paymentTypeId=");
        buffer.append(getPaymentTypeId());
        buffer.append(',');
        buffer.append("paymentTypeName=");
        buffer.append(getPaymentTypeName());
        buffer.append(']');
        return buffer.toString();
    }
}
