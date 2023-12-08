// FRONT END
package ca.stclaircollege.mad100.fall2023.quiz4.frontend;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class VehicleApp extends Application {

    private ObservableList<Vehicle> vehicles = FXCollections.observableArrayList();
    private Label totalPriceLabel = new Label("Total Rental Price: $0.00");
    private Label activeRentalsLabel = new Label("Active Rentals: 0");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Vehicle Rental App");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.setStyle("-fx-background-color: #f0f0f0;");

        // Vehicle Type ComboBox
        ComboBox<String> vehicleTypeComboBox = new ComboBox<>();
        vehicleTypeComboBox.getItems().addAll("Car", "SUV", "Bicycle");
        vehicleTypeComboBox.setPromptText("Select Vehicle Type");
        vehicleTypeComboBox.setStyle("-fx-background-color: #ffffff;");

        // Vehicle Info Fields
        TextField brandField = new TextField();
        brandField.setPromptText("Brand");
        brandField.setStyle("-fx-background-color: #ffffff;");
        TextField modelField = new TextField();
        modelField.setPromptText("Model");
        modelField.setStyle("-fx-background-color: #ffffff;");
        TextField priceField = new TextField();
        priceField.setPromptText("Price");
        priceField.setStyle("-fx-background-color: #ffffff;");

        // Add Vehicle Button
        Button addVehicleButton = new Button("Add Vehicle");
        addVehicleButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: #ffffff;");
        addVehicleButton.setOnAction(e -> addVehicle(
                vehicleTypeComboBox.getValue(),
                brandField.getText(),
                modelField.getText(),
                Double.parseDouble(priceField.getText())
        ));

        // Display Vehicles ListView
        ListView<String> vehiclesListView = new ListView<>();
        vehiclesListView.setItems(getVehicleInfoList());

        // Remove All Vehicles Button
        Button removeAllButton = new Button("Remove All Vehicles");
        removeAllButton.setStyle("-fx-background-color: #FF5733; -fx-text-fill: #ffffff;");
        removeAllButton.setOnAction(e -> removeAllVehicles());

        // Layout Setup
        layout.getChildren().addAll(
                vehicleTypeComboBox,
                brandField,
                modelField,
                priceField,
                addVehicleButton,
                vehiclesListView,
                totalPriceLabel,
                activeRentalsLabel,
                removeAllButton
        );

        Scene scene = new Scene(layout, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addVehicle(String type, String brand, String model, double price) {
        Vehicle vehicle;
        switch (type) {
            case "Car":
                vehicle = new Car(brand, model, price);
                break;
            case "SUV":
                vehicle = new SUV(brand, model, price);
                break;
            case "Bicycle":
                vehicle = new Bicycle(brand, model, price);
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }

        vehicles.add(vehicle);
        updateDisplay();
    }

    private void removeAllVehicles() {
        vehicles.clear();
        updateDisplay();
    }

    private ObservableList<String> getVehicleInfoList() {
        ObservableList<String> infoList = FXCollections.observableArrayList();
        for (Vehicle vehicle : vehicles) {
            infoList.add(vehicle.toString());
        }
        return infoList;
    }

    private void updateDisplay() {
        ChoiceBox<String> vehiclesListView = new ChoiceBox<>();
        vehiclesListView.setItems(getVehicleInfoList());
        double totalRentalPrice = vehicles.stream().mapToDouble(Vehicle::getPrice).sum();
        totalPriceLabel.setText("Total Rental Price: $" + String.format("%.2f", totalRentalPrice));
        activeRentalsLabel.setText("Active Rentals: " + vehicles.size());
    }

    public abstract static class Vehicle {
        private String brand;
        private String model;
        private double price;

        public Vehicle(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return brand + " " + model + " - $" + String.format("%.2f", price);
        }
    }

    public static class Car extends Vehicle {
        public Car(String brand, String model, double price) {
            super(brand, model, price);
        }
    }

    public static class SUV extends Vehicle {
        public SUV(String brand, String model, double price) {
            super(brand, model, price);
        }
    }

    public static class Bicycle extends Vehicle {
        public Bicycle(String brand, String model, double price) {
            super(brand, model, price);
        }
    }
}
