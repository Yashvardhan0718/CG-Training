import java.util.*;

public class Main {
    public static void index(String name) {
        System.out.println(name.substring(5, 2));
    }

    public static void index1(String name) {
        try {
            System.out.println(name.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Error occurred: Illegal args");
        } catch (RuntimeException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        try {
            index(name);
        } catch (IllegalArgumentException e) {
            System.out.println("Error occurred: Illegal args");
        } catch (RuntimeException e) {
            System.out.println("Error");
        }
        index1(name);
    }
}
