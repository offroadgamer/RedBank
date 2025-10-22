public class Account {

    private String accountName;
    private int accountNumber;
    private double balance;

    public Account(String accountName, int accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void updateBalance(double balance) {
        this.balance = balance;
    }
}
