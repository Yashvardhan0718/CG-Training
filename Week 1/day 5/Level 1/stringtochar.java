import java.util.*;

public class Main {
    public static char[] subStringCharat(String name) {
        char[] substr = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            substr[i] = name.charAt(i);
        }
        return substr;
    }

    public static boolean compare(char[] str1, char[] str2) {
        return Arrays.equals(str1, str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        String name = sc.next();
        char[] charArray = name.toCharArray();

        System.out.println(obj.subStringCharat(name));
        System.out.println(obj.compare(obj.subStringCharat(name), charArray));
    }
}
