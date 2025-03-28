import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean isLeapYear = true;
        int year = input.nextInt();
        if(year>=1582){
            if ((year%4 == 0)&&(year%100 != 0)&&(year%400 != 400)){
                isLeapYear = true;
            } 
            else {
                if ((year%100 == 0) && (year%400 ==0)){
                    isLeapYear = true;
                }
                else{
                    isLeapYear = false;
                }
            }
            System.out.println("Leap year: "+isLeapYear);
        } else{
            System.out.println("Wrong input");
        }
    }
}