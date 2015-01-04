
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
 *         &lt;element name="ReportCodeSet_GetCodesResult" type="{http://e-conomic.com}ArrayOfReportCodeHandle" minOccurs="0"/>
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
    "reportCodeSetGetCodesResult"
})
@XmlRootElement(name = "ReportCodeSet_GetCodesResponse")
public class ReportCodeSetGetCodesResponse {

    @XmlElement(name = "ReportCodeSet_GetCodesResult")
    protected ArrayOfReportCodeHandle reportCodeSetGetCodesResult;

    /**
     * Gets the value of the reportCodeSetGetCodesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReportCodeHandle }
     *     
     */
    public ArrayOfReportCodeHandle getReportCodeSetGetCodesResult() {
        return reportCodeSetGetCodesResult;
    }

    /**
     * Sets the value of the reportCodeSetGetCodesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReportCodeHandle }
     *     
     */
    public void setReportCodeSetGetCodesResult(ArrayOfReportCodeHandle value) {
        this.reportCodeSetGetCodesResult = value;
    }

}
