package bankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTesterTest {

    BankAccountTester momsSavings;

    @BeforeEach
    void setUp() {
        momsSavings = new BankAccountTester(1000);
    }

    @Test
    void momsAccountBalance(){
        momsSavings.addInterest(10);
        assertEquals(1100,momsSavings.getBalance());
    }


}