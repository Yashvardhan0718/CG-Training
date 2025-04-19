import java.util.*;
import java.util.stream.*;

public class SecondMostRepeated {
    public static void main(String[] args) {
        String input = "apple banana apple orange banana apple banana orange orange";
        String[] words = input.split("\\s+");

        Map<String, Long> freq = Arrays.stream(words)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        List<Map.Entry<String, Long>> sorted = freq.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(Collectors.toList());

        if (sorted.size() >= 2) {
            System.out.println("Second most frequent word: " + sorted.get(1).getKey());
        } else {
            System.out.println("Not enough words.");
        }
    }
}
