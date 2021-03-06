package multiple_scenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleScenes extends Application {
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Multiple scenes demo");

        Label label = new Label("Welcome to the first scene");
        Button button = new Button("Go to scene two");
        button.setOnAction(e -> window.setScene(scene2));

        // Layout 1 for the first scene
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label, button);
        scene1 = new Scene(layout1, 300, 300);

        Label label2 = new Label("Welcome to the second scene");
        Button button2 = new Button("Go back to scene one");
        button2.setOnAction(e -> window.setScene(scene1));

        // Layout 1 for the first scene
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 300, 300);

        window.setScene(scene1);
        window.show();
    }
}
