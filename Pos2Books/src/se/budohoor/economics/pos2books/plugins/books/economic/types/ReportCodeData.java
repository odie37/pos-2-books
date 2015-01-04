
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportCodeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportCodeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}ReportCodeHandle" minOccurs="0"/>
 *         &lt;element name="Id1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCodeHandle" type="{http://e-conomic.com}ReportCodeHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCodeData", propOrder = {
    "handle",
    "id1",
    "id2",
    "code",
    "fullCode",
    "parentCodeHandle"
})
public class ReportCodeData {

    @XmlElement(name = "Handle")
    protected ReportCodeHandle handle;
    @XmlElement(name = "Id1")
    protected int id1;
    @XmlElement(name = "Id2")
    protected int id2;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "FullCode")
    protected String fullCode;
    @XmlElement(name = "ParentCodeHandle")
    protected ReportCodeHandle parentCodeHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCodeHandle }
     *     
     */
    public ReportCodeHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCodeHandle }
     *     
     */
    public void setHandle(ReportCodeHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the id1 property.
     * 
     */
    public int getId1() {
        return id1;
    }

    /**
     * Sets the value of the id1 property.
     * 
     */
    public void setId1(int value) {
        this.id1 = value;
    }

    /**
     * Gets the value of the id2 property.
     * 
     */
    public int getId2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     */
    public void setId2(int value) {
        this.id2 = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the fullCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullCode() {
        return fullCode;
    }

    /**
     * Sets the value of the fullCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullCode(String value) {
        this.fullCode = value;
    }

    /**
     * Gets the value of the parentCodeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCodeHandle }
     *     
     */
    public ReportCodeHandle getParentCodeHandle() {
        return parentCodeHandle;
    }

    /**
     * Sets the value of the parentCodeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCodeHandle }
     *     
     */
    public void setParentCodeHandle(ReportCodeHandle value) {
        this.parentCodeHandle = value;
    }

}
