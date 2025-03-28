import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double salary = input.nextDouble();
        double bonus = input.nextDouble();
        
        System.out.println("The salary is INR " +salary+ " and bonus is INR " + bonus+ " Hence Total Income is INR " + (salary+bonus));
        
    }
}

