import java.util.*;

public class Main {
    public static void index(String name) {
        System.out.println(name.charAt(name.length()));
    }

    public static void index1(String name) {
        try {
            System.out.println(name.charAt(name.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error occurred: index out of bounds");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        try {
            index(name);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error occurred: index out of bounds");
        }
        index1(name);
    }
}
