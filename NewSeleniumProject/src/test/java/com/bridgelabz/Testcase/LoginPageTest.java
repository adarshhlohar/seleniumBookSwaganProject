package com.bridgelabz.Testcase;

import com.bridgelabz.Base.TestBase;
import com.bridgelabz.Pages.LoginPage;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends TestBase {
    LoginPage login;
    Logger log = Logger.getLogger(LoginPage.class);
    @Test
    public void login() throws IOException, InterruptedException {
        initiateDriverInstance();
        login = new LoginPage(driver);

        login.enterUserName("9356986567");

        login.enterPassword("Admin@123");

        login.clickToLoginButton();
    }
}
