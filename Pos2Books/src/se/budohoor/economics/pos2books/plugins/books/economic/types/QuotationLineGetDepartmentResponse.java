
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotationLine_GetDepartmentResult" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "quotationLineGetDepartmentResult"
})
@XmlRootElement(name = "QuotationLine_GetDepartmentResponse")
public class QuotationLineGetDepartmentResponse {

    @XmlElement(name = "QuotationLine_GetDepartmentResult")
    protected DepartmentHandle quotationLineGetDepartmentResult;

    /**
     * Gets the value of the quotationLineGetDepartmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentHandle }
     *     
     */
    public DepartmentHandle getQuotationLineGetDepartmentResult() {
        return quotationLineGetDepartmentResult;
    }

    /**
     * Sets the value of the quotationLineGetDepartmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentHandle }
     *     
     */
    public void setQuotationLineGetDepartmentResult(DepartmentHandle value) {
        this.quotationLineGetDepartmentResult = value;
    }

}
