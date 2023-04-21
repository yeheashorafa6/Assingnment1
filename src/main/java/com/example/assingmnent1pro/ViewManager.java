package com.example.assingmnent1pro;

import java.io.IOException;


public class ViewManager {
    public static LoginDashboard loginPage;
    public static SystemDashboard systemPage;


    private ViewManager(){}

    public static void openLoginPage() throws IOException{
        if (loginPage == null) {
            loginPage = new LoginDashboard();
            loginPage.show();
        } else {
            loginPage.show();
        }

    }
    public static void closeLoginPage(){
        if(loginPage != null)
            loginPage.close();
    }

    public static void openSystemPage() throws IOException {
        if (systemPage == null) {
            systemPage = new SystemDashboard();
            systemPage.show();
        } else {
            systemPage.show();
        }

    }
    public static void closeAdminPage(){
        if(systemPage != null)
            systemPage.close();
    }

}

