public class Contact {
    String firstname, lastname, address, city, state, email;
    int zip;
    long phoneno;

    public Contact(String firstname, String lastname, String address, String city, String state, int zip,
                   long phoneno, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneno = phoneno;
        this.email = email;
    }

}