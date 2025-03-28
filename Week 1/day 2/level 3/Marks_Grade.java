import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int maths = input.nextInt();
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        
        double percentage = ((maths+physics+chemistry) / 300.0)*100;
        System.out.println("Average Mark: " + percentage + "%");
        
        if (percentage >= 80) {
            System.out.println("A - Level 4 above agency");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("B - Level 3 at agency normalized");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("C - Level 2 below agency normalized");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("D - Level 1 well below agency normalized");
        } else {
            System.out.println("R - Remedial standards");
        }
    }
}