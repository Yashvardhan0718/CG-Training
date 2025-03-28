import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        float celsius = input.nextFloat();
        
        float fahrenheit = (celsius * (9/5)) + 32;
        
        System.out.println("The " +celsius+" celsius is " + fahrenheit+ " fahrenheit");
        
    }
}


