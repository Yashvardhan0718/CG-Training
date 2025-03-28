import java.util.Scanner;
public class ReverseArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = input.nextInt();
		int maxDigits = 10;
		int index = 0;
		int[] digits = new int[maxDigits];
		
		while(num!=0){
			digits[index] = num%10;
			num /= 10;
			index++;
		}
		for(int i =0; i<index; i++){
			System.out.println(digits[i]);
		}
			
		
		
	}
}