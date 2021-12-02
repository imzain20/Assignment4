package com.example.evm2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public TextField textField;
    public Label textLabel;

    public void Button(ActionEvent actionEvent) {
        //System.out.println("Hello");
        textLabel.setText("VOTE NOW");
        //textLabel.setText(textField.getText());

    }
/*    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

 */
}