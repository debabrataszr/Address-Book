import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        String multiAddressBook = "continue";
        while (!multiAddressBook.equalsIgnoreCase("no")) {
            System.out.print("Enter the name of Address Book : ");
            String bookName = sc.next();

            ArrayList<Contact> cArray = new ArrayList<>();
            HashMap<String, ArrayList<Contact>> map = new HashMap<>();

            String choice = "None";
            while (!choice.equalsIgnoreCase("stop")) {
                Contact c = new Contact();
                System.out.println("What do you want to perform ?");
                System.out.print("Add , Edit , Delete , Print , Stop this addressbook:");
                choice = sc.next();
                switch (choice) {
                    case "add":
                        Add(cArray);
                        break;
                    case "edit":
                        Edit(cArray);
                        break;
                    case "delete":
                        Delete(cArray);
                        break;
                    case "print":
                        Print(cArray);
                        break;
                    case "stop":
                        System.out.println("P.T.O");
                        break;
                }
                map.put(bookName, cArray);
            }
            System.out.print("Do you want to add new book - yes /no :");
            multiAddressBook = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                System.out.println(bookName + "  " + map.get(bookName).get(j).getFirstname() + " " +
                        map.get(bookName).get(j).getLastname() + " " + map.get(bookName).get(j).getAddress() + " " +
                        map.get(bookName).get(j).getCity() + " " +map.get(bookName).get(j).getState()+" "
                        + map.get(bookName).get(j).getZip() + " " + map.get(bookName).get(j).getPhoneno() + " " +
                        map.get(bookName).get(j).getEmail());
            }
        }
    }

    public static void Add(ArrayList<Contact> cArray) {
        String option;
        do {
            Contact contact = new Contact();
            System.out.print("Enter name- ");
            contact.setFirstname(sc.next());
            System.out.print("Enter lastname- ");
            contact.setLastname(sc.next());
            System.out.print("Enter address- ");
            contact.setAddress(sc.next());
            System.out.print("Enter city- ");
            contact.setCity(sc.next());
            System.out.print("Enter state- ");
            contact.setState(sc.next());
            System.out.print("Enter zip code- ");
            contact.setZip(sc.nextInt());
            System.out.print("Enter contact- ");
            contact.setPhoneno(sc.nextInt());
            System.out.print("Enter email- ");
            contact.setEmail(sc.next());
            cArray.add(contact);
            System.out.print("Do you want to add more (yes/no) - ");
            option = sc.next();
        } while (!option.equalsIgnoreCase("no"));
    }

    public static void Edit(ArrayList<Contact> cArray) {
        System.out.println("what you want to edit :");
        System.out.print("firstname, lastname, address, city, state, contact : ");
        String choiceEdit = sc.next();
        if (choiceEdit.equals("firstname")) {
            System.out.print("whose firstname : ");
            String oldName = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldName.equals(cArray.get(j).getFirstname())) {
                    System.out.print("Enter new firstname : ");
                    String newName = sc.next();
                    cArray.get(j).setFirstname(newName);
                }
            }
        }
        if (choiceEdit.equals("lastname")) {
            System.out.print("Whose lastname : ");
            String oldLastName = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldLastName.equals(cArray.get(j).getFirstname())) {
                    System.out.print("Enter new Lastname : ");
                    cArray.get(j).setLastname(sc.next());
                }
            }
        }
        if (choiceEdit.equals("address")) {
            System.out.print("Whose address : ");
            String oldaddress = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldaddress.equals(cArray.get(j).getFirstname())) {
                    System.out.print("Enter new address : ");
                    cArray.get(j).setAddress(sc.next());
                }
            }
        }
        if (choiceEdit.equals("city")) {
            System.out.print("Whose city : ");
            String oldcity = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldcity.equals(cArray.get(j).getFirstname())) {
                    System.out.print("Enter new city : ");
                    cArray.get(j).setAddress(sc.next());
                }
            }
        }
        if (choiceEdit.equals("state")) {
            System.out.print("Whose state : ");
            String oldstate = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldstate.equals(cArray.get(j).getFirstname())) {
                    System.out.print("Enter new state : ");
                    cArray.get(j).setState(sc.next());
                }
            }
        }
        if (choiceEdit.equals("phoneno")) {
            System.out.print("Whose phone number : ");
            String oldphoneno = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldphoneno.equals(cArray.get(j).getFirstname())) {
                    System.out.print("Enter new phone number : ");
                    cArray.get(j).setPhoneno(sc.nextInt());
                }
            }
        }
    }

    public static void Delete(ArrayList<Contact> cArray) {
        System.out.print("Enter the name you want to delete : ");
        String del = sc.next();
        System.out.println("Address book is now updated ");
        for (int i = 0; i < cArray.size(); i++) {
            if (del.equals(cArray.get(i).getFirstname())) {
                cArray.remove(cArray.get(i));
            }
        }
        for (int i = 0; i < cArray.size(); i++) {
            System.out.println(cArray.get(i).getFirstname() + " " + cArray.get(i).getLastname() + " " +
                    cArray.get(i).getAddress() + " " + cArray.get(i).getState() + " " +cArray.get(i).getCity() + " "+
                    cArray.get(i).getZip() + " " + cArray.get(i).getPhoneno() + " " + cArray.get(i).getEmail());
        }
        System.out.println("---------------------------------------------------------------------------");
    }

    public static void Print(ArrayList<Contact> cArray) {
        for (int i = 0; i < cArray.size(); i++) {
            System.out.println(cArray.get(i).getFirstname() + " " + cArray.get(i).getLastname() + " " +
                    cArray.get(i).getAddress() + " " + cArray.get(i).getCity() + " "+ cArray.get(i).getState() + " " +
                    cArray.get(i).getZip() + " " + cArray.get(i).getPhoneno() + " " + cArray.get(i).getEmail());
        }
    }
}
