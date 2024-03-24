package com.thetestingacademy.selenium.selenium23032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium21 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }














    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testVWOLinkNegative() throws InterruptedException {

        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement inputEmailBox = driver.findElement(By.xpath("//input[@data-qa=\"hocewoqisi\"]"));
        inputEmailBox.sendKeys("admin@ad.com");

        WebElement inputPasswordBox = driver.findElement(By.xpath("//input[@id=\"login-password\"]"));
        inputPasswordBox.sendKeys("Test12");

        driver.findElement(By.id("js-login-btn")).click();

        WebElement popMessage = driver.findElement(By.className("notification-box-description"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.textToBePresentInElement(popMessage, "Your email, password, IP address or location did not match"));

        System.out.println("1 --> " + popMessage.getText());


    }
























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}