package week4.day2.level2;

import java.util.LinkedList;
import java.util.Queue;

public class reverse {
    public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) return;
        int item = queue.remove();
        reverse(queue);
        queue.add(item);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverse(queue);
        System.out.println(queue);
    }
}

