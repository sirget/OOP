import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Test extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane pane = new BorderPane();

        HBox hBox = new HBox(10);

        VBox vBox = new VBox(10);

        TextArea taInput = new TextArea();
        Button btSave = new Button("save");
        Button btLoad = new Button("load");
        hBox.getChildren().addAll(btSave, btLoad);
        vBox.getChildren().addAll(taInput, hBox);

        pane.setCenter(vBox);

        btSave.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();

            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT File (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);

            File file = fileChooser.showSaveDialog(stage);

            if (file != null) {
                saveToFile(file, taInput.getText().replaceAll("\n", "\r\n"));
            }

        });

        btLoad.setOnAction(e -> {

            FileChooser fileChooser = new FileChooser();

            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);

            File file = fileChooser.showOpenDialog(stage);

            if (file != null) {
                showOutputFile(file, taInput);
            }

        });

        stage.setScene(new Scene(pane, 300, 200));
        stage.show();

    }

    void saveToFile(File file, String inputText) {
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(inputText);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    void showOutputFile(File file, TextArea taOutput) {
        try {
            FileReader reader = new FileReader(file);

            String text = "";

            int i;
            try {
                while ((i = reader.read()) != -1) {
                    text += String.valueOf((char) i);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            taOutput.setText(text);
            System.out.println(text);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
