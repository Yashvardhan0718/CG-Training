import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double userInput;

        while(true){
            userInput = input.nextDouble();
            if ((userInput == 0) || (userInput < 0)){
                break;
            }

            total = total + userInput;
        }
        System.out.println(total);
    }
}