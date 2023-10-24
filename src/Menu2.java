import java.util.List;
import java.util.Scanner;

public class Menu2  {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer CustomerList = new Customer();


    public static  void mainMenu2() {

        boolean runMenu2 = true;

        do {
    
             System.out.println("Welcome your acount is " );
             System.out.println(" What transaction would you like to do?");
             System.out.println("1. Deposit"); 
             System.out.println("2. Withdraw");
             System.out.println("3. Exit  program");
             int choice = scanner.nextInt();
        
       
        switch(choice) {
            case 1:
            CustomerList.deposit();
            break;
            
            case 2:
            CustomerList.withdraw();
            break;

            case 3:
            runMenu2 = false;
            break;
        } 

     
     } while(runMenu2);
    }
     
          
      

    
}