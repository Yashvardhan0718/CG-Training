import java.util.*;
import java.util.function.*;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "lambda", "stream");
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        names.forEach(printUpper);
    }
}
