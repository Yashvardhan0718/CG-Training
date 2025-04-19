package week4.day5.level2.test;

import org.junit.jupiter.api.Test;
import week4.day5.level2.main.date;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    date formatter = new date();

    @Test void testValidDate() {
        assertEquals("05-04-2024", formatter.formatDate("2024-04-05"));
    }

    @Test void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("05-04-2024"));
    }
}
