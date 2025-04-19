import java.util.*;
import java.util.stream.*;

public class MostFrequentWords {
    public static void main(String[] args) {
        String text = "Java is powerful. Java is portable. Java is fun. Java rocks!";
        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

        Map<String, Long> freq = Arrays.stream(words)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        freq.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
