package week4.day2.level1;

import java.util.LinkedList;
import java.util.ListIterator;

public class finder {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        ListIterator<T> firstPointer = list.listIterator();
        ListIterator<T> secondPointer = list.listIterator();

        for (int i = 0; i < n; i++) {
            if (firstPointer.hasNext()) {
                firstPointer.next();
            } else {
                return null;
            }
        }

        while (firstPointer.hasNext()) {
            firstPointer.next();
            secondPointer.next();
        }

        return secondPointer.next();
    }

    public static void main(String[] args) {
        LinkedList<String> elements = new LinkedList<>();
        elements.add("A");
        elements.add("B");
        elements.add("C");
        elements.add("D");
        elements.add("E");

        String result = findNthFromEnd(elements, 2);
        System.out.println(result);
    }
}
