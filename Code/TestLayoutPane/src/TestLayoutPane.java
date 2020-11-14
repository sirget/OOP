
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
public class TestLayoutPane extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //testFlowPane(stage);
        //testGridPane(stage);
        testBorderPane(stage);
        
    }
    void testFlowPane(Stage stage){
        FlowPane flowpane = new FlowPane();
        flowpane.setPadding(new Insets(10,10,10,10));
        flowpane.setHgap(5); flowpane.setVgap(5);
        Label name = new Label("Get");
        Label surname = new Label("inw");
        flowpane.getChildren().add(name);
        flowpane.getChildren().add(surname);
        Scene scene = new Scene(flowpane,100,100);
        stage.setScene(scene);
        stage.show();
        
    }
    void testGridPane(Stage stage){
        GridPane pane = new GridPane();
        pane.setHgap(10); pane.setVgap(10);
        Label name = new Label("Get");
        Label surname = new Label("inw");
        Button btHello = new Button("Hello");
        Button btBye = new Button("Bye Bye");
        pane.add(name ,0 ,0);
        pane.add(btHello, 1, 0);
        pane.add(btBye, 0, 1);
        pane.add(surname, 1, 1);
        Scene scene = new Scene(pane,200,200);
        stage.setScene(scene);
        stage.show();
    }
    void testBorderPane(Stage stage){
        BorderPane pane = new BorderPane();
        HBox hbox = new HBox();
        hbox.getChildren().add(new Label("Math"));
        hbox.getChildren().add(new Label("Phy"));
        hbox.getChildren().add(new Label("Chem"));
        pane.setTop(hbox);
        VBox vbox = new VBox();
        RadioButton rbhello = new RadioButton("Hello");
        RadioButton rbbye = new RadioButton("Bye");
        ToggleGroup group = new ToggleGroup();
        rbhello.setToggleGroup(group);
        rbbye.setToggleGroup(group);
        vbox.getChildren().addAll(rbhello,rbbye);
        pane.setRight(vbox);
        HBox hbox2 = new HBox();
        hbox2.setAlignment(Pos.CENTER);
        hbox2.setSpacing(10);
        Button btok = new Button("OK");
        Button btcancle = new Button("Cancle");
        hbox2.getChildren().addAll(btok,btcancle);
        pane.setBottom(hbox2);
        VBox vbox2 = new VBox();
        CheckBox cbApple = new CheckBox("Apple");
        CheckBox cbBanana = new CheckBox("Banana");
        CheckBox cbCoconut = new CheckBox("Coconut");
        vbox2.getChildren().addAll(cbApple,cbBanana,cbCoconut);
        pane.setLeft(vbox2);
        TextArea taName = new TextArea();
        StackPane stPane = new StackPane();
        stPane.getChildren().add(new ScrollPane());
        for (int i = 0; i < 30; i++) {
            taName.appendText("Hello Java \t\t" + i + "\n");
        }
        stPane.getChildren().add(taName);
        pane.setCenter(stPane);
        
        Scene scene = new Scene(pane,500,500);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
