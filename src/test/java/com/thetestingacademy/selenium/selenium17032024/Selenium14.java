package com.thetestingacademy.selenium.selenium17032024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium14 {

    @Test(groups = "QA")
    public void testVWOLink() {


        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");




        driver.close();

    }
}