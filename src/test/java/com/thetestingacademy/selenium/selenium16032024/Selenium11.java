package com.thetestingacademy.selenium.selenium16032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium11 {

    @Test(groups = "QA")
    @Description("Verify current URL")
    public void inputVWOFields() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        WebElement inputEmailBox = driver.findElement(By.id("login-username"));
        inputEmailBox.sendKeys("admin@ad.com");

        WebElement inputPasswordBox = driver.findElement(By.name("password"));
        inputPasswordBox.sendKeys("Test12");

        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement popMessage = driver.findElement(By.className("notification-box-description"));

        String error_msg = popMessage.getText();
        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");


    }
}
