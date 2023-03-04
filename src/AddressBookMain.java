public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Contact c = new Contact();

        c.firstname = "Debabrata";
        c.lastname = "Sahoo";
        c.address = "Koel Nagar";
        c.city = "Rourkela";
        c.state = "Odisha";
        c.email = "debabratas@xyz.com";
        c.zip = 751025;
        c.phoneno = 797805896;

        System.out.println("First name:"+c.firstname);
        System.out.println("Last name:"+c.lastname);
        System.out.println("Addres:"+c.address);
        System.out.println("City:"+c.city);
        System.out.println("State:"+c.state);
        System.out.println("E-mail:"+c.email);
        System.out.println("Zip code:"+c.zip);
        System.out.println("Phone no.:"+c.phoneno);
    }
}
