import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double inputOp1 = a + b * c;
        double inputOp2 = a * b + c;
        double inputOp3 = (c + a / b);
        double inputOp4 = (a % b + c);
        
        System.out.println(" The results of Int Operations are \n"+inputOp1+"\n"+inputOp2+"\n"+inputOp3+"\n"+inputOp4);
        
        
    }
}