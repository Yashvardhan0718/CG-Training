import java.util.Scanner;
public class Height{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the height in cm: ");
		double cm = input.nextDouble();
		double inch = cm/2.54;
		double foot = inch/12;
		
		System.out.println("your height in cm is " + cm + " while in inches is " + inch + " while in foot is " + foot);
	}
}