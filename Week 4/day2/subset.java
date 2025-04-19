package week4.day2.level2;

import java.util.HashSet;
import java.util.Set;

public class subset {
    public static <T> boolean isSubset(Set<T> smallerSet, Set<T> largerSet) {
        return largerSet.containsAll(smallerSet);
    }

    public static void main(String[] args) {
        Set<Integer> subset = new HashSet<>();
        subset.add(2);
        subset.add(3);

        Set<Integer> superset = new HashSet<>();
        superset.add(1);
        superset.add(2);
        superset.add(3);
        superset.add(4);

        boolean result = isSubset(subset, superset);
        System.out.println(result);
    }
}
