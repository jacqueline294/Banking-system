import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private long accountNumber;
    private int passWord;
    private double balance;

    public Customer() {
    }

    // Constructor
    public Customer(String name, long accountNumber, int passWord, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.passWord = passWord;
        this.balance = balance;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
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

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited " + amount + ". Your new balance is " + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawn " + amount + ". Your new balance is " + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0 and less than or equal to your balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is " + balance);
    }
}
