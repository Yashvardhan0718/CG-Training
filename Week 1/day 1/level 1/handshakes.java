import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int numberOfStudents = input.nextInt();
        
        int handshakes = (numberOfStudents*(numberOfStudents-1))/2;
        
        System.out.println("The possible no of handshakes is " + handshakes);
        
    }
}