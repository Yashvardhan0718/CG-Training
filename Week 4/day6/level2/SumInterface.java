@FunctionalInterface
interface SumInterface {
    int add(int a, int b);
}

public class SumLambda {
    public static void main(String[] args) {
        SumInterface sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(10, 20));
    }
}
