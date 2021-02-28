package com.cs401;

/**
 * AddressBook object with variables firstname, lastName, street , City, State,
 * phoneNumber, ZipCode, email,.
 */
public class AddressEntry {
    // Init @param for AddressEntry Class
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String phoneNumber;
    private String zipcode;
    private String email;


   // Constructor for AddressEntry
   AddressEntry(String newfirstName, String newlastName, String newstreet , String newcity, String newstate, String newzipcode,String newphoneNumber,
                  String newemail) {


        this.firstName = newfirstName;
        this.lastName = newlastName;
        this.street= newstreet;
        this.city = newcity;
        this.state = newstate;
        this.phoneNumber = newphoneNumber;
        this.zipcode = newzipcode;
        this.email = newemail;

   }



    /**
     * return the first name
     */
    public String getfirstName() {
        return this.firstName;
    }

    /**
     * Set first name
     */
    public void setfirstName(String newfirstName) {
        this.firstName = newfirstName;
    }

    /**
     * return the last name
     */
    public String getlastName() {
        return this.lastName;
    }

    /**
     * set last name
     */
    public void setlastName(String newlastName) {
        this.lastName = newlastName;
    }

    /**
     * return the
     */
    public String get() {
        return this.street;
    }

    /**
     * Set number and street
     */
    public void set(String newStreet) {
        this.street = newStreet;
    }

    /**
     * return the City
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Set the city
     */
    public void setCity(String newCity) {
        this.city = newCity;
    }

    /**
     * return the state
     */
    public String getState() {
        return this.state;
    }

    /**
     * set the state
     */
    public void setState(String newState) {
        this.state = newState;
    }

    /**
     * return the zipcode
     */
    public String getZipCode() {
        return this.zipcode;
    }

    /**
     * set the zipcode
     */
    public void setZipCode(String newZipCode) {
        this.zipcode = newZipCode;
    }

    /**
     * return the phone number
     */
    public String getphoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set Phone Number
     */
    public void setphoneNumber(String newphoneNum) {
        this.phoneNumber = newphoneNum;
    }

    /**
     * return the email
     */
    public String getemail() {
        return this.email;
    }

    /**
     * set the email
     */
    public void setemail(String newemail) {
        this.email = newemail;
    }

    /**
     * toString all of the objects
     */
    public String toString() {
        return firstName + "\n" + lastName + "\n" + street  + "\n" + city + "\n" + state + "\n" + zipcode + "\n"  + phoneNumber +
                "\n"  + email;

    }

}
