package com.bridgelabz.Testcase;

import com.bridgelabz.Base.TestBase;
import com.bridgelabz.Pages.LoginPage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginUsingXcelData extends TestBase {
    LoginPage login;
    @Test(dataProvider = "XcelData")
    public void loginUsingXcel(String username,String pass) throws IOException, InterruptedException {
        initiateDriverInstance();
        login = new LoginPage(driver);
        login.enterUserName(username);
        login.enterPassword(pass);
        login.clickToLoginButton();
    }

    @DataProvider(name = "XcelData")
    public Object[][] getTestData() throws IOException {
        FileInputStream file = new FileInputStream("D:\\NewSeleniumProject\\src\\test\\java\\com\\bridgelabz\\Resource\\Book1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet loginSheet = workbook.getSheetAt(0);
        int numberOfRows = loginSheet.getPhysicalNumberOfRows();
        Object[][] testData = new Object[numberOfRows][2];

        for (int i = 0;i < numberOfRows;i++){
            XSSFRow row =loginSheet.getRow(i);
            XSSFCell username = row.getCell(0);
            XSSFCell pass = row.getCell(1);

            testData[i][0] = username.getStringCellValue();
            testData[i][1] = pass.getStringCellValue();
        }
        return  testData;
    }

}
