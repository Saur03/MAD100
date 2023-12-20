import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EnhancedJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        // Top HBox with Buttons
        HBox topHBox = new HBox(10); // 10px spacing
        topHBox.getChildren().addAll(
            new Button("Button 1"), 
            new Button("Button 2"), 
            new Button("Button 3")
        );
        borderPane.setTop(topHBox);

        // Bottom VBox with Labels
        VBox bottomVBox = new VBox(5); // 5px spacing
        bottomVBox.getChildren().addAll(
            new Label("Label 1"), 
            new Label("Label 2"), 
            new Label("Label 3")
        );
        borderPane.setBottom(bottomVBox);

        // Center StackPane with ImageView and Text
        StackPane centerStackPane = new StackPane();
        Image image = new Image("path/to/image.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(200); // Adjust size as needed
        imageView.setPreserveRatio(true);
        Text overlayText = new Text("Overlay Text");
        centerStackPane.getChildren().addAll(imageView, overlayText);
        borderPane.setCenter(centerStackPane);

        // Scene and Stage setup
        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setTitle("JavaFX Application with StackPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}