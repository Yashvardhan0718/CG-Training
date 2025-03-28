import java.util.Scanner;

public class SimpleCalculator {

    public static double calculate(double a, double b, char operator) {
        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return 0;
            }
            return a / b;
        } else {
            System.out.println("Invalid operator. Use +, -, *, or /.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        if (operator == '/' && num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            double result = calculate(num1, num2, operator);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operator. Use +, -, *, or /.");
        }


    }
}

