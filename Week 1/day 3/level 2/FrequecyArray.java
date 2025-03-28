import java.util.Scanner;
public class FrequecyArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of students: ");
		int num = input.nextInt();
		int[] frequency = new int[num];
		int index = 0;
		
		for(int i=0; i<=9; i ++){
			if(num%10 == i){
				frequency[i] = index++;
			}
		}
		for(int i =0; i<=9; i++){
			System.out.println(i+ " = "+frequency[i]);
		}
		
	}
}				