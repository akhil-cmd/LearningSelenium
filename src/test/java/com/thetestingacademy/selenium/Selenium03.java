package com.thetestingacademy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import java.io.File;

public class Selenium03 {

    @Test
    public void testMethod(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("C:\\Users\\AKHIL\\Downloads\\AdBlock1.crx"));

        WebDriver  driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/");

    }
}
