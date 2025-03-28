import java.util.Scanner;

class GreatestFactorWhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int greatestFactor = 1;
        
        int i = num-1;
        
        while(i>=1){
            if(num%i == 0){
                greatestFactor = i;
                break;
            }
            i--;
        }
        
        System.out.println("The greatest factor is: "+greatestFactor);
    }
}