package com.bridgelabz.Base;

import com.bridgelabz.Pages.LoginPage;
import com.bridgelabz.Utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public void initiateDriverInstance() throws IOException, InterruptedException {
        if(TestUtils.fetchPropertyFile("browser").toString().equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            Thread.sleep(3000);
        }
        driver.get(TestUtils.fetchPropertyFile("url").toString());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT,TimeUnit.SECONDS);
    }


    void ProgramTermination() {
        driver.quit();
    }

}
