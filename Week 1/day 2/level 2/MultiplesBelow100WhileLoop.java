import java.util.Scanner;

class MultiplesBelow100WhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int i = 1;
        
        if ((num>0) && (num<=100)){
            while(i<=num){
                if(num%i == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}