import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        ArrayList<Contact> cArray = new ArrayList<>();
        String option = "Null";
        while (!option.equalsIgnoreCase("stop")) {
            System.out.println("What to do ?");
            System.out.println("Add ,\n Edit ,\n Delete ,\n Print ,\n Stop");
            option = sc.next();
            switch (option) {
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
                    Stop();
                    break;
            }
        }
    }

    public static void Add(ArrayList<Contact> cArray) {
        String option;
        do {
            Contact contact = new Contact();
            System.out.println("Enter name:");
            contact.setFirstname(sc.next());
            System.out.println("Enter lastname:");
            contact.setLastname(sc.next());
            System.out.println("Enter address:");
            contact.setAddress(sc.next());
            System.out.println("Enter city:");
            contact.setCity(sc.next());
            System.out.println("Enter state:");
            contact.setState(sc.next());
            System.out.println("Enter zip code:");
            contact.setZip(sc.nextInt());
            System.out.println("Enter contact:");
            contact.setPhoneno(sc.nextInt());
            System.out.println("Enter email:");
            contact.setEmail(sc.next());
            cArray.add(contact);
            System.out.println("Whether you want to add more (yes/no)? ");
            option = sc.next();
        } while (!option.equalsIgnoreCase("no"));
    }

    public static void Edit(ArrayList<Contact> cArray) {
        System.out.println("What to edit ?");
        System.out.println("firstname, lastname, address,city, state, contact");
        String choiceEdit = sc.next();
        if (choiceEdit.equals("firstname")) {
            System.out.println("First name :");
            String oldFirstname = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldFirstname.equals(cArray.get(j).getFirstname())) {
                    System.out.println("Enter new first name :");
                    String newName = sc.next();
                    cArray.get(j).setFirstname(newName);
                }
            }
        }
        if (choiceEdit.equals("lastname")) {
            System.out.println("Last name :");
            String oldLastName = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldLastName.equals(cArray.get(j).getFirstname())) {
                    System.out.println("Enter new last name :");
                    cArray.get(j).setLastname(sc.next());
                }
            }
        }
        if (choiceEdit.equals("address")) {
            System.out.println("Address :");
            String oldaddress = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldaddress.equals(cArray.get(j).getFirstname())) {
                    System.out.println("Enter new address :");
                    cArray.get(j).setAddress(sc.next());
                }
            }
        }
        if (choiceEdit.equals("city")) {
            System.out.println("City :");
            String oldcity = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldcity.equals(cArray.get(j).getFirstname())) {
                    System.out.println("Enter new city :");
                    cArray.get(j).setState(sc.next());
                }
            }
        }
        if (choiceEdit.equals("state")) {
            System.out.println("State :");
            String oldstate = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldstate.equals(cArray.get(j).getFirstname())) {
                    System.out.println("Enter new state :");
                    cArray.get(j).setState(sc.next());
                }
            }
        }
        if (choiceEdit.equals("phone")) {
            System.out.println("Phone no.:");
            String oldphoneno = sc.next();
            for (int j = 0; j < cArray.size(); j++) {
                if (oldphoneno.equals(cArray.get(j).getFirstname())) {
                    System.out.println("Enter new phone no. :");
                    cArray.get(j).setPhoneno(sc.nextInt());
                }
            }
        }
    }

    public static void Delete(ArrayList<Contact> cArray) {
        System.out.println("Enter the name you want to delete : ");
        String del = sc.next();
        System.out.println("Address book updated successfully");
        for (int i = 0; i < cArray.size(); i++) {
            if (del.equals(cArray.get(i).getFirstname())) {
                cArray.remove(cArray.get(i));
            }
        }
        for (int i = 0; i < cArray.size(); i++) {
            System.out.println(cArray.get(i).getFirstname() + " " + cArray.get(i).getLastname() + " " +
                    cArray.get(i).getAddress() + " " + cArray.get(i).getCity() + " " + cArray.get(i).getState() + " " +
                    cArray.get(i).getZip() + " " + cArray.get(i).getPhoneno() + " " + cArray.get(i).getEmail());
        }
        System.out.println("---------------------------------------------------------------");
    }

    public static void Print(ArrayList<Contact> cArray) {
        for (int i = 0; i < cArray.size(); i++) {
            System.out.println(cArray.get(i).getFirstname() + " " + cArray.get(i).getLastname() + " " +
                    cArray.get(i).getAddress() + " " + cArray.get(i).getCity() + " " + cArray.get(i).getState() + " " +
                    cArray.get(i).getZip() + " " + cArray.get(i).getPhoneno() + " " + cArray.get(i).getEmail());
        }
    }

    public static void Stop() {
        System.out.println("Thank you");
    }
}

