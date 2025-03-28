import java.util.*;

public class Main {
    public boolean compare(String name1, String name2) {
        boolean isEquals = true;
        for (int i = 0; i < name1.length(); i++) {
            if (!Character.toString(name1.charAt(i)).equals(Character.toString(name2.charAt(i)))) {
                isEquals = false;
            }
        }
        return isEquals;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        String name1 = sc.next();
        String name2 = sc.next();

        System.out.println(obj.compare(name1, name2));
    }
}
