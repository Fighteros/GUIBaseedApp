package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class CustomPane extends StackPane {
    public CustomPane(String s) {
        getChildren().add(new Label(s));
        setStyle("-fx-border-color: red");
        setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    }
}
