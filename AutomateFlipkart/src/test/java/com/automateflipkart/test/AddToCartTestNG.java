package com.automateflipkart.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.Set;

public class AddToCartTestNG {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void addToCartTest() throws InterruptedException {
        driver.get("https://www.flipkart.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        Thread.sleep(2000);
        searchBox.sendKeys("samsung s24");
        searchBox.submit();

        String mainPage = driver.getWindowHandle();

        driver.findElement(By.xpath("//div[normalize-space()='SAMSUNG Galaxy S24 5G (Amber Yellow, 128 GB)']")).click();

        Set<String> allPages = driver.getWindowHandles();
        for (String page : allPages) {
            if (!page.equals(mainPage)) {
                driver.switchTo().window(page);
                break;
            }
        }

        List<WebElement> products = driver.findElements(By.className("_7eSDEz"));
        for (WebElement product : products) {
            System.out.println(product.getText());
        }

        driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
        System.out.println("Added to cart successfully!");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
