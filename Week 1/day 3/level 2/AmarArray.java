import java.util.Scanner;
public class BonusArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] age = new int[4];
		int[] height = new int[4];
		int indexage = 0;
		int indexheight = 0;
		String[] name = {"Amar","akbar","antony"};
		for(int i = 0; i<3; i++){
			System.out.println("enter the age and height of " +(i+1));
			age[indexage]=input.nextInt();
			indexage++;
			height[indexheight]=input.nextInt();
			indexheight++;
		}	
		int youngest = 0;
		for(int i = 1; i<3; i++){
			if(age[i]<age[youngest]){
				youngest = i;
			}
		}
		System.out.println(name[youngest]+" is the youngest");
		int tallest = 0;
		for(int i = 1; i<3; i++){
			if(age[i]<age[tallest]){
				tallest = i;
			}
		}
		System.out.println(name[tallest]+" is the tallest");
			
	}
}