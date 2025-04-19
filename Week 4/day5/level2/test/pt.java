package week4.day5.level2.test;

import org.junit.jupiter.api.Test;
import week4.day5.level2.main.password;

import static org.junit.jupiter.api.Assertions.*;

class pt {
    password validator = new password();

    @Test void testValidPassword() {
        assertTrue(validator.isValid("Pass1234"));
    }

    @Test void testTooShort() {
        assertFalse(validator.isValid("P1s"));
    }

    @Test void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }
}
