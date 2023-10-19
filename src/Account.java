import java.util.ArrayList;
import java.util.Scanner;

public class Account {
        ArrayList<Customer> CustomerList = new ArrayList<>();

    public void addCustomer() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Create a new Account");
        System.out.println("Enter First name");

         String FirstName = scanner.nextLine();
         System.out.println("Enter LastName");
        String LastName = scanner.nextLine();
         System.out.println("Enter your date of birth YY/MM/DD");
        String BirthDay = scanner.nextLine();
         System.out.println("enter your prefered Account number");
         long AccountNumber=scanner.nextLong();
         System.out.println("Enter 4 digit password");
         int PassWord=scanner.nextInt();
         System.out.println("Enter how much you want to deposit");
         double Balance= scanner.nextDouble();

        
       

        CustomerList.add(new Customer(FirstName,LastName,BirthDay,AccountNumber,PassWord,Balance));

        System.out.println("Funkar det?");
        for (int i = 0; i< CustomerList.size(); i++) {
            System.out.println(CustomerList.get(i));
        }

    }

    public void deleteAccount(long AccountNumber) {
      Account accountnumber = getAccount(AccountNumber);
      if (accountnumber != null) {
          accountnumber.deleteAccount(AccountNumber);
      }

            }

   private Account getAccount(long accountNumber) {
      return null;
   }
           
            
                 

        }

    


