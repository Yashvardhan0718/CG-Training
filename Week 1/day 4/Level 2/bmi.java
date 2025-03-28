import java.util.Scanner;

public class main {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal Weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] bmiData = new double[10][3];
        String[] bmiStatus = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = sc.nextDouble();
            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
            bmiStatus[i] = getBMIStatus(bmiData[i][2]);
        }

        System.out.println("\nBMI Results:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + bmiData[i][0] +
                    " kg, Height = " + bmiData[i][1] + " cm, BMI = " + bmiData[i][2] +
                    ", Status = " + bmiStatus[i]);
        }

    }
}