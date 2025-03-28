import java.util.Scanner;

class PowerOfNumberWhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int power = input.nextInt();
        
        int res = 1;
        int i =1;
        while(i<=power){
            res *= num;
            i++;
        }
        System.out.println(res);
    }
}