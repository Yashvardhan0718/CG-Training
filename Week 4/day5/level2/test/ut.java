package week4.day5.level2.test;

import org.junit.jupiter.api.Test;
import week4.day5.level2.main.user;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    user reg = new user();

    @Test void testValidRegistration() {
        assertDoesNotThrow(() -> reg.registerUser("john", "john@example.com", "securePass"));
    }

    @Test void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> reg.registerUser("john", "wrong.com", "pass123"));
    }

    @Test void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> reg.registerUser("john", "john@example.com", "123"));
    }

    @Test void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> reg.registerUser("", "john@example.com", "secure123"));
    }
}
