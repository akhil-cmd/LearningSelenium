package com.thetestingacademy.selenium.selenium17032024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium15 {

    @Test(groups = "QA")
    public void testVWOLink(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement text_link = driver.findElement(By.xpath("//a[text()=\"Make Appointment\"]"));
        text_link.click();

        WebElement pass_put = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        pass_put.sendKeys("John Doe");

        WebElement pass_key = driver.findElement(By.xpath("//input[contains(@id,\"password\")]"));
        pass_key.sendKeys("ThisIsNotAPassword");

        WebElement click_button = driver.findElement(By.xpath("//button[text()=\"Login\"]"));
        click_button.click();

        driver.close();
    }
}
