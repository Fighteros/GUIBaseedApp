package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        Text txt = new Text(20, 20, "programming is fun!");
        txt.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
        pane.getChildren().add(txt);

        Text txt0 = new Text(60, 60, "Programming is Fun\n DisplayTexy");
        pane.getChildren().add(txt0);
        Text txt1 = new Text(10, 100, "Programming is Fun\n DisplayTexy");
        txt1.setFill(Color.RED);
        txt1.setUnderline(true);
        txt1.setStrikethrough(true);
        pane.getChildren().add(txt1);

        primaryStage.setTitle("ShowText");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}
