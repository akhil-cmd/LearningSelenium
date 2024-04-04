package com.thetestingacademy.selenium.selenium31032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class Selenium38 {

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

        driver.get("https://the-internet.herokuapp.com/windows");

        String mainWindowHandle  = driver.getWindowHandle();
        System.out.println("Before Click" + mainWindowHandle);
        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();

        Set<String> windowHandles = driver.getWindowHandles();
        // All the Windows Tab have a unique name

        for (String handle : windowHandles){
            driver.switchTo().window(handle);
            System.out.println(handle);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed");
            }

        }

        driver.switchTo().window(mainWindowHandle);
        
    }
























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}