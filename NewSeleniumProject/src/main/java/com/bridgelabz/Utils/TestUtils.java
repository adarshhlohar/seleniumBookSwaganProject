package com.bridgelabz.Utils;

import com.bridgelabz.Base.TestBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestUtils extends TestBase {
    public static long PAGE_LOAD_TIMEOUT=30;
    public static long IMPLICIT_WAIT=20;


    public TestUtils(WebDriver driver){
        this.driver = driver;
    }

    public static void testCaseFailed(String FName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sFile = ts.getScreenshotAs(OutputType.FILE);
        File dFile = new File("D:\\NewSeleniumProject\\src\\FailedScriptScreenshot\\" +FName+ ".jpg");
        FileHandler.copy(sFile,dFile);
    }

    public static String fetchPropertyFile(String key) throws IOException {
        FileInputStream file = new FileInputStream("D:\\NewSeleniumProject\\src\\main\\java\\com\\bridgelabz\\Config\\config.properties");
        Properties prop = new Properties();
        prop.load(file);
        return prop.getProperty(key);
    }

    public static String fetchLocatorValue(String key) throws IOException {
        FileInputStream file = new FileInputStream("D:\\NewSeleniumProject\\src\\main\\java\\com\\bridgelabz\\Config\\element.properties");
        Properties prop = new Properties();
        prop.load(file);
        return prop.getProperty(key).toString() ;
    }
}
