
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPriceHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPriceHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPriceHandle", propOrder = {
    "id1",
    "id2"
})
public class ProductPriceHandle {

    @XmlElement(name = "Id1")
    protected String id1;
    @XmlElement(name = "Id2")
    protected String id2;

    /**
     * Gets the value of the id1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId1() {
        return id1;
    }

    /**
     * Sets the value of the id1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId1(String value) {
        this.id1 = value;
    }

    /**
     * Gets the value of the id2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId2(String value) {
        this.id2 = value;
    }

}
