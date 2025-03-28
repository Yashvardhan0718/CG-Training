
import java.util.Scanner;

public class Main{

    public static Object[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        Object[][] result = new Object[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] > 0) {
                result[index][0] = ch;
                result[index][1] = frequency[ch];
                frequency[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        Object[][] frequencies = findCharacterFrequency(text);

        System.out.println("Character | Frequency");


        for (Object[] row : frequencies) {
            System.out.println("    " + row[0] + "     |     " + row[1]);
        }


    }
}

