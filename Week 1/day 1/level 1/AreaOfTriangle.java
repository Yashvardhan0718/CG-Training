import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int height = input.nextInt();
        int base = input.nextInt();
        
        double areaCm = 0.5*height*base;
        double areaInches = areaCm * 2.54;
        
        System.out.println("Area of triangle in Centimeter square: "+areaCm+" and inches square is: "+areaInches);
        
    }
}
