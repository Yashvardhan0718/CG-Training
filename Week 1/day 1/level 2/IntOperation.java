import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int inputOp1 = a + b * c;
        int inputOp2 = a * b + c;
        double inputOp3 = (double)(c + a / b);
        double inputOp4 = (double)(a % b + c);
        
        System.out.println(" The results of Int Operations are \n"+inputOp1+"\n"+inputOp2+"\n"+inputOp3+"\n"+inputOp4);
        
        
    }
}

