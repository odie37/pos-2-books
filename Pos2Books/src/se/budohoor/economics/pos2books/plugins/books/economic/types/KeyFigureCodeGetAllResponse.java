
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
 *         &lt;element name="KeyFigureCode_GetAllResult" type="{http://e-conomic.com}ArrayOfKeyFigureCodeHandle" minOccurs="0"/>
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
    "keyFigureCodeGetAllResult"
})
@XmlRootElement(name = "KeyFigureCode_GetAllResponse")
public class KeyFigureCodeGetAllResponse {

    @XmlElement(name = "KeyFigureCode_GetAllResult")
    protected ArrayOfKeyFigureCodeHandle keyFigureCodeGetAllResult;

    /**
     * Gets the value of the keyFigureCodeGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyFigureCodeHandle }
     *     
     */
    public ArrayOfKeyFigureCodeHandle getKeyFigureCodeGetAllResult() {
        return keyFigureCodeGetAllResult;
    }

    /**
     * Sets the value of the keyFigureCodeGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyFigureCodeHandle }
     *     
     */
    public void setKeyFigureCodeGetAllResult(ArrayOfKeyFigureCodeHandle value) {
        this.keyFigureCodeGetAllResult = value;
    }

}
