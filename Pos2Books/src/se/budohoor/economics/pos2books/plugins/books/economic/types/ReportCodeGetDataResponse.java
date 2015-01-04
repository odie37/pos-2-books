
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
 *         &lt;element name="ReportCode_GetDataResult" type="{http://e-conomic.com}ReportCodeData" minOccurs="0"/>
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
    "reportCodeGetDataResult"
})
@XmlRootElement(name = "ReportCode_GetDataResponse")
public class ReportCodeGetDataResponse {

    @XmlElement(name = "ReportCode_GetDataResult")
    protected ReportCodeData reportCodeGetDataResult;

    /**
     * Gets the value of the reportCodeGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCodeData }
     *     
     */
    public ReportCodeData getReportCodeGetDataResult() {
        return reportCodeGetDataResult;
    }

    /**
     * Sets the value of the reportCodeGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCodeData }
     *     
     */
    public void setReportCodeGetDataResult(ReportCodeData value) {
        this.reportCodeGetDataResult = value;
    }

}
