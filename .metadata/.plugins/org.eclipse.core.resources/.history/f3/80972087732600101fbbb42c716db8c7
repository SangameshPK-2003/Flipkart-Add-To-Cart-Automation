package com.automateflipkart.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		searchBox.sendKeys("samsung s24");
		searchBox.submit();

		String mainPage = driver.getWindowHandle();
		System.out.println("Main page URL:----- " + driver.getCurrentUrl());

		driver.findElement(By.xpath("//div[normalize-space()='SAMSUNG Galaxy S24 5G (Amber Yellow, 128 GB)']"))
				.click();

		Set<String> allPages = driver.getWindowHandles();
		for (String page : allPages) {
			if (!page.equals(mainPage)) {
				driver.switchTo().window(page);
				break;
			}
		}
		System.out.println("Current page URL:----- "+driver.getCurrentUrl());
		List<WebElement> products = driver.findElements(By.className("_7eSDEz"));
		System.out.println("Highlights:----");
		for (WebElement product : products) {
			System.out.println(product.getText());
		}
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		System.out.println("*******SUCCESSFULLY ADDED TO CART********");
		Thread.sleep(2000);
		driver.quit();
	}
}
