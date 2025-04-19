package week4.day2.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class reverse {
    public static <T> List<T> reverseList(List<T> originalList) {
        List<T> reversedList = new ArrayList<>();
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        List<Integer> reversedArrayList = reverseList(arrayList);
        List<Integer> reversedLinkedList = reverseList(linkedList);

        System.out.println(reversedArrayList);
        System.out.println(reversedLinkedList);
    }
}
