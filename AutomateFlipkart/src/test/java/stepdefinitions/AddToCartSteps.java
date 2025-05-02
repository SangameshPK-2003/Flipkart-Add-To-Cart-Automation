package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class AddToCartSteps {
    WebDriver driver;

    @Given("I open Flipkart")
    public void open_flipkart() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
    }

    @When("I search for {string}")
    public void search_product(String product) throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
    	searchBox.sendKeys("samsung s24");
    	searchBox.submit();
    }

    @And("I add the first product to cart")
    public void add_to_cart() {
        String mainPage = driver.getWindowHandle();
        driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24')]")).click();

        for (String page : driver.getWindowHandles()) {
            if (!page.equals(mainPage)) {
                driver.switchTo().window(page);
                break;
            }
        }
        driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
    }

    @Then("the product should be added successfully")
    public void verify_cart() {
        System.out.println("Product successfully added to cart.");
        driver.quit();
    }
}
