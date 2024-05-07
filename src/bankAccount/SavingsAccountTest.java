package bankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    SavingsAccount savingsAccount;
    @BeforeEach
    void setUp() {
        savingsAccount = new SavingsAccount(1000,10);
    }

    @Test
    void savingsAccountBalance(){
        assertEquals(1100,savingsAccount.getBalance());
    }
}