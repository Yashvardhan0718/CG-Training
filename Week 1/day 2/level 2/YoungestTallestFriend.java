import java.util.Scanner;

class YoungestTallestFriend {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int antonyAge = input.nextInt();
        
        double amarheight = input.nextDouble();
        double akbarheight = input.nextDouble();
        double antonyheight = input.nextDouble();
        
        if ((amarAge<akbarAge)&&(amarAge<antonyAge)){
            System.out.println("Amar is youngest");
        } else if ((akbarAge<amarAge) && (akbarAge<antonyAge)){
            System.out.println("Akbar is youngest");
        } else {
            System.out.println("Antony is youngest");
        }
        
        if ((amarheight>akbarheight)&&(amarheight>antonyheight)){
            System.out.println("Amar is Tallest");
        } else if ((akbarheight>amarheight) && (akbarheight>antonyheight)){
            System.out.println("Akbar is Tallest");
        } else {
            System.out.println("Antony is Tallest");
        }
    }
}