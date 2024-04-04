package com.thetestingacademy.selenium.selenium30032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium34 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }














    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

//        Thread.sleep(5000);
//        WebElement close_button = driver.findElement(By.xpath("//i[@class=\"wewidgeticon we_close\"]"));
//        close_button.click();
//        WebElement from_city = driver.findElement(By.xpath("//div[@class=\"flt_fsw_inputBox searchCity inactiveWidget activeWidget\"]"));
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(from_city).sendKeys("New Delhi").build().perform();
//
//        Thread.sleep(5000);
//

    }
























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}