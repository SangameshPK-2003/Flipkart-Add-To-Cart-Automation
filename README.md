
# 🛒 Flipkart Add-To-Cart Automation (Selenium + TestNG + Cucumber)

This project automates the process of adding a Samsung product to the cart on Flipkart using **Selenium WebDriver**, **TestNG**, and **Cucumber (BDD)**.

---

## ✅ Features

- Open Flipkart in Chrome
- Search for a product (e.g., "Samsung S24")
- Navigate to product details
- Add product to cart
- Validate successful cart addition
- Cucumber BDD-style implementation
- HTML test reports generated post execution

---

## 🧰 Tools & Technologies Used

| Tool/Technology    | Purpose                     |
|--------------------|-----------------------------|
| Java (JDK 17+)     | Programming Language         |
| Selenium 4         | UI Automation                |
| TestNG             | Test Execution Framework     |
| Cucumber (7.14)    | BDD Testing                  |
| Maven              | Build & Dependency Mgmt      |
| Eclipse IDE        | Development Environment      |
| Git & GitHub       | Version Control              |

---

## 🚀 Getting Started

### 🔧 Prerequisites

- Java JDK 17 or later
- Maven installed
- Eclipse IDE (or your preferred Java IDE)
- Chrome browser

---

## 📦 Installation & Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/SangameshPK-2003/Flipkart-Add-To-Cart-Automation.git
    ```

2. Import the project into Eclipse as a **Maven Project**.

3. Run `Maven > Update Project` to download all dependencies.

---

## 📁 Project Structure

```
AutomateFlipkart/
├── src/
│   ├── main/java/
│   └── test/
│       ├── java/
│       │   ├── stepdefinitions/
│       │   └── testrunners/
│       └── resources/
│           └── features/
├── testng.xml
├── pom.xml
└── README.md
```

---

## 🧪 How to Run the Test

1. Right-click on `TestRunner.java` in the `testrunners` package.  
2. Choose **Run As > TestNG Test** (or JUnit, based on your setup).  
3. The automation will:
   - Launch Chrome
   - Perform product search
   - Add the item to the cart
   - Close the browser after execution

---

## 📊 Test Report

After execution, open this HTML report in your browser:

```
/target/cucumber-reports.html
```

---

## 🔄 Future Improvements

- Integrate **ExtentReports** for detailed reporting
- Apply **Page Object Model (POM)** design pattern
- Add support for **Firefox**, **Edge** (cross-browser testing)
- **Dockerize** the automation suite
- **CI/CD integration** via Jenkins

---

## 🙏 Acknowledgment

Thanks to everyone who provided feedback and guidance on LinkedIn and GitHub. Your support encourages me to keep improving. 😊

---

## 📎 Author

**Sangamesh P K**  
🔗 [LinkedIn](https://www.linkedin.com/in/sangameshpk-2003/)  
📂 [GitHub Repo](https://github.com/SangameshPK-2003/Flipkart-Add-To-Cart-Automation)
