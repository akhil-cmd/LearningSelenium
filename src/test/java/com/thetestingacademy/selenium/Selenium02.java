package com.thetestingacademy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    public void testBrowser(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.thetestingacademy.com/");
        System.out.println(driver.getTitle());
    }
}
