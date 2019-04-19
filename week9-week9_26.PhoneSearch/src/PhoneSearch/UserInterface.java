package PhoneSearch;

import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private PhoneBook phoneBook;
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.phoneBook = new PhoneBook();
    }
    
    public void start() {
        printMenu();
        getCommand();
    }
    
    public void printMenu() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }
    
    public void getCommand() {
        while (true) {
            System.out.print("\ncommand: ");
            String command = scanner.nextLine();
            
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                addNumber();
            } else if (command.equals("2")) {
                searchNumber();
            } else if (command.equals("3")) {
                searchPersonByNumber();
            } else if (command.equals("4")) {
                addAddress();
            } else if (command.equals("5")) {
                searchPersonalInfo();
            } else if (command.equals("6")) {
                deletePersonalInfo();
            } else if (command.equals("7")) {
                filteredListing();
            }
        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        System.out.print("number: ");
        String number = scanner.nextLine();
        
        phoneBook.addNumber(name, number);
    }

    private void searchNumber() {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        
        phoneBook.searchNumber(name);
    }

    private void searchPersonByNumber() {
        System.out.print("number: ");
        String number = scanner.nextLine();
        
        phoneBook.searchPersonByNumber(number);
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = scanner.nextLine();
        System.out.print("street: ");
        String street = scanner.nextLine();
        System.out.print("city: ");
        String city = scanner.nextLine();
        
        phoneBook.addAddress(name, street, city);
    }

    private void searchPersonalInfo() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        
        phoneBook.searchPersonalInfo(name);
    }

    private void deletePersonalInfo() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        
        phoneBook.deletePersonalInfo(name);
    }

    private void filteredListing() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = scanner.nextLine();
        
        phoneBook.filteredListing(keyword);
    }
}
