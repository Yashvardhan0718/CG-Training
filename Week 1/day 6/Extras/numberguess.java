import java.util.Random;
import java.util.Scanner;

public class Main{

    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!found) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'higher', 'lower', or 'correct'):");
            String response = scanner.next().toLowerCase();

            if (response.equals("higher")) {
                low = guess + 1;
            } else if (response.equals("lower")) {
                high = guess - 1;
            } else if (response.equals("correct")) {
                System.out.println("Yay! I guessed your number correctly.");
                found = true;
            } else {
                System.out.println("Invalid input. Please enter 'higher', 'lower', or 'correct'.");
            }
        }


    }

    public static void main(String[] args) {
        playGame();
    }
}

