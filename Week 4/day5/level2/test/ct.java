package week4.day5.level2.test;

import org.junit.jupiter.api.Test;
import week4.day5.level2.main.calculator;

import static org.junit.jupiter.api.Assertions.*;

class ct {
    calculator calc = new calculator();

    @Test void testAdd() { assertEquals(5, calc.add(2, 3)); }
    @Test void testSubtract() { assertEquals(1, calc.subtract(4, 3)); }
    @Test void testMultiply() { assertEquals(12, calc.multiply(3, 4)); }
    @Test void testDivide() { assertEquals(2, calc.divide(10, 5)); }

    @Test void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
