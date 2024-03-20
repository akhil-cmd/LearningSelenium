package com.thetestingacademy.selenium.selenium17032024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Flipkart {

    @Test
    public void clickonFlip(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158294!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=CjwKCAjwkuqvBhAQEiwA65XxQIrA-B1vWPxOxyU2kbRT9FzrNv69JxVFZjxhU_CU1cuJ6KCoP05iuBoChjEQAvD_BwE");
        WebElement img = driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]"));
        img.click();

        List<WebElement> mobile = driver.findElements(By.xpath("//a[contains(@title,\"S24\")]"));
        mobile.get(1).click();

        driver.close();
    }

}
