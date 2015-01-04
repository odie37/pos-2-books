package se.budohoor.economics.pos2books.tool.membershipinvoicer;

public class Customer {
    private String name;
    private String email;
    private String address;
    private String zip;
    private String city;
    
    public Customer() {
        super();
    }
    
    public Customer(MemberData mData) {
        super();
        if(mData.getParent() != null) {
            this.name = mData.getParent();
        } else {
            this.name = mData.getName();
        }
        this.email = mData.getEmail();
        this.address = mData.getAddress();
        this.zip = mData.getZipCode();
        this.city = mData.getCity();
    }

    public Customer(String name, String email, String address, String zip, String city) {
        super();
        this.name = name;
        this.email = email;
        this.address = address;
        this.zip = zip;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
