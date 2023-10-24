import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private String name;
    private long accountNumber;
    private int passWord;
   private double balance;
   private List<String> currentTransactions = new ArrayList<>();

     public Customer(){

     }
    
       public void addCustomer(List<String> CurrentTransactions) {
       }

     //constructor

      public Customer(String name, long accountNumber, int passWord, double balance,
         List<String> currentTransactions) {
      this.name = name;
      this.accountNumber = accountNumber;
      this.passWord = passWord;
      this.balance = balance;
      this.currentTransactions = currentTransactions;
      }
          

   

//getter and setters

 

public String getName() {
      return name;
   }
   public void setName(String name) {
      name = name;
   }
   public long getAccountNumber() {
      return accountNumber;
   }
   public void setAccountNumber(long accountNumber) {
      accountNumber = (long) accountNumber;
   }
   public int getPassWord() {
      return passWord;
   }

    public double getBalance() {
    return balance;
}

   public void setBalance(double balance) {
    this.balance = balance;
}

    public void setCurrentTransactions(List<String> currentTransactions) {
      currentTransactions = currentTransactions;
   }

   public void deposit(double amount) {
      balance += amount;
      currentTransactions.add("You have deposited " + amount + ". Your new balance is " + balance);
  }
  

      private List<String> getCurrentTransactions() {
      return null;
   }

      public void withdraw(Customer accountNumber, double Balance) {
         if (accountNumber.getBalance() >= Balance) {
             accountNumber.setBalance(accountNumber.getBalance() - Balance);
             (accountNumber).getCurrentTransactions().add(" You Withdrew " + Balance + ". your new Balance: " + accountNumber.getBalance());
         } else {
             System.out.println("Insufficient funds.");
         }        
     }
      public void deposit() {
      }

      public void withdraw() {
      }

      public void checkBalance() {
         System.out.println("your balance is " + balance);
      }
   





    
    
}