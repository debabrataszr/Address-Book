import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of contacts :");
        int contact = sc.nextInt();
        Contact[] cArray = new Contact[contact];
        for (int i = 0; i < contact; i++) {
            System.out.println("Enter " + (i + 1) + "'s" + " First name-");
            String firstname = sc.next();
            System.out.println("Enter " + (i + 1) + "'s" + "Last name:");
            String lastname = sc.next();
            System.out.println("Enter " + (i + 1) + "'s" + " Address:");
            String address = sc.next();
            System.out.println("Enter " + (i + 1) + "'s" + "City:");
            String city = sc.next();
            System.out.println("Enter " + (i + 1) + "'s" + "State:");
            String state = sc.next();
            System.out.println("Enter " + (i + 1) + "'s" + "Zip code:");
            int zip = sc.nextInt();
            System.out.println("Enter " + (i + 1) + "'s" + " Phone no.:");
            long phoneno = sc.nextInt();
            System.out.println("Enter " + (i + 1) + "'s" + "E-mail:");
            String email = sc.next();
            Contact c = new Contact(firstname, lastname, address, city, state, zip, phoneno, email);
            cArray[i] = c;
        }

        for (int i = 0; i < contact; i++) {
            System.out.println(cArray[i].firstname + " " + cArray[i].lastname + " " + cArray[i].address + " "
                    + cArray[i].city + " " + cArray[i].state + " " + cArray[i].zip + " " + cArray[i].phoneno + " " + cArray[i].email);
        }
    }
}
