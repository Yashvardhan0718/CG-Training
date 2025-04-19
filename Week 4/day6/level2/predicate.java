import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class PredicateComposition {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("amazing", "hello", "Java", "fantastic", "aero");
        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;
        Predicate<String> containsA = s -> s.contains("a");

        List<String> result = words.stream()
                .filter(lengthGreaterThan5.and(containsA))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
