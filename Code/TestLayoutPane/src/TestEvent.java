
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SirGeT
 */
public class TestEvent extends Application {

    private CirclePane circlepane = new CirclePane();

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hbox.getChildren().addAll(btEnlarge, btShrink);
        pane.setBottom(hbox);
        pane.setCenter(circlepane);
        btEnlarge.setOnAction(new EnlargeHandler());
        
        btShrink.setOnAction(e->circlepane.shrink());

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private class EnlargeHandler implements EventHandler<ActionEvent> {

        public EnlargeHandler() {

        }

        @Override
        public void handle(ActionEvent arg0) {
            circlepane.enlarge();
        }
    }

    
}

class CirclePane extends StackPane {

    private Circle circle = new Circle(20);

    CirclePane() {
        circle.setFill(Color.RED);
        circle.setStroke(Color.GREEN);
        getChildren().add(circle);
    }

    void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }

    void shrink() {
        circle.setRadius(circle.getRadius() - 2);
    }

}
