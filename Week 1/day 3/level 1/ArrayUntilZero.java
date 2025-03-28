import java.util.Scanner;
public class ArrayUntilZero{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		int index = 0;
		double sum = 0;
		while(true){
			if(index==10){
				System.out.println("the array is full");
				break;
			}
			double num = input.nextInt();
			if (num<=0){
				break;
			}
			array[index]=num;
			index++;
		}
		
		for(int i = 0; i<index; i++){
			sum += array[i];
			
		}
		System.out.println(sum);
	}
}