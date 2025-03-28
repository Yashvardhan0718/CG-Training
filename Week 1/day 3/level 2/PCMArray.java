import java.util.Scanner;
public class PCMArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of students: ");
		int num = input.nextInt();
		double[] TotalMarks = new double[num];
		double[] percentage = new double[num];
		
		for(int i =0; i<num; i++){
			System.out.println("Student "+(i+1));
			System.out.println("enter the marks for Physics: ");
			int phy = input.nextInt();
			System.out.println("enter the marks for Chemistry: ");
			int che = input.nextInt();
			System.out.println("enter the marks for Maths: ");
			int mat = input.nextInt();
			TotalMarks[i] = phy + che + mat;
			percentage[i] = (TotalMarks[i]/300)*100;
			if(percentage[i]>=80){
			System.out.println("Grade: 'A'");
			System.out.println("Remarks: 'Level 4, above agency-normalized standards'");
		}
		else if(percentage[i]>=70 && percentage[i]<=79){
			System.out.println("Grade: 'B'");
			System.out.println("Remarks: 'Level 3, at agency-normalized standards'");
		}
		else if(percentage[i]>=60 && percentage[i]<=69){
			System.out.println("Grade: 'C'");
			System.out.println("Remarks: 'Level 2, below, but approaching agency-normalized standards'");
		}
		else if(percentage[i]>=50 && percentage[i]<=59){
			System.out.println("Grade: 'D'");
			System.out.println("Remarks: 'Level 3, well below agency-normalized standards'");
		}
		else if(percentage[i]>=40 && percentage[i]<=49){
			System.out.println("Grade: 'E'");
			System.out.println("Remarks: 'Level 3, too below agency-normalized standards'");
		}
		else{
			System.out.println("Grade: 'R'");
			System.out.println("Remarks: 'Remedial standards'");
		}
		}
	}
}				