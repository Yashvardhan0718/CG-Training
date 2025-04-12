import java.util.*;

public class DataStructureSearchComparison {

    public static void searchInArray(int[] arr, int target) {
        long start = System.nanoTime();
        for (int i : arr) {
            if (i == target) break;
        }
        long time = System.nanoTime() - start;
        System.out.println("Array Search Time: " + time / 1_000_000.0 + " ms");
    }

    public static void searchInHashSet(HashSet<Integer> set, int target) {
        long start = System.nanoTime();
        set.contains(target);
        long time = System.nanoTime() - start;
        System.out.println("HashSet Search Time: " + time / 1_000_000.0 + " ms");
    }

    public static void searchInTreeSet(TreeSet<Integer> set, int target) {
        long start = System.nanoTime();
        set.contains(target);
        long time = System.nanoTime() - start;
        System.out.println("TreeSet Search Time: " + time / 1_000_000.0 + " ms");
    }

    public static void runComparison(int size) {
        System.out.println("Dataset Size: " + size);

        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = size - 1;

        searchInArray(array, target);
        searchInHashSet(hashSet, target);
        searchInTreeSet(treeSet, target);

        System.out.println();
    }

    public static void main(String[] args) {
        runComparison(1_000);
        runComparison(100_000);
        runComparison(1_000_000);
    }
}
