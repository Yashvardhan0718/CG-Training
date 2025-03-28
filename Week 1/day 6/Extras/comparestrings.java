import java.util.Scanner;

public class Main{

    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1;
            }
        }

        if (len1 < len2) {
            return -1;
        } else if (len1 > len2) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = scanner.nextLine();


        int result = compareStrings(str1, str2);

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } else if (result > 0) {
            System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}