package week4.day5.level1;

import java.util.regex.*;

public class capital {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Matcher matcher = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
