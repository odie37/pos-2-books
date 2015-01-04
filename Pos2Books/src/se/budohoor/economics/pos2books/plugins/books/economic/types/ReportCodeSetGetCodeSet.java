
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="reportCodeSetHandle" type="{http://e-conomic.com}ReportCodeSetHandle" minOccurs="0"/>
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
    "reportCodeSetHandle"
})
@XmlRootElement(name = "ReportCodeSet_GetCodeSet")
public class ReportCodeSetGetCodeSet {

    protected ReportCodeSetHandle reportCodeSetHandle;

    /**
     * Gets the value of the reportCodeSetHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCodeSetHandle }
     *     
     */
    public ReportCodeSetHandle getReportCodeSetHandle() {
        return reportCodeSetHandle;
    }

    /**
     * Sets the value of the reportCodeSetHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCodeSetHandle }
     *     
     */
    public void setReportCodeSetHandle(ReportCodeSetHandle value) {
        this.reportCodeSetHandle = value;
    }

}
