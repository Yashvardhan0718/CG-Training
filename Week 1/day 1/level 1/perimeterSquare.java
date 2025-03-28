import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int perimeter = input.nextInt();
        
        int side = perimeter/4;
        
        System.out.println("The length of the side is "+ side+ " whose perimeter is "+ perimeter);
        
    }
}