package com.thetestingacademy.selenium.selenium30032024;

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

public class Selenium31 {

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

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

        WebElement ch1 = checkboxes.get(0);
        ch1.click();

        WebElement ch2 = checkboxes.get(1);
        ch2.click();

        Thread.sleep(3000);


        //table[@id="customers"]/tbody/tr[]/td[]
    }
























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}