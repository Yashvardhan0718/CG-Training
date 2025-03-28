import java.util.Scanner;

class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number >= 0){
            int res = (number * (number + 1)) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + res);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}