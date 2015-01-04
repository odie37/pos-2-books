
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
 *         &lt;element name="KeyFigureCode_GetDataResult" type="{http://e-conomic.com}KeyFigureCodeData" minOccurs="0"/>
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
    "keyFigureCodeGetDataResult"
})
@XmlRootElement(name = "KeyFigureCode_GetDataResponse")
public class KeyFigureCodeGetDataResponse {

    @XmlElement(name = "KeyFigureCode_GetDataResult")
    protected KeyFigureCodeData keyFigureCodeGetDataResult;

    /**
     * Gets the value of the keyFigureCodeGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFigureCodeData }
     *     
     */
    public KeyFigureCodeData getKeyFigureCodeGetDataResult() {
        return keyFigureCodeGetDataResult;
    }

    /**
     * Sets the value of the keyFigureCodeGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFigureCodeData }
     *     
     */
    public void setKeyFigureCodeGetDataResult(KeyFigureCodeData value) {
        this.keyFigureCodeGetDataResult = value;
    }

}
