package com.bridgelabz.Pages;

import com.bridgelabz.Utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ResisterPage {
    WebDriver driver;

    public ResisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToResiterLink() throws IOException, InterruptedException {
        Actions act = new Actions(driver);
        Thread.sleep(1000);

        WebElement resisterLink = driver.findElement(By.cssSelector(TestUtils.fetchLocatorValue("clickOnResisterLinkTest")));
        act.moveToElement(resisterLink).perform();
        resisterLink.click();
    }

    public void enterName(String name) throws IOException {
        driver.findElement(By.xpath(TestUtils.fetchLocatorValue("registerNameXpath"))).sendKeys(name);
    }

    public void enterMobileNo(String mobileNo) throws IOException {
        driver.findElement(By.xpath(TestUtils.fetchLocatorValue("resisterMobileNoXpath"))).sendKeys(mobileNo);
    }

    public void checkCaptcha() throws IOException {
        driver.findElement(By.cssSelector(TestUtils.fetchLocatorValue("resisterCaptcha"))).click();
    }

    public void clickOnContinue() throws InterruptedException, IOException {
        driver.findElement(By.xpath(TestUtils.fetchLocatorValue("resisterClickButton"))).click();
        Thread.sleep(2000);
    }
}
