/**
 * It represents the Address Entry object
 * which has all of the required attributes.
 *
 * @version 1.0
 *
 */
public class AddressEntry {

    // Attributes..
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * Constructor to create Address
     * object.
     *
     * @param firstName field
     * @param lastName field
     * @param street field
     * @param city field
     * @param state field
     * @param zip field
     * @param phone field
     * @param email field
     */
    public AddressEntry(String firstName, String lastName, String street, String city,
                        String state, int zip, String phone, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;

    }

    /**
     * Empty Constructor.
     */
    public AddressEntry() {

        this("", "", "", "", "", 0, "", "");

    }

    /**
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return street field
     */
    public String getStreet() {
        return street;
    }

    /**
     * @return city field
     */
    public String getCity() {
        return city;
    }

    /**
     * @return state field
     */
    public String getState() {
        return state;
    }

    /**
     * @return zip field
     */
    public int getZip() {
        return zip;
    }

    /**
     * @return phone field
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return email field
     */
    public String getEmail() {
        return email;
    }

    /**
     * To set the new value of firstName
     *
     * @param firstName field
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * To set the new value of lastName
     *
     * @param lastName field
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * To set the new value of street
     *
     * @param street field
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * To set the new value of city
     *
     * @param city field
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * To set the new value of state
     *
     * @param state field
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * To set the new value of zip
     *
     * @param zip field
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * To set the new value of phone
     *
     * @param phone field
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * To set the new value of email
     *
     * @param email field
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return firstName+" "+lastName+"\n"+
                "  "+street+"\n"+
                "  "+city+", "+state+" "+zip+"\n"+
                "  "+email+"\n"+
                "  "+phone;

    }

}
