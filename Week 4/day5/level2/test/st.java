package week4.day5.level2.test;

import org.junit.jupiter.api.Test;
import week4.day5.level2.main.StringUtils;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test void testReverse() { assertEquals("cba", utils.reverse("abc")); }
    @Test void testIsPalindromeTrue() { assertTrue(utils.isPalindrome("Madam")); }
    @Test void testIsPalindromeFalse() { assertFalse(utils.isPalindrome("Hello")); }
    @Test void testToUpperCase() { assertEquals("HELLO", utils.toUpperCase("hello")); }
}
