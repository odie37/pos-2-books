
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfScannedDocumentHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfScannedDocumentHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScannedDocumentHandle" type="{http://e-conomic.com}ScannedDocumentHandle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfScannedDocumentHandle", propOrder = {
    "scannedDocumentHandle"
})
public class ArrayOfScannedDocumentHandle {

    @XmlElement(name = "ScannedDocumentHandle", nillable = true)
    protected List<ScannedDocumentHandle> scannedDocumentHandle;

    /**
     * Gets the value of the scannedDocumentHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scannedDocumentHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScannedDocumentHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScannedDocumentHandle }
     * 
     * 
     */
    public List<ScannedDocumentHandle> getScannedDocumentHandle() {
        if (scannedDocumentHandle == null) {
            scannedDocumentHandle = new ArrayList<ScannedDocumentHandle>();
        }
        return this.scannedDocumentHandle;
    }

}
