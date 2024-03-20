package com.thetestingacademy.selenium.selenium16032024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium12 {

    @Test(groups = "QA")
    public void testVWOLink(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        //WebElement tag_anchor = driver.findElement(By.linkText("Start a free trial"));

        WebElement tag_anchor = driver.findElement(By.partialLinkText("trial"));

        System.out.println(tag_anchor.getAttribute("href"));
        tag_anchor.click();
        driver.close();
    }
}
