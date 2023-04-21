package com.example.assingmnent1pro;

//import com.sun.javafx.logging.PlatformLogger.Level;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class LoginPageController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtFieldPassword;

    @FXML
    private TextField txtFieldUserName;

    @FXML
    void showLoginPage(ActionEvent event) throws IOException {
        if ((txtFieldUserName.getText().equals("user"))&&((txtFieldPassword.getText().equals("userpass")))) {
            ViewManager.openSystemPage();
        }else {
            throw new IOException("Invalid input User Name Or Password");
        }
    }


}

