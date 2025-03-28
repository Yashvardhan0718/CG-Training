import java.util.Scanner;

class MultiplesBelow100ForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        if ((num>0) && (num<=100)){
            for(int i=1; i<=num; i++){
                if(num%i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}