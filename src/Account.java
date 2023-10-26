import java.util.HashMap;
import java.util.Scanner;

public class Account {
    private String username;
    protected static String password;

    // A HashMap to store customer data with usernames as keys
    private static HashMap<String, Account> customerDatabase = new HashMap<>();

    // Scanner for user input
    private static Scanner scanner = new Scanner(System.in);

    // Method to register a new customer account
    public void addCustomer(String username, String password) {
        System.out.println("Enter a username:");
        String inputUsername = scanner.next();

        // Check if the username is already taken
        if (customerDatabase.containsKey(inputUsername)) {
            System.out.println("Username already exists. Please choose a different one.");
        } else {
            System.out.println("Enter a password:");
            String inputPassword = scanner.next();

            // Create a new account
            Account newAccount = new Account();
            newAccount.username = inputUsername;
            newAccount.password = inputPassword;

            // Add the new account to the customer database
            customerDatabase.put(inputUsername, newAccount);
            System.out.println("Account created successfully.");
        }
    }

    // Method to log in to an account
    public void login() {
        System.out.println("Enter your username:");
        String inputUsername = scanner.next();

        if (customerDatabase.containsKey(inputUsername)) {
            System.out.println("Enter your password:");
            String inputPassword = scanner.next();

            Account customer = customerDatabase.get(inputUsername);
            if (inputPassword.equals(customer.password)) {
                System.out.println("Login successful. Welcome, " + inputUsername + "!");
                  Menu2 menu2 = new Menu2();
                   menu2.mainMenu2();
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("Username not found. Please register or check your input.");
        }
    }

    
    public void deleteAccount() {
        System.out.println("Enter the username of the account to delete:");
        String inputUsername = scanner.next();

        if (customerDatabase.containsKey(inputUsername)) {
            customerDatabase.remove(inputUsername);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Username not found. Deletion failed.");
        }
    }

    
}
