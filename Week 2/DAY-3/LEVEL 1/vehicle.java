import java.util.Scanner;


class Vehicle {
   private String ownerName;
   private String vehicleType;
   private static int registrationFee = 1000;
   Vehicle(String ownerName, String vehicleType) {
       this.ownerName = ownerName;
       this.vehicleType = vehicleType;
   }
   void displayVehicleDetails() {
       System.out.println("\nOwner of Vehicle: " + ownerName);
       System.out.println("Type of Vehicle: " + vehicleType);
       System.out.println("Registration Fee: " + registrationFee);
   }
   static void updateRegistrationFee(int newRegistrationFee) {
       registrationFee = newRegistrationFee;
   }
}
class Toyota {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter owner name: ");
       String a = input.nextLine();
       System.out.print("Enter Vehicle type: ");
       String b = input.nextLine();
       if (b.equalsIgnoreCase("SUV")) {
           Vehicle.updateRegistrationFee(5000);
       }
       Vehicle ss = new Vehicle(a, b);
       ss.displayVehicleDetails();
       input.close();
   }
}
