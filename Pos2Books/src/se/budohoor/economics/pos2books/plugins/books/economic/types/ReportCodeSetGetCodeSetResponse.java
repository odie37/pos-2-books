
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
 *         &lt;element name="ReportCodeSet_GetCodeSetResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "reportCodeSetGetCodeSetResult"
})
@XmlRootElement(name = "ReportCodeSet_GetCodeSetResponse")
public class ReportCodeSetGetCodeSetResponse {

    @XmlElement(name = "ReportCodeSet_GetCodeSetResult")
    protected int reportCodeSetGetCodeSetResult;

    /**
     * Gets the value of the reportCodeSetGetCodeSetResult property.
     * 
     */
    public int getReportCodeSetGetCodeSetResult() {
        return reportCodeSetGetCodeSetResult;
    }

    /**
     * Sets the value of the reportCodeSetGetCodeSetResult property.
     * 
     */
    public void setReportCodeSetGetCodeSetResult(int value) {
        this.reportCodeSetGetCodeSetResult = value;
    }

}
