import java.util.Scanner;
public class PowerNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the height in cm: ");
		int height = input.nextInt();
		System.out.println("enter the weight in Kgs: ");
		int weight = input.nextInt();
		double meter = height/100.0;
		double BMI = weight/(meter*meter);
		System.out.println(BMI);
		if(BMI<=18.4){
			System.out.println("underWeight");
		}
		else if(BMI>=18.5 && BMI<=24.9){
			System.out.println("Normal");
		}
		else if(BMI>=25.0 && BMI<=39.9){
			System.out.println("OverWeight");
		}
		else{
			System.out.println("Obesity");
		}
	}
}				