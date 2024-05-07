package bankAccount;

public class SavingsAccount {
    private double balance, interest;

    public double getBalance() {
        return balance;
    }

    public SavingsAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void addInterest() {
        balance = balance + (balance * (interest / 100));
    }
}
