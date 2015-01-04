
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
 *         &lt;element name="ReportCodeSet_GetDataResult" type="{http://e-conomic.com}ReportCodeSetData" minOccurs="0"/>
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
    "reportCodeSetGetDataResult"
})
@XmlRootElement(name = "ReportCodeSet_GetDataResponse")
public class ReportCodeSetGetDataResponse {

    @XmlElement(name = "ReportCodeSet_GetDataResult")
    protected ReportCodeSetData reportCodeSetGetDataResult;

    /**
     * Gets the value of the reportCodeSetGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCodeSetData }
     *     
     */
    public ReportCodeSetData getReportCodeSetGetDataResult() {
        return reportCodeSetGetDataResult;
    }

    /**
     * Sets the value of the reportCodeSetGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCodeSetData }
     *     
     */
    public void setReportCodeSetGetDataResult(ReportCodeSetData value) {
        this.reportCodeSetGetDataResult = value;
    }

}
