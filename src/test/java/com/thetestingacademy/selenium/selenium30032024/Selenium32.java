package com.thetestingacademy.selenium.selenium30032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class Selenium32 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }














    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys(firstName, "thetestingacademy")
                .keyUp(Keys.SHIFT).build().perform();

        //a[text()="Click here to Download File"]
        WebElement link = driver.findElement(By.xpath("//a[text()=\"Click here to Download File\"]"));

        actions.contextClick(link).build().perform();

        Thread.sleep(5000);


    }
























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}