import java.util.Scanner;

public class Main{

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] charCount = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            charCount[text1.charAt(i)]++;
            charCount[text2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine();

        boolean result = areAnagrams(text1, text2);

        System.out.println(result ? "The texts are anagrams" : "The texts are not anagrams");


    }
}