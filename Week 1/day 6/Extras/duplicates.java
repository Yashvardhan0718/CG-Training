import java.util.Scanner;

public class Main{

    public static String removeDuplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String modifiedString = removeDuplicateCharacters(input);
        System.out.println("String after removing duplicates: " + modifiedString);
    }
}