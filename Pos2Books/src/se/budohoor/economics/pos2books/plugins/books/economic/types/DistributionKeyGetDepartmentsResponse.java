
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
 *         &lt;element name="DistributionKey_GetDepartmentsResult" type="{http://e-conomic.com}ArrayOfDepartmentHandle" minOccurs="0"/>
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
    "distributionKeyGetDepartmentsResult"
})
@XmlRootElement(name = "DistributionKey_GetDepartmentsResponse")
public class DistributionKeyGetDepartmentsResponse {

    @XmlElement(name = "DistributionKey_GetDepartmentsResult")
    protected ArrayOfDepartmentHandle distributionKeyGetDepartmentsResult;

    /**
     * Gets the value of the distributionKeyGetDepartmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public ArrayOfDepartmentHandle getDistributionKeyGetDepartmentsResult() {
        return distributionKeyGetDepartmentsResult;
    }

    /**
     * Sets the value of the distributionKeyGetDepartmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public void setDistributionKeyGetDepartmentsResult(ArrayOfDepartmentHandle value) {
        this.distributionKeyGetDepartmentsResult = value;
    }

}
