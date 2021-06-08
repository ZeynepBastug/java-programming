package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    // constructor
    public Address(){
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "Unknown";
        state = " Unknown";
        zipCode = "00000";

        // CONSTRUCTOR IN JAVA
        // It is a special method that is called automatically each time the object of the class is created using new keyword
        // It does not have return type
        // It must be name as class Name
        // It is initialize the instance variables

    }

    public Address(String street, String city, String state, String zipCode){
        this.street = street;
        setStreet(street);
        this.city = city;
        this.state = state;

    }

    @Override   //optional
    public String toString(){
        return street + ", " + city + ", " + state + " " + zipCode;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR: Invalid street");
        }else {
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
