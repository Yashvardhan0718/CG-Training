public class StringConcatComparison {

    public static void concatWithString(int n) {
        String result = "";
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            result += "a";
        }
        long time = System.nanoTime() - start;
        System.out.println("String Time: " + time / 1_000_000.0 + " ms");
    }

    public static void concatWithStringBuilder(int n) {
        StringBuilder result = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
        long time = System.nanoTime() - start;
        System.out.println("StringBuilder Time: " + time / 1_000_000.0 + " ms");
    }

    public static void concatWithStringBuffer(int n) {
        StringBuffer result = new StringBuffer();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
        long time = System.nanoTime() - start;
        System.out.println("StringBuffer Time: " + time / 1_000_000.0 + " ms");
    }

    public static void runTest(int n) {
        System.out.println("Concatenation Count: " + n);
        if (n <= 10000) concatWithString(n);
        else System.out.println("String: Skipped (Too slow)");
        concatWithStringBuilder(n);
        concatWithStringBuffer(n);
        System.out.println();
    }

    public static void main(String[] args) {
        runTest(1000);
        runTest(10000);
        runTest(1000000);
    }
}
