
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
 *         &lt;element name="keyFigureCodeHandle" type="{http://e-conomic.com}KeyFigureCodeHandle" minOccurs="0"/>
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
    "keyFigureCodeHandle"
})
@XmlRootElement(name = "KeyFigureCode_GetAccounts")
public class KeyFigureCodeGetAccounts {

    protected KeyFigureCodeHandle keyFigureCodeHandle;

    /**
     * Gets the value of the keyFigureCodeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFigureCodeHandle }
     *     
     */
    public KeyFigureCodeHandle getKeyFigureCodeHandle() {
        return keyFigureCodeHandle;
    }

    /**
     * Sets the value of the keyFigureCodeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFigureCodeHandle }
     *     
     */
    public void setKeyFigureCodeHandle(KeyFigureCodeHandle value) {
        this.keyFigureCodeHandle = value;
    }

}
