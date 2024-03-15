package com.thetestingacademy.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium09 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://bing.com");

        driver.navigate().to("https://app.vwo.com");

        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
    }
}
