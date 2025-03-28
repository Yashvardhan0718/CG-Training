import java.util.*;

public class Main {

    public boolean leapYear(int year){

        boolean isleapYear = false;
        if(year%4==0 && year%100!=0 &&year%400!=0){
            isleapYear = true;
        }
        else{
            if(year%100==0){
                if(year%400==0){
                    isleapYear = true;
                }
                else{
                    isleapYear = false;
                }
            }
            else{
                isleapYear = false;
            }
        }
        return isleapYear;

    }





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int year = sc.nextInt();

        System.out.println(obj.leapYear(year));

    }

}