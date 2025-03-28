import java.util.*;

public class Main {
    public static void index(int[] arr) {
        System.out.println(arr[7]);
    }

    public static void index1(int[] arr) {
        try {
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error occurred: Illegal args");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            index(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error occurred: Illegal args");
        }
        index1(arr);
    }
}
