import java.util.*;

public class Main {
    public static String subString(String name, int startIndex, int endIndex) {
        return name.substring(startIndex, endIndex);
    }

    public static String subStringCharat(String name, int startIndex, int endIndex) {
        String substr = "";
        for (int i = startIndex; i < endIndex; i++) {
            substr += name.charAt(i);
        }
        return substr;
    }

    public static boolean compare(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        String name = sc.next();
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();

        System.out.println(obj.subString(name, startIndex, endIndex));
        System.out.println(obj.subStringCharat(name, startIndex, endIndex));
        System.out.println(obj.compare(obj.subStringCharat(name, startIndex, endIndex), obj.subString(name, startIndex, endIndex)));
    }
}
