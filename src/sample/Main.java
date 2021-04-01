package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        FlowPane fPane = new FlowPane();
        fPane.setPadding(new Insets(11, 12, 13, 14));
        fPane.setHgap(5);
        fPane.setVgap(5);

        fPane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        fPane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
        Scene scn = new Scene(fPane, 200, 250);
        primaryStage.setTitle("Show FlowPane");
        primaryStage.setScene(scn);
        primaryStage.show();

        Stage nwStage = new Stage();
        GridPane grdPane = new GridPane();

        grdPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grdPane.setAlignment(Pos.CENTER);
        grdPane.setHgap(5.5);
        grdPane.setVgap(5.5);

        grdPane.add(new Label("First Name"), 0, 0);
        grdPane.add(new TextField(), 1, 0);
        grdPane.add(new Label("Middle Name"), 0, 1);
        grdPane.add(new TextField(), 1, 1);
        grdPane.add(new Label("last Name"), 0, 2);
        grdPane.add(new TextField(), 1, 2);

        Button btAdd = new Button("Add Name");
        grdPane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        Scene scene = new Scene(grdPane);
        nwStage.setTitle("new stage GirdPane");
        nwStage.setScene(scene);
        nwStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
