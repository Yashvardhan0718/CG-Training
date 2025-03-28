import java.util.Scanner;

public class Main{

    public static String findLongestWord(String sentence) {
        StringBuilder currentWord = new StringBuilder();
        String longestWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                currentWord.append(ch);
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord.toString();
                }
                currentWord.setLength(0);
            }
        }

        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord.toString();
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String longestWord = findLongestWord(input);
        System.out.println("Longest word: " + longestWord);
    }
}