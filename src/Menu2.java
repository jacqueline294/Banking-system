import java.util.List;
import java.util.Scanner;

public class Menu2  {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer customer = new Customer();


    public static  void mainMenu2() {

        boolean runMenu2 = true;

        do {
    
             System.out.println("Welcome your acount " );
             System.out.println(" What transaction would you like to do?");
             System.out.println("1. Deposit"); 
             System.out.println("2. Withdraw");
             System.out.println("3. check balance");
             System.out.println("4. Exit  program");
             int choice = scanner.nextInt();
        
       
        switch(choice) {
            case 1:
            System.out.println("Enter amount you want to deposit");
             double depositBalance = scanner.nextDouble();
           customer.deposit(depositBalance);
            break;
            
            case 2:
            System.out.println("Enter amount you want to withdraw");
            double withdrawBalance = scanner.nextDouble();
            customer.withdraw(withdrawBalance);
            break;

            case 3:
            customer.checkBalance();
            break;

            case 4:
            runMenu2 = false;
            break;
        } 

     
     } while(runMenu2);
    }
     
          
      

    
}