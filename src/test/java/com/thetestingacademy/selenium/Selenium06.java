package com.thetestingacademy.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium06 {

    @Test
    public void testMethod(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

      //  chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
      //  chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver  driver = new ChromeDriver(chromeOptions);
        driver.get("https://courses.thetestingacademy.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
