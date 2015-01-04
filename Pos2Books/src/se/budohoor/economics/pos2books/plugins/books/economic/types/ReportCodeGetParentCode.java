
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
 *         &lt;element name="reportCodeHandle" type="{http://e-conomic.com}ReportCodeHandle" minOccurs="0"/>
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
    "reportCodeHandle"
})
@XmlRootElement(name = "ReportCode_GetParentCode")
public class ReportCodeGetParentCode {

    protected ReportCodeHandle reportCodeHandle;

    /**
     * Gets the value of the reportCodeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCodeHandle }
     *     
     */
    public ReportCodeHandle getReportCodeHandle() {
        return reportCodeHandle;
    }

    /**
     * Sets the value of the reportCodeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCodeHandle }
     *     
     */
    public void setReportCodeHandle(ReportCodeHandle value) {
        this.reportCodeHandle = value;
    }

}
