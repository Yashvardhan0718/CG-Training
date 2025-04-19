package week4.day2.level2;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static <T> Set<T> getUnion(Set<T> setOne, Set<T> setTwo) {
        Set<T> unionSet = new HashSet<>(setOne);
        unionSet.addAll(setTwo);
        return unionSet;
    }

    public static <T> Set<T> getIntersection(Set<T> setOne, Set<T> setTwo) {
        Set<T> intersectionSet = new HashSet<>(setOne);
        intersectionSet.retainAll(setTwo);
        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(5);

        Set<Integer> union = getUnion(firstSet, secondSet);
        Set<Integer> intersection = getIntersection(firstSet, secondSet);

        System.out.println(union);
        System.out.println(intersection);
    }
}
