package week4.day4;

import java.util.*;

public class access {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
