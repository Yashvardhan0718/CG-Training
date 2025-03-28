import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;

        double totalDistance = 5000;

        double rounds = totalDistance / perimeter;

       System.out.printf(rounds);
    }
}

