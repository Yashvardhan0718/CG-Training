import java.util.Scanner;

class Main {

    public static String getMonth(int monthNumber){
        String[] month = {"January","February","March","April","May","June","July","August","Septempber","October","November","December"};
        return month[monthNumber-1];
    }

    public static int noOfDays(int monthNumber,int yearNumber){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if((monthNumber == 2) && isLeapYear(yearNumber)){
            return 29;
        }
        return days[monthNumber-1];
    }

    public static boolean isLeapYear(int year){
        boolean isleapyear = false;
        if(year%4==0 && year%100!=0 &&year%400!=0){
            isleapyear = true;
        }
        else{
            if(year%100==0){
                if(year%400==0){
                    isleapyear = true;
                }
                else{
                    isleapyear = false;
                }
            }
            else{
                isleapyear = false;
            }
        }
        return isleapyear;

    }

    public static String firstDay(int monthNumber, int yearNumber){
        int day = 0;
        int x = 0;

        yearNumber = yearNumber - (14 - monthNumber) / 12;
        x = yearNumber + yearNumber/4 - yearNumber/100 + yearNumber/400;
        monthNumber = monthNumber + 12 * ((14 - monthNumber) / 12) - 2;
        day = (day + x + 31*monthNumber / 12) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[day+1];
    }

    public static void printCalender(int monthNumber,int yearNumber){
        String monthName = getMonth(monthNumber);
        int daysInMonth = noOfDays(monthNumber,yearNumber);
        String firstDayName = firstDay(monthNumber,yearNumber);
        System.out.println("  Sun Mon Tue Wed Thu Fri Sat");

        int startDay = 0;
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < days.length; i++) {
            if (days[i] == (firstDayName)) {
                startDay = i;
                break;
            }
        }
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d",day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main obj = new Main();

        System.out.println("Enter month (1-12): ");
        int monthNumber = input.nextInt();
        System.out.println("Enter year");
        int yearNumber = input.nextInt();
        System.out.println(obj.getMonth(monthNumber)+" "+yearNumber);
        System.out.print("No.of days: ");
        System.out.println(obj.noOfDays(monthNumber,yearNumber));

        printCalender(monthNumber,yearNumber);
    }
}

