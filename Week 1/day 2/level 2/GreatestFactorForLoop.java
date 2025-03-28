import java.util.Scanner;

class GreatestFactorForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int greatestFactor = 1;
        
        for(int i = num-1; i>=1; i--){
            if(num%i == 0){
                greatestFactor = i;
                break;
            }
        }
        System.out.println(greatestFactor);
    }
}