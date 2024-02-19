package com.bridgelabz.Pages;

import com.bridgelabz.Utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void searchItem(String search) throws IOException {
        WebElement searchElement =  driver.findElement(By.id(TestUtils.fetchLocatorValue("homeSearchid")));
        Actions actions = new Actions(driver);
        actions.sendKeys(searchElement,search).keyDown(Keys.ARROW_LEFT).keyDown(Keys.SHIFT).keyDown(Keys.ARROW_UP).keyUp(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).keyDown(Keys.ENTER).build().perform();
    }

    public void toCheckAddCart() throws IOException {
        driver.findElement(By.xpath(TestUtils.fetchLocatorValue("homeAddToCart"))).click();
    }

    public void clickPersonalSetting() throws IOException {
        driver.findElement(By.xpath(TestUtils.fetchLocatorValue("//img[@alt='Personal Setting']"))).click();
    }

}
