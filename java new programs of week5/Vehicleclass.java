// Vehicle class (Base class)
class Vehicle {
    private double basePrice;

    // Constructor
    public Vehicle(double basePrice) {
        this.basePrice = basePrice;
    }

    // Getter and setter for basePrice
    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}

// Car class (Subclass of Vehicle)
class Car extends Vehicle {
    private String model;

    // Constructor
    public Car(double basePrice, String model) {
        super(basePrice);
        this.model = model;
    }

    // Getter and setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Pricing strategy for Car
    public double calculateRentalPrice() {
        double rentalPrice = getBasePrice(); // Base rental price

        // Additional charge for SUV model
        if ("SUV".equals(model)) {
            rentalPrice += 40.0;
        }

        return rentalPrice;
    }
}

// Bicycle class (Subclass of Vehicle)
class Bicycle extends Vehicle {
    // Constructor with flat rental price
    public Bicycle(double flatRentalPrice) {
        super(flatRentalPrice);
    }

    // Pricing strategy for Bicycle
    public double calculateRentalPrice() {
        return getBasePrice(); // Flat rental price for bicycles
    }
}

// Main class for testing
public class VehicleRentalService {
    public static void main(String[] args) {
        // Example usage
        Car car = new Car(80.0, "SUV");
        Bicycle bicycle = new Bicycle(30.0);

        // Display rental prices
        System.out.println("Car Rental Price: $" + car.calculateRentalPrice());
        System.out.println("Bicycle Rental Price: $" + bicycle.calculateRentalPrice());
    }
}
