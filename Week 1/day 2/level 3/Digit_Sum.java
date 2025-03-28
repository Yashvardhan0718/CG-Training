import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int res = 0;
        int add = 0;
        
        while(num != 0){
            res = num % 10;
            add += res;
            num /= 10;
        }
        System.out.println("Sum of digits: " + add);
    }
}