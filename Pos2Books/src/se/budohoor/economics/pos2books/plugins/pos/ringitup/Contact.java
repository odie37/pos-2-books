package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "Contact.findAll", query = "select o from Contact o") })
@Table(name = "\"contacts\"")
public class Contact implements Serializable {
    @Column(name = "apartment")
    private String apartment;
    @Column(name = "apartment2")
    private String apartment2;
    @Column(name = "city")
    private String city;
    @Column(name = "city2")
    private String city2;
    @Column(name = "company_name")
    private String company_name;
    @Id
    @Column(name = "pk")
    private int contactId;
    @Column(name = "contact_display_name")
    private int contact_display_name;
    @Column(name = "contact_type")
    private int contact_type;
    @Column(name = "country")
    private String country;
    @Column(name = "country2")
    private String country2;
    @Column(name = "email")
    private String email;
    @Column(name = "email2")
    private String email2;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "image_exists")
    private int imageExists;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "misc")
    private String misc;
    @Column(name = "override_global_taxrates")
    private int overrideGlobalTaxRates;
    @Column(name = "phone")
    private String phone;
    @Column(name = "phone2")
    private String phone2;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "postal_code2")
    private String postalCode2;
    @Column(name = "state")
    private String state;
    @Column(name = "state2")
    private String state2;
    @Column(name = "street")
    private String street;
    @Column(name = "street2")
    private String street2;
    @Column(name = "taxrate1")
    private double taxRate1;
    @Column(name = "taxrate2")
    private double taxRate2;
    @Column(name = "wholesale_contact")
    private int wholesaleContact;

    public Contact() {
    }

    public Contact(String apartment, String apartment2, String city, String city2, String company_name, int contactId,
                   int contact_display_name, int contact_type, String country, String country2, String email,
                   String email2, String firstName, int imageExists, String lastName, String misc,
                   int overrideGlobalTaxRates, String phone, String phone2, String postalCode, String postalCode2,
                   String state, String state2, String street, String street2, double taxRate1, double taxRate2,
                   int wholesaleContact) {
        this.apartment = apartment;
        this.apartment2 = apartment2;
        this.city = city;
        this.city2 = city2;
        this.company_name = company_name;
        this.contactId = contactId;
        this.contact_display_name = contact_display_name;
        this.contact_type = contact_type;
        this.country = country;
        this.country2 = country2;
        this.email = email;
        this.email2 = email2;
        this.firstName = firstName;
        this.imageExists = imageExists;
        this.lastName = lastName;
        this.misc = misc;
        this.overrideGlobalTaxRates = overrideGlobalTaxRates;
        this.phone = phone;
        this.phone2 = phone2;
        this.postalCode = postalCode;
        this.postalCode2 = postalCode2;
        this.state = state;
        this.state2 = state2;
        this.street = street;
        this.street2 = street2;
        this.taxRate1 = taxRate1;
        this.taxRate2 = taxRate2;
        this.wholesaleContact = wholesaleContact;
    }


    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getApartment2() {
        return apartment2;
    }

    public void setApartment2(String apartment2) {
        this.apartment2 = apartment2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getContact_display_name() {
        return contact_display_name;
    }

    public void setContact_display_name(int contact_display_name) {
        this.contact_display_name = contact_display_name;
    }

    public int getContact_type() {
        return contact_type;
    }

    public void setContact_type(int contact_type) {
        this.contact_type = contact_type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getImageExists() {
        return imageExists;
    }

    public void setImageExists(int imageExists) {
        this.imageExists = imageExists;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public int getOverrideGlobalTaxRates() {
        return overrideGlobalTaxRates;
    }

    public void setOverrideGlobalTaxRates(int overrideGlobalTaxRates) {
        this.overrideGlobalTaxRates = overrideGlobalTaxRates;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode2() {
        return postalCode2;
    }

    public void setPostalCode2(String postalCode2) {
        this.postalCode2 = postalCode2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public double getTaxRate1() {
        return taxRate1;
    }

    public void setTaxRate1(double taxRate1) {
        this.taxRate1 = taxRate1;
    }

    public double getTaxRate2() {
        return taxRate2;
    }

    public void setTaxRate2(double taxRate2) {
        this.taxRate2 = taxRate2;
    }

    public int getWholesaleContact() {
        return wholesaleContact;
    }

    public void setWholesaleContact(int wholesaleContact) {
        this.wholesaleContact = wholesaleContact;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()+"@"+Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("apartment=");
        buffer.append(getApartment());
        buffer.append(',');
        buffer.append("apartment2=");
        buffer.append(getApartment2());
        buffer.append(',');
        buffer.append("city=");
        buffer.append(getCity());
        buffer.append(',');
        buffer.append("city2=");
        buffer.append(getCity2());
        buffer.append(',');
        buffer.append("company_name=");
        buffer.append(getCompany_name());
        buffer.append(',');
        buffer.append("contactId=");
        buffer.append(getContactId());
        buffer.append(',');
        buffer.append("contact_display_name=");
        buffer.append(getContact_display_name());
        buffer.append(',');
        buffer.append("contact_type=");
        buffer.append(getContact_type());
        buffer.append(',');
        buffer.append("country=");
        buffer.append(getCountry());
        buffer.append(',');
        buffer.append("country2=");
        buffer.append(getCountry2());
        buffer.append(',');
        buffer.append("email=");
        buffer.append(getEmail());
        buffer.append(',');
        buffer.append("email2=");
        buffer.append(getEmail2());
        buffer.append(',');
        buffer.append("firstName=");
        buffer.append(getFirstName());
        buffer.append(',');
        buffer.append("imageExists=");
        buffer.append(getImageExists());
        buffer.append(',');
        buffer.append("lastName=");
        buffer.append(getLastName());
        buffer.append(',');
        buffer.append("misc=");
        buffer.append(getMisc());
        buffer.append(',');
        buffer.append("overrideGlobalTaxRates=");
        buffer.append(getOverrideGlobalTaxRates());
        buffer.append(',');
        buffer.append("phone=");
        buffer.append(getPhone());
        buffer.append(',');
        buffer.append("phone2=");
        buffer.append(getPhone2());
        buffer.append(',');
        buffer.append("postalCode=");
        buffer.append(getPostalCode());
        buffer.append(',');
        buffer.append("postalCode2=");
        buffer.append(getPostalCode2());
        buffer.append(',');
        buffer.append("state=");
        buffer.append(getState());
        buffer.append(',');
        buffer.append("state2=");
        buffer.append(getState2());
        buffer.append(',');
        buffer.append("street=");
        buffer.append(getStreet());
        buffer.append(',');
        buffer.append("street2=");
        buffer.append(getStreet2());
        buffer.append(',');
        buffer.append("taxRate1=");
        buffer.append(getTaxRate1());
        buffer.append(',');
        buffer.append("taxRate2=");
        buffer.append(getTaxRate2());
        buffer.append(',');
        buffer.append("wholesaleContact=");
        buffer.append(getWholesaleContact());
        buffer.append(']');
        return buffer.toString();
    }
}
