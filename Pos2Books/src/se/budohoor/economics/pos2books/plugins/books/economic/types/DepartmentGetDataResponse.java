
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
 *         &lt;element name="Department_GetDataResult" type="{http://e-conomic.com}DepartmentData" minOccurs="0"/>
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
    "departmentGetDataResult"
})
@XmlRootElement(name = "Department_GetDataResponse")
public class DepartmentGetDataResponse {

    @XmlElement(name = "Department_GetDataResult")
    protected DepartmentData departmentGetDataResult;

    /**
     * Gets the value of the departmentGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentData }
     *     
     */
    public DepartmentData getDepartmentGetDataResult() {
        return departmentGetDataResult;
    }

    /**
     * Sets the value of the departmentGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentData }
     *     
     */
    public void setDepartmentGetDataResult(DepartmentData value) {
        this.departmentGetDataResult = value;
    }

}
