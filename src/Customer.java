import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer extends Account{
    private String FirstName;
     protected String LastName;
     private String BirthDay;
     private long AccountNumber;
     private int PassWord;
     private double balance;
      private List<String> CurrentTransactions = new ArrayList<>();

     public Customer(){

     }
     public void addCustomer(List<String> CurrentTransactions) {
     }

     //constructor

      public Customer(String firstName, String lastName, String birthDay, long accountNumber, int passWord, double balance,
         List<String> currentTransactions) {
      this.FirstName = firstName;
      this.LastName = lastName;
      this.BirthDay = birthDay;
      this.AccountNumber = accountNumber;
      this.PassWord = passWord;
      this.balance = balance;
      this.CurrentTransactions = currentTransactions;
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

    public double getBalance() {
    return balance;
}

   public void setBalance(double balance) {
    this.balance = balance;
}

    public void setCurrentTransactions(List<String> currentTransactions) {
      CurrentTransactions = currentTransactions;
   }



    
    
}