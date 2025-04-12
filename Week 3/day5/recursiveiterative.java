public class FibonacciComparison {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void measureTime(int n) {
        System.out.println("Fibonacci Number N = " + n);

        if (n <= 30) {
            long start = System.nanoTime();
            int resultRec = fibonacciRecursive(n);
            long timeRec = System.nanoTime() - start;
            System.out.println("Recursive Result: " + resultRec + ", Time: " + timeRec / 1_000_000.0 + " ms");
        } else {
            System.out.println("Recursive: Skipped (Too slow)");
        }

        long start = System.nanoTime();
        int resultItr = fibonacciIterative(n);
        long timeItr = System.nanoTime() - start;
        System.out.println("Iterative Result: " + resultItr + ", Time: " + timeItr / 1_000_000.0 + " ms");

        System.out.println();
    }

    public static void main(String[] args) {
        measureTime(10);
        measureTime(30);
        measureTime(50);
    }
}
