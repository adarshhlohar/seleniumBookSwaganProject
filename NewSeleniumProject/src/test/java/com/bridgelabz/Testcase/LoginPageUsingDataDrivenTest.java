package com.bridgelabz.Testcase;

import com.bridgelabz.Base.TestBase;
import com.bridgelabz.Pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageUsingDataDrivenTest extends TestBase {
    LoginPage login;

    @Test(dataProvider = "loginData")
    public void loginMultipleAccount(String uName,String pass) throws IOException, InterruptedException {
        initiateDriverInstance();
        login = new LoginPage(driver);
        login.enterUserName(uName);
        login.enterPassword(pass);
        login.clickToLoginButton();
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData(){
        Object[][] data = {
                {"adarshhlohar@gmail.com","Adarsh@123"},
                {"adarsh@gmail.com","Admin@123"}
        };
        return data;
    }
}
