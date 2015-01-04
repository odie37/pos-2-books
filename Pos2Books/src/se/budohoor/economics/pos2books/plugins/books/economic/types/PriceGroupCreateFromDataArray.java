
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
 *         &lt;element name="dataArray" type="{http://e-conomic.com}ArrayOfPriceGroupData" minOccurs="0"/>
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
    "dataArray"
})
@XmlRootElement(name = "PriceGroup_CreateFromDataArray")
public class PriceGroupCreateFromDataArray {

    protected ArrayOfPriceGroupData dataArray;

    /**
     * Gets the value of the dataArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceGroupData }
     *     
     */
    public ArrayOfPriceGroupData getDataArray() {
        return dataArray;
    }

    /**
     * Sets the value of the dataArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceGroupData }
     *     
     */
    public void setDataArray(ArrayOfPriceGroupData value) {
        this.dataArray = value;
    }

}
