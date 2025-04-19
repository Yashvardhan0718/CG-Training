package week4.day2.level2;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> primary = new LinkedList<>();
    Queue<Integer> secondary = new LinkedList<>();

    public void push(int x) {
        secondary.add(x);
        while (!primary.isEmpty()) {
            secondary.add(primary.remove());
        }
        Queue<Integer> temp = primary;
        primary = secondary;
        secondary = temp;
    }

    public int pop() {
        return primary.remove();
    }

    public int top() {
        return primary.peek();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
    }
}

