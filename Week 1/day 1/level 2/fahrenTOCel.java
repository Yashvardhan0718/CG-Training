import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        float fahrenheit = input.nextFloat();
        
        float celsius = (fahrenheit - 32)*(5/9);
        
        System.out.println("The " +fahrenheit+" fahrenheit is " + celsius+ " celsius");
        
    }
}