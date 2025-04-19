package week4.day2.level2;

import java.util.HashSet;
import java.util.Set;

public class setCompare {
    public static <T> boolean areSetsEqual(Set<T> setOne, Set<T> setTwo) {
        return setOne.equals(setTwo);
    }

    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(3);
        secondSet.add(2);
        secondSet.add(1);

        boolean result = areSetsEqual(firstSet, secondSet);
        System.out.println(result);
    }
}
