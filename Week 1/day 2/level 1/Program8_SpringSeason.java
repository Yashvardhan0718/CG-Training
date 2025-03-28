import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the month number: ");
        int month = input.nextInt();
        System.out.println("enter the date: ");
        int date = input.nextInt();

        if ((month == 3 && date >= 20) || (month > 3 && month < 6) || (month == 6 && date <= 20)) {
            System.out.println("It's a spring season!");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}