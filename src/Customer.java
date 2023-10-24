import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private String name;
    private long AccountNumber;
    private int PassWord;
   private double balance;
   private List<String> CurrentTransactions = new ArrayList<>();

     public Customer(){

     }
    
       public void addCustomer(List<String> CurrentTransactions) {
       }

     //constructor

      public Customer(String name, long accountNumber, int passWord, double balance,
         List<String> currentTransactions) {
      this.name = name;
      this.AccountNumber = accountNumber;
      this.PassWord = passWord;
      this.balance = balance;
      this.CurrentTransactions = currentTransactions;
      }
          

   

//getter and setters

 

public String getFirstName() {
      return name;
   }
   public void setFirstName(String name) {
      name = name;
   }
   public long getAccountNumber() {
      return AccountNumber;
   }
   public void setAccountNumber(long accountNumber) {
      AccountNumber = (long) accountNumber;
   }
   public int getPassWord() {
      return PassWord;
   }

    public double getBalance() {
    return balance;
}

   public void setBalance(double balance) {
    this.balance = balance;
}

    public void setCurrentTransactions(List<String> currentTransactions) {
      CurrentTransactions = currentTransactions;
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
      public void deposit() {
      }

      public void withdraw() {
      }
   





    
    
}