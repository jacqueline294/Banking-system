
import java.util.Scanner;

public class Bank extends Account {

    
    private static Scanner scanner = new Scanner(System.in);
    private static Account CustomerList = new Account();


    public static  void mainMenu() {

        boolean runMenu = true;

        do {
    
             System.out.println("Welcome, please make a choice");
             System.out.println("1. Register a new Account");
             System.out.println("2. log in to Account"); 
             System.out.println("3. Delete Account");
             System.out.println("4. Exit the program");
             int choice = scanner.nextInt();
        
       
        switch(choice) {
            case 1:
            CustomerList.addCustomer(null, password);
            break;
            
            case 2:
            CustomerList.login();
            break;

         case 3:
            CustomerList.deleteAccount();
            break;

            case 4:
            runMenu = false;
            break;
        } 

     
     } while(runMenu);
    }

}