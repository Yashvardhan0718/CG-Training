import java.util.Scanner;
public class BonusArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double bonus;
		double[] newSalary = new double[11];
		double[] salary = new double[11];
		int[] years = new int[11];
		for(int i = 0; i<10; i++){
			System.out.println("enter the number of years for employee "+(i+1));
			
			years[i] = input.nextInt();
			System.out.println("enter the salary for employee "+(i+1));
			
			salary[i] = input.nextDouble();
			
			if(years[i]>=5){
				bonus = (salary[i]*5)/100;
			}
			else{
				bonus = (salary[i]*2)/100;
			}
			newSalary[i] = bonus +salary[i];
		}	
		for(int i = 0; i<10; i++){
			
			System.out.println("new salary of the employee "+(i+1)+" is "+newSalary[i]);
			
		}	
	}
}