Selenium TestNG Mini Project – Demo Web Shop Login Automation

This project automates the login functionality of [Demo Web Shop](https://demowebshop.tricentis.com/login) using:

- ✅ Java
- ✅ Selenium WebDriver
- ✅ TestNG Framework
- ✅ Data-driven testing with CSV file

---

📁 Project Structure

Mini_Project/
├── pom.configuration/ → Config.java (URL, driver path)
├── pom.pages/ → LoginPage.java (Page Object Model)
├── pom.testdata/ → LoginData.csv (test data)
├── tests/ → LoginTest.java (TestNG test class)
├── utils/ → CSVReader.java (CSV reading logic)
├── testng.xml → TestNG suite configuration
└── test-output/ → Auto-generated TestNG reports

✅ Features

- Modular framework using Page Object Model (POM)
- Data-driven testing with multiple login combinations
- TestNG test execution with reporting
- Externalized configuration and test data
- Easily maintainable and extensible test structure

