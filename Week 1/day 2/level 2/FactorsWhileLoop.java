import java.util.Scanner;

class FactorsWhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int i = 1;
        if(num > 0){
            while(i<=num){
                if (num%i == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}