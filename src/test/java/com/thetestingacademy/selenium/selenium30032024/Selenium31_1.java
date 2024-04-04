package com.thetestingacademy.selenium.selenium30032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium31_1 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
    }









    @Test(groups = "QA")
    @Description("Test Case Description")
    public void shadowDom() throws InterruptedException {

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        //document.querySelector("div#userName").shadowRoot.querySelector("div").shadowRoot.querySelector("input#pizza")

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scroll = driver.findElement(By.xpath("//div[@id=\"userName\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", scroll);

        Thread.sleep(3000);

        WebElement inputBoxpizza = (WebElement) js.executeScript(" return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div\").shadowRoot.querySelector(\"input#pizza\")");
        inputBoxpizza.sendKeys("FarmHouse");

        Thread.sleep(10000);

    }
























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}