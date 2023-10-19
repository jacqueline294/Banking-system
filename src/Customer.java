import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer{
    private String FirstName;
     private String LastName;
     private String BirthDay;
     private long AccountNumber;
     private int PassWord;
     private double balance;
      private List<String> CurrentTransactions = new ArrayList<>();

     public Customer(){

     }

     //constructor

   public Customer(String firstName, String lastName, String birthDay, long accountNumber, int passWord,
         double balance) {
      this.FirstName = firstName;
      this.LastName = lastName;
      this.BirthDay = birthDay;
      this.AccountNumber = (long) accountNumber;
      this.PassWord = passWord;
      this.balance = balance;
   }

//getter and setters

 

public String getFirstName() {
      return FirstName;
   }
   public void setFirstName(String firstName) {
      FirstName = firstName;
   }

   public String getLastName() {
      return LastName;
   }
   public void setLastName(String lastName) {
      LastName = lastName;
   }

   public String getBirthDay() {
      return BirthDay;
   }
   public void setBirthDay(String birthDay) {
      BirthDay = birthDay;
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

   public void setPassWord(int passWord) {
      PassWord = passWord;
   }
     public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}

//methods



    public void deposit(Customer account, double amount) {

    account.setBalance(((Customer) account).getBalance() + amount);
    account.getCurrentTransactions().add("Deposited $" + amount + ". New Balance: $" + account.getBalance());
}
private List<String> getCurrentTransactions() {
        return null;
    }

private List<String> getCurrentTransactions() {
    
    return null;

}

public void withdraw(Customer account, double amount) {
    if (account.getBalance() >= amount) {
        account.setBalance(account.getBalance() - amount);
        account.getTransactionHistory().add("Withdrew $" + amount + ". New Balance: $" + account.getBalance());
    } else {
        System.out.println("Insufficient funds.");
    }
}

   


 
    
}