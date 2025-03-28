import java.util.Scanner;

public class Main{

    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();

        scanner.close();

        int occurrences = countOccurrences(mainString, subString);
        System.out.println("Occurrences of \"" + subString + "\": " + occurrences);
    }
}

