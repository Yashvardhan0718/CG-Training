import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double heightCentimeters = input.nextDouble();
        
        double totalInches = heightCentimeters/2.54;
        int foot = (int)totalInches/12;
        double inches = totalInches%12;
        
        System.out.println("Your Height in cm is " + heightCentimeters + "while in feet is " + foot +" and inches is " +inches );
        
    }
}


