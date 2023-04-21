package com.example.assingmnent1pro;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class LoginDashboard extends Stage{
    private Scene createLoginPage;

    public LoginDashboard()throws IOException{

        FXMLLoader createLoginPageLoader = new FXMLLoader(getClass().getResource(
                "C:\\Users\\HP\\IdeaProjects\\Assingmnent1Pro3\\src\\main\\java\\com\\example\\assingmnent1pro3\\LoginPage.fxml"));
//        Parent LoginPageRoot = createLoginPageLoader.load();
        createLoginPage = new Scene(createLoginPageLoader.load(),320,320);
        this.setScene(createLoginPage);
        this.setTitle("Login Page");
        this.show();

    }

}
