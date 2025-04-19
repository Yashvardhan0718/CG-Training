package week4.day5.level1;

import java.util.regex.*;

public class email {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        Matcher matcher = Pattern.compile("[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
