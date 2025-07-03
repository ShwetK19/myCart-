package tests;

import org.testng.annotations.Test;

import pom.pages.LoginPage;
import utils.CSVReader;

import org.testng.annotations.BeforeMethod;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class LoginTest {
  private WebDriver driver;

@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void setUp() {
      System.setProperty("webdriver.chrome.driver","B:\\\\Mini_Project\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://demowebshop.tricentis.com/login");
      driver.manage().window().maximize();
  }

  @DataProvider(name = "LoginData")
  public Iterator<Object[]> getLoginData() {
      String filePath = "B:\\Mini_Project\\myCart\\src\\pom\\testdata\\LoginData.csv"; // Update path if needed

	return CSVReader.readCSV("B:\\Mini_Project\\myCart\\src\\utils\\CSVReader.java");
  }

  @Test(dataProvider = "LoginData")
  public void loginTest(String email, String password) {
      LoginPage loginPage = new LoginPage(driver);
      loginPage.login(email, password);

      // Just for demo - update according to real behavior
      boolean loginSuccess = driver.getPageSource().contains("Log out");
      System.out.println("Testing with: " + email + " / " + password);
      System.out.println("Login result: " + loginSuccess);

      // Optional: Use conditional assertion based on data
  }

  @AfterMethod
  public void tearDown()
  {
      driver.quit();
  }


  }

