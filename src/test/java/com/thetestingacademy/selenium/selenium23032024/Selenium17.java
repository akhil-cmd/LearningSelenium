package com.thetestingacademy.selenium.selenium23032024;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium17 {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }



    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testVWOLink(){

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}