package week4.day2.level2;

public class CircularBuffer {
    private int[] buffer;
    private int size;
    private int start;
    private int count;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        start = 0;
        count = 0;
    }

    public void insert(int value) {
        int index = (start + count) % size;
        buffer[index] = value;
        if (count < size) {
            count++;
        } else {
            start = (start + 1) % size;
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(start + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display();
        buffer.insert(4);
        buffer.display();
    }
}
