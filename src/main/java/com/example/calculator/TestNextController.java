package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class TestNextController {
    @FXML
    private AnchorPane Anchor;
    @FXML
    private Button back;
    @FXML
    void GoBack(ActionEvent event) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        Parent test =  FXMLLoader.load(Objects.requireNonNull(getClass().getResource("calculatorScreen.fxml")));
        Scene newScene = new Scene(test);
        stage.setScene(newScene);

    }
}
