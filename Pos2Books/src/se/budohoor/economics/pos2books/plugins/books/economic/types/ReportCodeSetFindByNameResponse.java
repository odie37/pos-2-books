
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
 *         &lt;element name="ReportCodeSet_FindByNameResult" type="{http://e-conomic.com}ArrayOfReportCodeSetHandle" minOccurs="0"/>
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
    "reportCodeSetFindByNameResult"
})
@XmlRootElement(name = "ReportCodeSet_FindByNameResponse")
public class ReportCodeSetFindByNameResponse {

    @XmlElement(name = "ReportCodeSet_FindByNameResult")
    protected ArrayOfReportCodeSetHandle reportCodeSetFindByNameResult;

    /**
     * Gets the value of the reportCodeSetFindByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReportCodeSetHandle }
     *     
     */
    public ArrayOfReportCodeSetHandle getReportCodeSetFindByNameResult() {
        return reportCodeSetFindByNameResult;
    }

    /**
     * Sets the value of the reportCodeSetFindByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReportCodeSetHandle }
     *     
     */
    public void setReportCodeSetFindByNameResult(ArrayOfReportCodeSetHandle value) {
        this.reportCodeSetFindByNameResult = value;
    }

}
