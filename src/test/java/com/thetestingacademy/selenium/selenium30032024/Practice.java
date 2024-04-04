package com.thetestingacademy.selenium.selenium30032024;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {

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



        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scroll = driver.findElement(By.xpath("//div[@id=\"userName\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", scroll);


//        WebElement linkHub = (WebElement) js.executeScript(" return document.querySelector(\"div#userName\").shadowRoot.querySelector(\".learningHub\")");
      //  WebElement linkHub = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\".learningHub\")");

        //WebElement linkHub = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\".learningHub\")");

        WebElement linkHub = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\".learningHub\")");
        System.out.println(linkHub.getText());
        linkHub.click();



    }
























    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}