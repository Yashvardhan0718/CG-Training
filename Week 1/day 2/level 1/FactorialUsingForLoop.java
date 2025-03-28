import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int count = 1;
        
        for(int i = 1; i<=num; i++){
            count = count*i;
        }
        System.out.println("The factorial of given number is: "+ count);
    }
}