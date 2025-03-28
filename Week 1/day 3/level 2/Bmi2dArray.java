import java.util.Scanner;
public class Bmi2dArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the num of players: ");
		int num = input.nextInt();
		
		double BMI;
		String[] weightStatus = new String[num];
		double[][] personData = new double[num][3];
		
		for(int i = 0; i<num; i++){
			System.out.println("enter the height and weight of player "+(i+1));
			double Height = input.nextDouble();
			double Weight = input.nextDouble();

			personData[i][0] = Height;
			personData[i][1] = Weight;
			BMI = Weight/((Height*Height)/10000);
			personData[i][2] = BMI;
			if (BMI <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (BMI <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (BMI <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
		}
		
		for(int i = 0; i<num; i++){
			System.out.println("height of player "+(i+1)+" "+personData[i][0]+" "+personData[i][1]+" "+personData[i][2]+" "+weightStatus[i]);
			
		}
			
	}
}