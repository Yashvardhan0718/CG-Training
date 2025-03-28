import java.util.Scanner;

public class Main {


    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }


    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }


    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }


    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }


    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }


    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }


    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }


    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }


    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in km: ");
        double km = sc.nextDouble();

        System.out.print("Enter value in miles: ");
        double miles = sc.nextDouble();

        System.out.print("Enter value in meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter value in feet: ");
        double feet = sc.nextDouble();

        System.out.print("Enter value in yards: ");
        double yards = sc.nextDouble();

        System.out.print("Enter value in inches: ");
        double inches = sc.nextDouble();

        System.out.println("\nConversions:");
        System.out.println(km + " km to miles: " + convertKmToMiles(km));
        System.out.println(miles + " miles to km: " + convertMilesToKm(miles));
        System.out.println(meters + " meters to feet: " + convertMetersToFeet(meters));
        System.out.println(feet + " feet to meters: " + convertFeetToMeters(feet));
        System.out.println(yards + " yards to feet: " + convertYardsToFeet(yards));
        System.out.println(feet + " feet to yards: " + convertFeetToYards(feet));
        System.out.println(meters + " meters to inches: " + convertMetersToInches(meters));
        System.out.println(inches + " inches to meters: " + convertInchesToMeters(inches));
        System.out.println(inches + " inches to centimeters: " + convertInchesToCentimeters(inches));

        sc.close();
    }
}

