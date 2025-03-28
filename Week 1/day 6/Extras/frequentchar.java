import java.util.Scanner;

public class Main{

    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256];
        int maxFreq = 0;
        char mostFrequentChar = ' ';

        for (char ch : str.toCharArray()) {
            frequency[ch]++;

            if (frequency[ch] > maxFreq) {
                maxFreq = frequency[ch];
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char result = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}

