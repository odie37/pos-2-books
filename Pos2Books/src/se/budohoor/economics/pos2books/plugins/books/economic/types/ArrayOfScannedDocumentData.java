
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfScannedDocumentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfScannedDocumentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScannedDocumentData" type="{http://e-conomic.com}ScannedDocumentData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfScannedDocumentData", propOrder = {
    "scannedDocumentData"
})
public class ArrayOfScannedDocumentData {

    @XmlElement(name = "ScannedDocumentData", nillable = true)
    protected List<ScannedDocumentData> scannedDocumentData;

    /**
     * Gets the value of the scannedDocumentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scannedDocumentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScannedDocumentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScannedDocumentData }
     * 
     * 
     */
    public List<ScannedDocumentData> getScannedDocumentData() {
        if (scannedDocumentData == null) {
            scannedDocumentData = new ArrayList<ScannedDocumentData>();
        }
        return this.scannedDocumentData;
    }

}
