package week4.day5.level2.test;

import org.junit.jupiter.api.Test;
import week4.day5.level2.main.temp;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    temp converter = new temp();

    @Test void testCelsiusToFahrenheit() {
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.01);
    }

    @Test void testFahrenheitToCelsius() {
        assertEquals(37, converter.fahrenheitToCelsius(98.6), 0.01);
    }
}

