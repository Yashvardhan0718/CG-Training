package week4.day5.level2.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class exception {
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    @Test void testDivisionException() {
        assertThrows(ArithmeticException.class, () -> divide(5, 0));
    }
}
