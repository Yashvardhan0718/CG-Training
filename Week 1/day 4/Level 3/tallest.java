import java.util.Random;

public class Main {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101);
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Player Heights:");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\nMean Height: " + findMeanHeight(heights));
        System.out.println("Shortest Height: " + findShortestHeight(heights));
        System.out.println("Tallest Height: " + findTallestHeight(heights));
    }
}

