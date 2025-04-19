package week4.day5.level2.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import week4.day5.level2.main.bank;

class bt {
    bank account = new bank();

    @Test void testDeposit() {
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test void testWithdraw() {
        account.deposit(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    @Test void testWithdrawInsufficientFunds() {
        account.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(800));
    }
}
