import java.util.*;

public class MaxOptional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 7, 3, 9);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresentOrElse(
                val -> System.out.println("Max: " + val),
                () -> System.out.println("List is empty")
        );
    }
}
