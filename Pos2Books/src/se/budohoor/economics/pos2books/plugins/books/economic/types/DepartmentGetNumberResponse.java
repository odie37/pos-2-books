
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
 *         &lt;element name="Department_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "departmentGetNumberResult"
})
@XmlRootElement(name = "Department_GetNumberResponse")
public class DepartmentGetNumberResponse {

    @XmlElement(name = "Department_GetNumberResult")
    protected int departmentGetNumberResult;

    /**
     * Gets the value of the departmentGetNumberResult property.
     * 
     */
    public int getDepartmentGetNumberResult() {
        return departmentGetNumberResult;
    }

    /**
     * Sets the value of the departmentGetNumberResult property.
     * 
     */
    public void setDepartmentGetNumberResult(int value) {
        this.departmentGetNumberResult = value;
    }

}
