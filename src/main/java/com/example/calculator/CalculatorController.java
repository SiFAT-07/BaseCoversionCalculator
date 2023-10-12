package com.example.calculator;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class CalculatorController {
    @FXML
    private Button B;

    @FXML
    private Button Clear;

    @FXML
    private Button Exit;

    @FXML
    private Button H;

    @FXML
    private Button Next;

    @FXML
    private Button O;

    @FXML
    private TextField showResult;

    @FXML
    private Label textF;
    @FXML
    private AnchorPane calcPane;

    @FXML
    void onBButtonClick(ActionEvent event) {

        try {

            Integer.parseInt(showResult.getText());
            int num = Integer.parseInt(showResult.getText());
            textF.setText(Integer.toBinaryString(num));
        } catch (NumberFormatException e) {
            try {
                Float.parseFloat(showResult.getText());
                textF.setText("No Input Given");
            } catch (NumberFormatException e2) {
                textF.setText("Not a Number!");
            }
        }

    }
    @FXML
    void onOButtonClick(ActionEvent event) {

        try {
            Integer.parseInt(showResult.getText());
            int num = Integer.parseInt(showResult.getText());
            textF.setText(Integer.toOctalString(num));
        } catch (NumberFormatException e) {
            try {
                Float.parseFloat(showResult.getText());
                textF.setText("No Input Given");
            } catch (NumberFormatException e2) {
                textF.setText("Not a Number!");
            }
        }
    }

    @FXML
    void onHButtonClick(ActionEvent event) {
        try {
            Integer.parseInt(showResult.getText());
            int num = Integer.parseInt(showResult.getText());
            textF.setText(Integer.toHexString(num));
        } catch (NumberFormatException e) {
            try {
                Float.parseFloat(showResult.getText());
                textF.setText("No Input Given");
            } catch (NumberFormatException e2) {
                textF.setText("Not a Number!");
            }
        }
    }

    @FXML
    void onClearButtonClick(ActionEvent event) {
        showResult.setText("Place Decimal input Here");
        textF.setText("No Input");
    }

    @FXML
    void onExitButtonClick(ActionEvent event) {
        Platform.exit();
    }


    @FXML
    void onNextButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) Next.getScene().getWindow();
        Parent test =  FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TestNext.fxml")));
        Scene newScene = new Scene(test);
        stage.setScene(newScene);

    }
}