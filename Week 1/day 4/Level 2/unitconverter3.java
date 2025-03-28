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

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
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

        System.out.print("Enter value in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.print("Enter value in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter value in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter value in kilograms: ");
        double kilograms = sc.nextDouble();

        System.out.print("Enter value in gallons: ");
        double gallons = sc.nextDouble();

        System.out.print("Enter value in liters: ");
        double liters = sc.nextDouble();

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
        System.out.println(fahrenheit + " Fahrenheit to Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println(celsius + " Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        System.out.println(pounds + " pounds to kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println(kilograms + " kilograms to pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println(gallons + " gallons to liters: " + convertGallonsToLiters(gallons));
        System.out.println(liters + " liters to gallons: " + convertLitersToGallons(liters));


    }
}