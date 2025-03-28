import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        
        float add = number1 + number2;
        float sub = number1 - number2;
        float mult = number1 * number2;
        float div = number1 / number2;
        
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f", number1,number2,add,sub,mult,div);
    }
}

