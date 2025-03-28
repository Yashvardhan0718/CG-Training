import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        String fromCity = input.nextLine();
        String viaCity = input.nextLine();
        String toCity = input.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in hours): ");
        double timeFromToVia = input.nextDouble();
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in hours): ");
        double timeViaToFinalCity = input.nextDouble();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

       
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("Traveling from " + fromCity + " to " + toCity + " via " + viaCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalTime + " hours");
    }
}

