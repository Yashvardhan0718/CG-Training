import java.util.Scanner;

public class Main{

    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);
            String status = getBMIStatus(bmi);

            results[i][0] = String.format("%.1f cm", heightCm);
            results[i][1] = String.format("%.1f kg", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }

        return results;
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Results:");
        System.out.printf("%-12s %-12s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");


        for (String[] row : results) {
            System.out.printf("%-12s %-12s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        String[][] results = calculateBMI(data);
        displayResults(results);


    }
}

