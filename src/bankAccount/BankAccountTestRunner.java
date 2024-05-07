package bankAccount;

public class BankAccountTestRunner {
    public static void main(String[] args) {
        BankAccountTester person1 = new BankAccountTester();
        BankAccountTester momsSavings = new BankAccountTester(1000);
        momsSavings.addInterest(10); // 10 percent interest


        person1.deposit(1000);
        person1.withdraw(500);
        person1.withdraw(400);


        System.out.println("Remaining Balance: " + person1.getBalance() + "$");
        System.out.println("-----------");

        System.out.println("Moms Balance With Interest: " + momsSavings.getBalance() + "$");
    }
}
