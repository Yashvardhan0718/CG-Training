
interface Insurable {
    double calculateInsurance();
    int getInsuranceDetails();
}

abstract class Vehicle {
    String vehicleNumber;
    String type;
    double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    abstract double calculateRentalCost(int days);

    void displayVehicle() {
        System.out.println("Vehicle Number Plate: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
    }
}
class Car extends Vehicle implements Insurable {
    Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.1; // 10% of rental rate as insurance
    }

    @Override
    public int getInsuranceDetails() {
        return 12; // For example, insurance valid for 12 months
    }

    @Override
    void displayVehicle() {
        System.out.println("Vehicle Type = Car");
        super.displayVehicle();
        System.out.println("Insurance: " + calculateInsurance());
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    void displayVehicle() {
        System.out.println("Vehicle Type = Bike");
        super.displayVehicle();
    }
}

 class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("TN 32 546", "Sedan", 2000);
        Bike bike = new Bike("KA02CD5678", "Sports", 500);
        car.displayVehicle();
        System.out.println("Rental Cost for 3 days: " + car.calculateRentalCost(3));
        System.out.println("Insurance Details: " + car.getInsuranceDetails() + " months\n");
        bike.displayVehicle();
        System.out.println("Rental Cost for 2 days: " + bike.calculateRentalCost(2));
    }
}
