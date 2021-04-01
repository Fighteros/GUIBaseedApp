package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new CustomPane("Top"));
        borderPane.setRight(new CustomPane("Right"));
        borderPane.setBottom(new CustomPane("Bottom"));
        borderPane.setLeft(new CustomPane("Left"));
        borderPane.setCenter(new CustomPane("Center"));

        Scene scene = new Scene(borderPane, 200, 250);
        primaryStage.setTitle("borderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
