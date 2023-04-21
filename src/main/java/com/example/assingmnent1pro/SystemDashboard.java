package com.example.assingmnent1pro;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SystemDashboard extends Stage{
    private Scene createSystemPage;

    public SystemDashboard() throws IOException{
        FXMLLoader createSystemPageLoader = new FXMLLoader(getClass().getResource("Assingmnent1.SystemPage.fxml"));
        Parent SystemPageRoot = createSystemPageLoader.load();
        createSystemPage = new Scene(SystemPageRoot);

        this.setScene(createSystemPage);
        this.setTitle("System Page");
    }
    public void changeSceneToSystemPage(){
        this.setScene(createSystemPage);
    }
}
