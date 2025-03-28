import java.util.Scanner;

class PowerOfNumberForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int power = input.nextInt();
        
        int res = 1;
        
        for(int i = 1; i<=power; i++){
            res *= num;
        }
        System.out.println(res);
    }
}