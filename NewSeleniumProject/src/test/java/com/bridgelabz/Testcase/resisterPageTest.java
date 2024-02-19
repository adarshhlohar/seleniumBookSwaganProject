package com.bridgelabz.Testcase;

import com.bridgelabz.Base.TestBase;
import com.bridgelabz.Pages.ResisterPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class resisterPageTest extends TestBase {
    ResisterPage rp;

    @Test
    public void resister() throws IOException, InterruptedException {
        initiateDriverInstance();
        rp = new ResisterPage(driver);
        rp.clickToResiterLink();
        rp.enterName("Adarsh Hari Lohar");
        rp.enterMobileNo("9356986567");
        rp.checkCaptcha();
        rp.clickOnContinue();
    }
}
