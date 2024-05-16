package PROJECT;

import java.util.Scanner;

public class Project2 {
    public static void addContact(String contacts[], int n) {
        Scanner EnterArray = new Scanner(System.in);

        System.err.println("Enter Array: ");
        for (int i = 0; i < n; i++) {
            contacts[i] = EnterArray.next();
        }

    }

    public static void searchContact(String contacts[]) {
        Scanner Find = new Scanner(System.in);
        System.err.println("Number to find: ");
        String Number = Find.next();

        int check = 0;

        for (int i = 0; i < contacts.length; i++) {
            if (Number.equals(contacts[i])) {
                System.err.print("Result: ");
                System.err.println(Number);
                check = 1;
                break;
            }
        }

        if (check == 0) {
            System.err.println("Number cannot be found");
        }

    }

    public static void displayContacts(String contacts[], int n) {
        System.err.println("Display Array: ");
        for (int i = 0; i < n; i++) {
            System.err.print(contacts[i] + ", ");
        }
        System.err.println();
    }

    public static void deleteContact(String contacts[]) {
        Scanner Find = new Scanner(System.in);
        System.err.println("Enter number to delete: ");
        String Number = Find.next();

        boolean check = false;

        for (int i = 0; i < contacts.length; i++) {
            if (Number.equals(contacts[i])) {
                check = true;
                contacts[i] = "";
                break;
            }
        }

        if (check == false) {
            System.err.println("Number cannot be found");
        }
    }

    public static void main(String[] args) {
        String contacts[] = new String[1000];
        System.err.println("=====================================================");
        System.err.println("1. Add contact");
        System.err.println("2. Search contant");
        System.err.println("3. Display contact");
        System.err.println("4. Delete contact");
        System.err.println("5. Exit");
        System.err.println("=====================================================");
        Scanner input = new Scanner(System.in);

        int n;
        System.err.println("Enter n: ");
        n = input.nextInt();

        while (true) {
            System.err.println("Enter options: ");
            String options = input.next();
            if (options.equals("1")) {
                addContact(contacts, n);
            } else if (options.equals("2")) {
                searchContact(contacts);
            } else if (options.equals("3")) {
                displayContacts(contacts, n);
            } else if (options.equals("4")) {
                deleteContact(contacts);
            } else if (options.equals("5")) {
                System.err.println("Exit!");
                break;
            } else {
                System.err.println("Enter options [1, 2, 3, 4, 5]!");
            }
        }
    }
}