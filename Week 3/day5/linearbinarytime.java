import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return i;
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static int[] generateDataset(int size, int target) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size - 1; i++)
            data[i] = rand.nextInt(size * 10);
        data[size - 1] = target;
        return data;
    }

    public static void testSearch(int size) {
        int target = size * 5;
        int[] data = generateDataset(size, target);

        long start = System.nanoTime();
        linearSearch(data, target);
        long linearTime = System.nanoTime() - start;

        Arrays.sort(data);
        start = System.nanoTime();
        binarySearch(data, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Dataset Size: " + size);
        System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
        System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
        System.out.println();
    }

    public static void main(String[] args) {
        testSearch(1_000);
        testSearch(10_000);
        testSearch(1_000_000);
    }
}
