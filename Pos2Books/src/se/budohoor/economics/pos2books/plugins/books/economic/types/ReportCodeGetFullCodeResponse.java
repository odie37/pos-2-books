
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
 *         &lt;element name="ReportCode_GetFullCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "reportCodeGetFullCodeResult"
})
@XmlRootElement(name = "ReportCode_GetFullCodeResponse")
public class ReportCodeGetFullCodeResponse {

    @XmlElement(name = "ReportCode_GetFullCodeResult")
    protected String reportCodeGetFullCodeResult;

    /**
     * Gets the value of the reportCodeGetFullCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportCodeGetFullCodeResult() {
        return reportCodeGetFullCodeResult;
    }

    /**
     * Sets the value of the reportCodeGetFullCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportCodeGetFullCodeResult(String value) {
        this.reportCodeGetFullCodeResult = value;
    }

}
