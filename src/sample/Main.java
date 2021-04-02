package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Scene scn = new Scene(new LinePane());
        primaryStage.setTitle("ShowLine");
        primaryStage.setScene(scn);
        primaryStage.show();

    }

    class LinePane extends Pane {
        public LinePane() {
            Line line0 = new Line(10, 10, 10, 10);
            line0.endXProperty().bind(widthProperty().subtract(10));
            line0.endYProperty().bind(heightProperty().subtract(10));
            line0.setStrokeWidth(5);
            line0.setStroke(Color.GREEN);
            getChildren().add(line0);

            Line line1 = new Line(10, 10, 10, 10);
            line1.startXProperty().bind(widthProperty().subtract(10));
            line1.endYProperty().bind(heightProperty().subtract(10));
            line1.setStrokeWidth(5);
            line1.setStroke(Color.GREEN);
            getChildren().add(line1);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
