
package AdressBook;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Main test = new Main();

        while(true){
            System.out.println("1. Add ");
            System.out.println("2. Seach");
            System.out.println("3. List");
            System.out.println("4. Exit\n\n");

            System.out.print("Enter your option: ");
            Scanner console = new Scanner(System.in);
            String input = console.nextLine();
            int valueInput = 0;
            try{
                valueInput = Integer.parseInt(input);
                if(valueInput < 1 || valueInput > 4){
                    System.out.println("Your input must be in range 1 to 4. Try again!\n\n");
                }else{
                    switch(valueInput){
                        case 1:
                            System.out.print("\n\nEnter Name: ");
                            String name = console.nextLine();
                            System.out.print("\nEnter Company: ");
                            String company = console.nextLine();
                            System.out.print("\nEnter Email: ");
                            String email = console.nextLine();
                            System.out.print("\nEnter Phone: ");
                            String phone = console.nextLine();

                            test.addContact(name, company, email, phone);
                            break;
                        case 2:
                            System.out.print("\nEnter phone number to search: ");
                            String inputPhone = console.nextLine();
                            Contact contact = test.searchPhone(inputPhone);
                            if(contact != null){
                                String format = "%-20s %-20s %-20s %-20s";
                                System.out.format(format,"Contact Name","Company","Email","Phone number");
                                System.out.println("");
                                System.out.format(format,contact.getName(), contact.getCompany(), contact.getEmail(), contact.getPhone());
                            }else{
                                System.out.println("Phone not found!");
                            }
                            System.out.println("\n\n");
                            break;
                        case 3:
                            test.displayContacts();
                            break;
                        case 4:
                            exit(0);
                            break;
                        default:
                            exit(0);
                            break;
                    }
                }
            }catch(Exception ex){
                System.out.println("Your input must be number only. Try again!\n\n");
            }
        }

    }

    public void addContact(String name, String company, String mail, String phone){
        Contact contact = new Contact(name, company, mail, phone);
        contacts.add(contact);
        System.out.println("A new contact is added!\n\n");
    }

    public Contact searchPhone(String phone){
        for(Contact ct : contacts){
            if(ct.getPhone().equalsIgnoreCase(phone)){
                return ct;
            }
        }
        return null;
    }

    public void displayContacts(){
        String format = "%-20s %-20s %-20s %-20s";

        if(contacts.size() == 0){
            System.out.println("No result!");
        }
        System.out.format(format,"Contact Name","Company","Email","Phone number");
        System.out.println("");
        for(Contact ct : contacts){
            System.out.format(format,ct.getName(), ct.getCompany(), ct.getEmail(), ct.getPhone());
            System.out.println("");
        }
        System.out.println("\n\n");
    }
}
