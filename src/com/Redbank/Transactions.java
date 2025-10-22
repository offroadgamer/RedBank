package src.com.Redbank;

public class Transactions {

    private Account account;

    public void depositMoney(double amountToWithdraw, double currentBalance) {
        double newBalance = currentBalance += amountToWithdraw;
        account.updateBalance(newBalance);
    }

    public void withdrawMoney(double amountToWithdraw, double currentBalance) {
        double newBalance = currentBalance -= amountToWithdraw;
        account.updateBalance(newBalance);
    }
}
