import java.util.Scanner;

public class Main{

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        System.out.print("Fibonacci Sequence: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int terms = scanner.nextInt();

        generateFibonacci(terms);


    }
}

