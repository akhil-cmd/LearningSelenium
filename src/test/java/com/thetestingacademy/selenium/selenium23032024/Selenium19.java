package com.thetestingacademy.selenium.selenium23032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium19 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }














    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testVWOLink() throws InterruptedException {

        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.cssSelector("[name=\"_nkw\"]"));
        search.sendKeys("macmini");

        WebElement button = driver.findElement(By.cssSelector("#gh-btn"));  //input[@id="gh-btn"]   -- xpth
        button.click();

        Thread.sleep(3000);

        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class=\"s-item__title\"]"));
       //s-item__title   -->  By class Name
        for (WebElement element: searchTitles) {
            System.out.println(element.getText());
        }



    }
























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}