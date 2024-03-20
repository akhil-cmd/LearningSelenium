package com.thetestingacademy.selenium.selenium16032024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.List;

import java.util.List;

public class Selenium13 {

    @Test(groups = "QA")
    public void testVWOLink(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        List<WebElement> a_tag = driver.findElements(By.tagName("a"));

        for (WebElement element:a_tag) {
            System.out.println(element.getText());
        }        
                
        driver.close();
    }
}
