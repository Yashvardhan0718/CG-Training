import java.util.*;

public class Main {
    public static void index(String name) {
        int no = Integer.parseInt(name);
        System.out.println(no);
    }

    public static void index1(String name) {
        try {
            int no = Integer.parseInt(name);
            System.out.println(no);
        } catch (NumberFormatException e) {
            System.out.println("Error occurred: Illegal args");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        try {
            index(name);
        } catch (NumberFormatException e) {
            System.out.println("Error occurred: Illegal args");
        }
        index1(name);
    }
}
