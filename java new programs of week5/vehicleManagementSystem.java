import java.util.ArrayList;
import java.util.List;

// Vehicle Management System class
class VehicleManagementSystem {
    private List<Vehicle> vehicles;

    // Constructor
    public VehicleManagementSystem() {
        this.vehicles = new ArrayList<>();
    }

    // Method to add a vehicle to the system
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Method to calculate rental prices for all vehicles in the system
    public void calculateRentalPrices() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getClass().getSimpleName());
            System.out.println("Rental Price: $" + vehicle.calculateRentalPrice());
            System.out.println(); // Add a line break for clarity
        }
    }
}

// Main class for demonstration
public class VehicleRentalDemo {
    public static void main(String[] args) {
        // Create a Vehicle Management System
        VehicleManagementSystem vehicleSystem = new VehicleManagementSystem();

        // Add two Car objects (one SUV and one Sedan) and one Bicycle object
        Car suvCar = new Car(80.0, "SUV");
        Car sedanCar = new Car(80.0, "Sedan");
        Bicycle bicycle = new Bicycle(30.0);

        // Add vehicles to the system
        vehicleSystem.addVehicle(suvCar);
        vehicleSystem.addVehicle(sedanCar);
        vehicleSystem.addVehicle(bicycle);

        // Calculate and display rental prices for all vehicles
        vehicleSystem.calculateRentalPrices();
    }
}
