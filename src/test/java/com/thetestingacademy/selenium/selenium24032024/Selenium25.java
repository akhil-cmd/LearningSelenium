package com.thetestingacademy.selenium.selenium24032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium25 {

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

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

//        WebElement element = driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
//        element.click();

//        WebElement element_confirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
//        element_confirm.click();

        WebElement element_prompt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        element_prompt.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        //alert.accept();

        alert.sendKeys("Akhil");
        alert.accept();

        String message = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(message, "You successfully clicked an alert");

        Assert.assertEquals(message, "You entered: Akhil");


        Thread.sleep(5000);
    }
























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}