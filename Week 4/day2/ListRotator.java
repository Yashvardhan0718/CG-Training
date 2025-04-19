package week4.day2.level1;

import java.util.ArrayList;
import java.util.List;

public class ListRotator {
    public static <T> List<T> rotateList(List<T> originalList, int positions) {
        int size = originalList.size();
        List<T> rotatedList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            rotatedList.add(originalList.get((i + positions) % size));
        }

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        List<Integer> rotated = rotateList(numbers, 2);
        System.out.println(rotated);
    }
}
