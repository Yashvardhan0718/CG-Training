import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[][] generateMarks(int numStudents) {
        int[][] marks = new int[numStudents][3];
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = 50 + random.nextInt(51); // Physics (50-100)
            marks[i][1] = 50 + random.nextInt(51); // Chemistry (50-100)
            marks[i][2] = 50 + random.nextInt(51); // Math (50-100)
        }
        return marks;
    }

    public static double[][] calculateScores(int[][] marks) {
        int numStudents = marks.length;
        double[][] scores = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            scores[i][0] = total;
            scores[i][1] = Math.round(average * 100.0) / 100.0; // Rounding to 2 decimal places
            scores[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounding to 2 decimal places
        }
        return scores;
    }

    public static void displayScorecard(int[][] marks, double[][] scores) {

        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");


        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-5d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    scores[i][0], scores[i][1], scores[i][2]);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = generateMarks(numStudents);
        double[][] scores = calculateScores(marks);
        displayScorecard(marks, scores);

        scanner.close();
    }
}

