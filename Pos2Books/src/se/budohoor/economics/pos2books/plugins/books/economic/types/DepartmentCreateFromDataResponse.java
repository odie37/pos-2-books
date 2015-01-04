
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
 *         &lt;element name="Department_CreateFromDataResult" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
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
    "departmentCreateFromDataResult"
})
@XmlRootElement(name = "Department_CreateFromDataResponse")
public class DepartmentCreateFromDataResponse {

    @XmlElement(name = "Department_CreateFromDataResult")
    protected DepartmentHandle departmentCreateFromDataResult;

    /**
     * Gets the value of the departmentCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentHandle }
     *     
     */
    public DepartmentHandle getDepartmentCreateFromDataResult() {
        return departmentCreateFromDataResult;
    }

    /**
     * Sets the value of the departmentCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentHandle }
     *     
     */
    public void setDepartmentCreateFromDataResult(DepartmentHandle value) {
        this.departmentCreateFromDataResult = value;
    }

}
