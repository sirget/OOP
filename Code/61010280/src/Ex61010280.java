
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
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
public class Ex61010280 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        mainloan(stage);
    }

    void mainloan(Stage stage) {
        BorderPane pane = new BorderPane();
        TextArea taTable = new TextArea();
        pane.setCenter(new ScrollPane(taTable));
        TextField tfLoanAmount = new TextField();
        tfLoanAmount.setPrefColumnCount(7);
        TextField tfNumberOfYears = new TextField();
        tfNumberOfYears.setPrefColumnCount(2);
        Button btShowTable = new Button("Show Table");
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Loan Amount"), tfLoanAmount, new Label("Number of Years"), tfNumberOfYears, btShowTable);
        hBox.setAlignment(Pos.CENTER);
        pane.setBottom(hBox);
        HBox hBox2 = new HBox(10);
        Button btSave = new Button("save");
        Button btLoad = new Button("load");
        hBox2.getChildren().addAll(btSave, btLoad);
        hBox2.setAlignment(Pos.CENTER);
        pane.setTop(hBox2);

        Scene scene = new Scene(pane, 500, 250);
        stage.setTitle("Loan GUI");
        stage.setScene(scene);
        stage.show();

        btShowTable.setOnAction(e -> {
            double loanAmount = Double.parseDouble(tfLoanAmount.getText().trim());
            int numOfYears = Integer.parseInt(tfNumberOfYears.getText().trim());
            Loan loan = new Loan();
            loan.setLoanAmount(loanAmount);
            loan.setNumberOfYears(numOfYears);
            taTable.setText("Interest Rate\tMonthly Payment\tTotal Payment\n");
            for (double rate = 5; rate <= 10; rate += 1 / 4.0) {
                loan.setAnnualInterestRate(rate);
                taTable.appendText(rate + "\t\t\t" + (int) (loan.getMonthlyPayment() * 100) / 100.0 + "\t\t\t" + (int) (loan.getTotalPayment() * 100) / 100.0 + "\n");
            }
        });

        btSave.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT File (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);

            File file = fileChooser.showSaveDialog(stage);
            //File file = new File("file");

            if (file != null) {
                try {
                    FileWriter writer = new FileWriter(file, true);
                    writer.write(taTable.getText().replaceAll("\n", "\r\n"));
                    writer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        btLoad.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT File (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);

            File file = fileChooser.showSaveDialog(stage);
            //File file = new File("file");

            if (file != null) {
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
                    taTable.setText(text);
                    System.out.println(text);

                } catch (FileNotFoundException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}
