package bankAccount;

public class BankAccountTester {

    private double balance;

    public BankAccountTester(double balance) {
        this.balance = balance;
    }

    public BankAccountTester() {
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance = balance + amount;
    }

    public void withdraw(double amount){
        if (amount <= balance){
            this.balance = balance - amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}
