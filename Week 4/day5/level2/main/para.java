package week4.day5.level2.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class para {
    public boolean isEven(int number) { return number % 2 == 0; }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testEven(int num) {
        if (num % 2 == 0) assertTrue(isEven(num));
        else assertFalse(isEven(num));
    }
}
