import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class UltraSimpleJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Label
        Label simpleLabel = new Label("Welcome to JavaFX!");

        // Scene - Directly adding the label to the scene
        Scene scene = new Scene(simpleLabel, 300, 200);

        // Setting up the Stage (Window)
        primaryStage.setTitle("Ultra Simple JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}