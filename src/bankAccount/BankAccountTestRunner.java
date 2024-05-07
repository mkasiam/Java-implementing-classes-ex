package bankAccount;

public class BankAccountTestRunner {
    public static void main(String[] args) {
        BankAccountTester person1 = new BankAccountTester();

        person1.deposit(1000);
        person1.withdraw(500);
        person1.withdraw(400);


        System.out.println("Remaining Balance: " + person1.getBalance());
    }
}
