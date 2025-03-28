import java.util.*;

public class Main {
    public static void exception() {
        String name = null;
        System.out.println(name.length());
    }

    public static void exception2() {
        String name1 = null;
        try {
            System.out.println(name1.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }

    public static void main(String[] args) {
        try {
            exception();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
        exception2();
    }
}
