
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        System.out.println("Enter number of contacts :");
        int contact = sc.nextInt();
        Contact[] cArray = new Contact[contact];
        int result = 0;
        while (result != 4) {
            System.out.println("What to perform");
            System.out.println("1.Add, \n 2.Edit ,\n 3.Print,\n 4.Stop");
            result = sc.nextInt();
            switch (result) {
                case 1:
                    Add(contact, cArray);
                    break;
                case 2:
                    Edit(contact, cArray);
                    break;
                case 3:
                    Print(contact, cArray);
                    break;
                default:
                    Stop();
                    break;

            }
        }
    }

    public static void Add(int contact, Contact[] cArray) {
        for (int i = 0; i < contact; i++) {
            Contact c = new Contact();
            System.out.println("Enter " + (i + 1) + "'s" + " First name-");
            c.setFirstname(sc.next());
            System.out.println("Enter " + (i + 1) + "'s" + "Last name:");
            c.setLastname(sc.next());
            System.out.println("Enter " + (i + 1) + "'s" + " Address:");
            c.setAddress(sc.next());
            System.out.println("Enter " + (i + 1) + "'s" + "City:");
            c.setCity(sc.next());
            System.out.println("Enter " + (i + 1) + "'s" + "State:");
            c.setState(sc.next());
            System.out.println("Enter " + (i + 1) + "'s" + "Zip code:");
            c.setZip(sc.nextInt());
            System.out.println("Enter " + (i + 1) + "'s" + " Phone no.:");
            c.setPhoneno(sc.nextInt());
            System.out.println("Enter " + (i + 1) + "'s" + "E-mail:");
            c.setEmail(sc.next());

            cArray[i] = c;
        }
    }

    public static void Edit(int contact, Contact[] cArray) {
        System.out.println("What to edit :");
        System.out.println("firstname, lastname, address, state, contact,zip,email,phoneno");
        String toEdit = sc.next();
        if (toEdit.equals("firstname")) {
            System.out.println("First name to edit :");
            String oldFirstName = sc.next();
            for (int j = 0; j < contact; j++) {
                if (oldFirstName.equals(cArray[j].getFirstname())) {
                    System.out.println("Enter new first name :");
                    String newFirstName = sc.next();
                    cArray[j].setFirstname(newFirstName);
                }
            }
        }
        if (toEdit.equals("lastname")) {
            System.out.println("Last name to edit:");
            String oldLastName = sc.next();
            for (int j = 0; j < contact; j++) {
                if (oldLastName.equals(cArray[j].getFirstname())) {
                    System.out.println("enter new Lastname :");
                    cArray[j].setLastname(sc.next());
                }
            }
        }
        if (toEdit.equals("address")) {
            System.out.println("Address to edit :");
            String oldaddress = sc.next();
            for (int j = 0; j < contact; j++) {
                if (oldaddress.equals(cArray[j].getFirstname())) {
                    System.out.println("Enter new address :");
                    cArray[j].setAddress(sc.next());
                }
            }
        }
        if (toEdit.equals("city")) {
            System.out.println("City to edit :");
            String oldcity = sc.next();
            for (int j = 0; j < contact; j++) {
                if (oldcity.equals(cArray[j].getFirstname())) {
                    System.out.println("Enter new city :");
                    cArray[j].setCity(sc.next());
                }
            }
        }
        if (toEdit.equals("state")) {
            System.out.println("State to edit:");
            String oldstate = sc.next();
            for (int j = 0; j < contact; j++) {
                if (oldstate.equals(cArray[j].getFirstname())) {
                    System.out.println("Enter new state :");
                    cArray[j].setState(sc.next());
                }
            }
        }
        if (toEdit.equals("phone number")) {
            System.out.println("Phone number to edit:");
            String oldphoneno = sc.next();
            for (int j = 0; j < contact; j++) {
                if (oldphoneno.equals(cArray[j].getFirstname())) {
                    System.out.println("Enter new phone number :");
                    cArray[j].setPhoneno(sc.nextInt());
                }
            }
        }
        if (toEdit.equals("zipcode")) {
            System.out.println("Zip code to edit:");
            String oldzip = sc.next();
            for (int j = 0; j < contact; j++) {
                if (oldzip.equals(cArray[j].getFirstname())) {
                    System.out.println("Enter new zip code :");
                    cArray[j].setZip(sc.nextInt());
                }
            }
        }
    }

    public static void Print(int contact, Contact[] cArray) {
        for (int i = 0; i < contact; i++)
            System.out.println(cArray[i].getFirstname() + " " + cArray[i].getLastname() + " " + cArray[i].getAddress() + " "
                    + cArray[i].getCity() + "  " + cArray[i].getState() + " " + cArray[i].getZip() + " "
                    + cArray[i].getPhoneno() + " " + cArray[i].getEmail());
    }

    public static void Stop() {
        System.out.println("Thank you");
    }
}
