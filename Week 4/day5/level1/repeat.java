package week4.day5.level1;

import java.util.regex.*;

public class repeat {
    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";
        Matcher matcher = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}

