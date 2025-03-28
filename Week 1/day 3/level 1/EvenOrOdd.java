import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String[] args){
		System.out.println("enter the num: ");
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		for( int i=1; i<=num; i++){
			if(i%2==0){
				System.out.println(i+" is even number");
			}
			else{
				System.out.println(i+" is odd number");
			}
		}
	}
}