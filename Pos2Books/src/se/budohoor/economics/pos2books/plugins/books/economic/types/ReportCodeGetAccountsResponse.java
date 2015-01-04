
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
 *         &lt;element name="ReportCode_GetAccountsResult" type="{http://e-conomic.com}ArrayOfAccountHandle" minOccurs="0"/>
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
    "reportCodeGetAccountsResult"
})
@XmlRootElement(name = "ReportCode_GetAccountsResponse")
public class ReportCodeGetAccountsResponse {

    @XmlElement(name = "ReportCode_GetAccountsResult")
    protected ArrayOfAccountHandle reportCodeGetAccountsResult;

    /**
     * Gets the value of the reportCodeGetAccountsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountHandle }
     *     
     */
    public ArrayOfAccountHandle getReportCodeGetAccountsResult() {
        return reportCodeGetAccountsResult;
    }

    /**
     * Sets the value of the reportCodeGetAccountsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountHandle }
     *     
     */
    public void setReportCodeGetAccountsResult(ArrayOfAccountHandle value) {
        this.reportCodeGetAccountsResult = value;
    }

}
