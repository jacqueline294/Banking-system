import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
        ArrayList<Customer> CustomerList = new ArrayList<>();

    public void addCustomer(List<String> CurrentTransactions) {

        
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

        
       

        CustomerList.add(new Customer(FirstName,LastName,BirthDay,AccountNumber,PassWord,Balance,CurrentTransactions));

        for (int i = 0; i< CustomerList.size(); i++) {
            System.out.println(CustomerList.get(i));
            System.out.println("Welcome "+ FirstName +" "+ LastName + " your account is added , You have " + Balance + "kr" );
        }

        public void deposit(Customer AccountNumber, double Balance) {

            AccountNumber.setBalance(((Customer) AccountNumber).getBalance() + Balance);
            AccountNumber.getCurrentTransactions().add("you have deposited " + Balance + ". Your  new Balance is" + AccountNumber.getBalance());
        }
        protected List<String> getCurrentTransactions() {
                return null;
            }
        
        public void withdraw(Customer AccountNumber, double Balance) {
            if (AccountNumber.getBalance() >= Balance) {
                AccountNumber.setBalance(AccountNumber.getBalance() - Balance);
                (AccountNumber).getCurrentTransactions().add(" You Withdrew " + Balance + ". your new Balance: " + AccountNumber.getBalance());
            } else {
                System.out.println("Insufficient funds.");
            }        
        }

        
        

    

    public void deleteAccount(long AccountNumber) {
      Account Accountnumber = getAccount(AccountNumber);
      if (Accountnumber != null) {
          Accountnumber.deleteAccount(AccountNumber);
          System.out.println("Account deleted");
          
      }
      else{
        System.out.println("Account doesnot exist");
      }

     

   private Account getAccount(long AccountNumber) {
      return getAccount(AccountNumber);
   }

    public void addAccount() {
   
    }

    public void deposit() {
    }

    public void withdraw() {
    }
}
    


           
            
                 

        

    


