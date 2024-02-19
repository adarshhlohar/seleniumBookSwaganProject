package com.bridgelabz.Testcase;

import com.bridgelabz.Base.TestBase;
import com.bridgelabz.Pages.HomePage;
import com.bridgelabz.Pages.LoginPage;
import com.bridgelabz.Pages.SearchedItemPage;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddToCartTest extends TestBase {
    LoginPage lp;
    HomePage hp;
    SearchedItemPage sip;

    Logger log = Logger.getLogger(AddToCartTest.class);

    @BeforeClass
    public void login() throws IOException, InterruptedException {
        initiateDriverInstance();
        lp = new LoginPage(driver);

        lp.enterUserName("9356986567");
        lp.enterPassword("Admin@123");
        lp.clickToLoginButton();

        lp.enterUserName("9356986567");
        lp.enterPassword("Admin@123");
        lp.clickToLoginButton();
    }

    @Test
    public void searchAndAddToCart() throws IOException {
        hp = new HomePage(driver);
        sip = new SearchedItemPage(driver);
        hp.searchItem("addi-lohar");
        sip.checkAvailable();
        sip.clickAddToCartButton();
    }



}
