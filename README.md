# Flipkart Add To Cart Automation

This project automates the process of searching for a product and adding it to the cart on Flipkart using Selenium WebDriver in Java.

## Features

- Launches the Flipkart website.
- Searches for a specific product (Samsung Galaxy S24).
- Clicks on the selected product to view its details.
- Extracts and displays the product highlights.
- Adds the product to the cart.

## Technologies Used

- **Java**
- **Selenium WebDriver**
- **ChromeDriver** (for Chrome browser automation)

## Setup

### Prerequisites

- Java 8 or higher
- Selenium WebDriver
- Chrome Browser
- ChromeDriver

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/SangameshPK-2003/Flipkart-Add-To-Cart-Automation.git
    ```

2. Download and configure **ChromeDriver**:
    - Go to the [ChromeDriver download page](https://sites.google.com/a/chromium.org/chromedriver/downloads) and download the version of ChromeDriver that matches your browser version.
    - Extract the downloaded file and place it in a directory of your choice.
    - Set the `webdriver.chrome.driver` system property in your code to point to the path of `chromedriver.exe`. You can also add this to your system environment variables.

3. Add the necessary Selenium dependency (in case you're using Maven):

   **pom.xml**:
    ```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.1.0</version>
    </dependency>
    ```

### Usage

1. Compile and run the `AddToCart.java` file:
    ```bash
    javac AddToCart.java
    java AddToCart
    ```

2. The automation script will:
    - Open the Flipkart website.
    - Search for **"samsung s24"** in the search bar.
    - Click on the product link for **SAMSUNG Galaxy S24 5G (Amber Yellow, 128 GB)**.
    - Extract product highlights and display them in the console.
    - Click the **"Add to cart"** button and print a success message.

3. The browser will close after 2 seconds.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
