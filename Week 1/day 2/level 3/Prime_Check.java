import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        boolean isPrime = true;
        
        if(num <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Is prime: " + isPrime);
    }
}