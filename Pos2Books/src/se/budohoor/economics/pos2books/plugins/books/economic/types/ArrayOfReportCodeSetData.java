
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfReportCodeSetData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReportCodeSetData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportCodeSetData" type="{http://e-conomic.com}ReportCodeSetData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReportCodeSetData", propOrder = {
    "reportCodeSetData"
})
public class ArrayOfReportCodeSetData {

    @XmlElement(name = "ReportCodeSetData", nillable = true)
    protected List<ReportCodeSetData> reportCodeSetData;

    /**
     * Gets the value of the reportCodeSetData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportCodeSetData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportCodeSetData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportCodeSetData }
     * 
     * 
     */
    public List<ReportCodeSetData> getReportCodeSetData() {
        if (reportCodeSetData == null) {
            reportCodeSetData = new ArrayList<ReportCodeSetData>();
        }
        return this.reportCodeSetData;
    }

}
