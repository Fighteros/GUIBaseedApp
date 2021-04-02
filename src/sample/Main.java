package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane brdPane = new BorderPane();
        brdPane.setTop(getHbox());
        brdPane.setLeft(getVbox());

        Scene scn = new Scene(brdPane);
        primaryStage.setTitle("ShowHboxVbox");
        primaryStage.setScene(scn);
        primaryStage.show();
    }

    private HBox getHbox(){
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        ImageView imageView = new ImageView(new Image("sample/image/us.gif"));
        hBox.getChildren().add(imageView);
        return hBox;
    }

    private VBox getVbox() {
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("Courses"));
        Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 2410"), new Label("CSCI 3720")};
        for (Label course : courses) {
            vBox.setMargin(course, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(course);
        }
        return vBox;

    }


    public static void main(String[] args) {
        launch(args);
    }
}
