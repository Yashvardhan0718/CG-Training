import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int feet = input.nextInt();
        
        double totalYards = (double)feet/3;
        
        double miles = totalYards/1760;
        double yards = totalYards%1760;
        
        System.out.println("Distance in yards is: "+ yards+ " and in miles is: "+miles);
        
    }
}

