import java.util.Scanner;
public class Largest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		if(num1>num2 && num1>num3){
			System.out.println("Is the first number the Largest? yes");
			System.out.println("Is the second number the Largest? no");
			System.out.println("Is the third number the Largest? no");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("Is the first number the Largest? no");
			System.out.println("Is the second number the Largest? yes");
			System.out.println("Is the third number the Largest? no");
		}
		else{
			System.out.println("Is the first number the Largest? no");
			System.out.println("Is the second number the Largest? no");
			System.out.println("Is the third number the Largest? yes");
		}
	}
}