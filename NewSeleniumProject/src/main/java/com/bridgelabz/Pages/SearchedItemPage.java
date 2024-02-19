package com.bridgelabz.Pages;

import com.bridgelabz.Utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class SearchedItemPage {
    WebDriver driver;

    public SearchedItemPage(WebDriver driver){
        this.driver = driver;
    }

    public String searchItemSearchBar() throws IOException {
        String searchValue =  driver.findElement(By.xpath(TestUtils.fetchLocatorValue("seachedItemSearchBar"))).getText();
        return searchValue;
    }

    public void checkAvailable() throws IOException {
        String bookName = searchItemSearchBar();
        WebElement item = driver.findElement(By.xpath(TestUtils.fetchLocatorValue("searchedFirstElement")));

        String availableBook = item.getText();

        if(availableBook.contains(bookName)){
            System.out.println(bookName);
            System.out.println(availableBook);
            driver.findElement(By.xpath(TestUtils.fetchLocatorValue("searchedFirstBook"))).click();
        }
        else{
            TestUtils.testCaseFailed(bookName + "NotAvailable");
        }
    }

    public void clickAddToCartButton() throws IOException {
        driver.findElement(By.xpath(TestUtils.fetchLocatorValue("searchedItemAddtoCartButtonXpath"))).click();
    }


}
