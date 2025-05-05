package com.automateflipkart.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
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

        driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
        System.out.println("Added to cart successfully!");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
