import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int count = 1;
        
        while(num != 0){
            count = count * num;
            num--;
        }
        System.out.println("the factorial of given number is: "+ count);
    }
}