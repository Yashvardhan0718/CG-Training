
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemover {
    public static <T> List<T> removeDuplicates(List<T> inputList) {
        Set<T> seen = new LinkedHashSet<>();
        for (T item : inputList) {
            seen.add(item);
        }
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        List<Integer> result = removeDuplicates(numbers);
        System.out.println(result);
    }
}
