public class Address {
    
    private int houseNumber;
    
    private String street;
    
    private String town;
    
    private String postcode;
    
    private String country;
    
    public int getHouseNumber() {
        return houseNumber;
    }
    
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
    
    public String getPostcode() {
        return postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return houseNumber + " " + street + " " + town + " " + postcode + " " + country;
    }

    
}