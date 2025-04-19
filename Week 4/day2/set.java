package week4.day2.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class set {
    public static List<Integer> convertToSortedList(Set<Integer> numberSet) {
        List<Integer> sortedList = new ArrayList<>(numberSet);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        List<Integer> result = convertToSortedList(numbers);
        System.out.println(result);
    }
}
