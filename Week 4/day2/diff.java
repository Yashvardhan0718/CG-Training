package week4.day2.level2;

import java.util.HashSet;
import java.util.Set;

public class diff {
    public static <T> Set<T> getSymmetricDifference(Set<T> setOne, Set<T> setTwo) {
        Set<T> result = new HashSet<>(setOne);
        Set<T> temp = new HashSet<>(setTwo);

        result.removeAll(setTwo);
        temp.removeAll(setOne);
        result.addAll(temp);

        return result;
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

        Set<Integer> symmetricDiff = getSymmetricDifference(firstSet, secondSet);
        System.out.println(symmetricDiff);
    }
}
