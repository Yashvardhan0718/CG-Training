@FunctionalInterface
interface SquareCalculator {
    int square(int n);

    default void printResult(int n) {
        System.out.println("Square of " + n + " is " + square(n));
    }
}

public class CustomSquare {
    public static void main(String[] args) {
        SquareCalculator calc = n -> n * n;
        calc.printResult(6);
    }
}
