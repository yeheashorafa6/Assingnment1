package com.example.assingmnent1pro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Platform;





public class SystemPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private Button btnConvert;

    @FXML
    private Button btnLogout;

    @FXML
    private TextField txtNIS;

    @FXML
    private TextField txtUSD;

    @FXML
    void showConvert(ActionEvent event) {
        if (!(txtNIS.getText().isEmpty())) {
            try {

                double shekels = Double.parseDouble(txtNIS.getText());

                double dollars = shekels * 0.29;

                txtUSD.setText(String.format("%.2f", dollars));
            } catch (NumberFormatException e) {

                txtNIS.setText("Invalid input");
            }

        } else if (!(txtUSD.getText().isEmpty())) {
            try {

                double dollars = Double.parseDouble(txtUSD.getText());

                double shekels = dollars * 3.5;

                txtNIS.setText(String.format("%.2f", shekels));
            } catch (NumberFormatException e) {

                txtUSD.setText("Invalid input");
            }

        }
    }

    @FXML
    void showLogout(ActionEvent event) throws IOException {
        Platform.exit();
        ViewManager.openLoginPage();

    }
}