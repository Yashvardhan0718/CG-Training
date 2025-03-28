import java.util.Scanner;
public class FrequencyArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = input.nextInt();
		int[] frequency = new int[num];
	
		
		while(num>0){
			int digit = num%10;
			frequency[digit]++;
			num /= 10;
		}
		
		for(int i =0; i<=9; i++){
			System.out.println(i+ " = "+frequency[i]);
		}
		
	}
}				