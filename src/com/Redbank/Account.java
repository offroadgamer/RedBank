package src.com.Redbank;

public class Account {

    private String accountName;
    private int accountNumber;
    private double balance;

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        double accNum = Math.random() * 10_000_000;
        this.accountNumber = (int) accNum;
        this.balance = balance;
    }

    public Account(String accountName) {
        this.accountName = accountName;
        double accNum = Math.random() * 10_000_000;
        this.accountNumber = (int) accNum;
        this.balance = 0;
    }

    public void depositMoney(double amount) {
        this.balance += amount;
    }

    public void withdrawMoney(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
