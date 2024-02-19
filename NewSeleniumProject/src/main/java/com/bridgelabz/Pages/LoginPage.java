package com.bridgelabz.Pages;

import com.bridgelabz.Utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(String uName) throws IOException {
        driver.findElement(By.xpath(TestUtils.fetchLocatorValue("loginUsernameXpath"))).sendKeys(uName);
    }

    public void enterPassword(String pass) throws IOException {
        driver.findElement(By.xpath(TestUtils.fetchLocatorValue("loginPasswordXpath"))).sendKeys(pass);
    }

    public void clickToLoginButton() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(TestUtils.fetchLocatorValue("loginButtonXpath"))).click();
        Thread.sleep(1000);
    }
}
