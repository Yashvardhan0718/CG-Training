import java.util.Scanner;

public class Main {

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            throw new ArithmeticException("Slope is undefined (vertical line).");
        }
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        try {
            double[] equation = findLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }
}