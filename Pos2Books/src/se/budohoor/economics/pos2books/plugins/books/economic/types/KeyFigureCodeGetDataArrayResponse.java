
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
 *         &lt;element name="KeyFigureCode_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfKeyFigureCodeData" minOccurs="0"/>
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
    "keyFigureCodeGetDataArrayResult"
})
@XmlRootElement(name = "KeyFigureCode_GetDataArrayResponse")
public class KeyFigureCodeGetDataArrayResponse {

    @XmlElement(name = "KeyFigureCode_GetDataArrayResult")
    protected ArrayOfKeyFigureCodeData keyFigureCodeGetDataArrayResult;

    /**
     * Gets the value of the keyFigureCodeGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyFigureCodeData }
     *     
     */
    public ArrayOfKeyFigureCodeData getKeyFigureCodeGetDataArrayResult() {
        return keyFigureCodeGetDataArrayResult;
    }

    /**
     * Sets the value of the keyFigureCodeGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyFigureCodeData }
     *     
     */
    public void setKeyFigureCodeGetDataArrayResult(ArrayOfKeyFigureCodeData value) {
        this.keyFigureCodeGetDataArrayResult = value;
    }

}
