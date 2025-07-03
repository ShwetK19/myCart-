package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	    WebDriver driver;

	    public LoginPage(WebDriver driver)
	    {
	        this.driver = driver;
	    }

	    By emailField = By.id("Email");
	    By passwordField = By.id("Password");
	    By loginButton = By.xpath("//input[@value='Log in']");
	    By logoutLink = By.linkText("Log out");

	    public void login(String email, String password)
	    {
	        driver.findElement(emailField).sendKeys(email);
	        driver.findElement(passwordField).sendKeys(password);
	        driver.findElement(loginButton).click();
	    }

	    public boolean isLoginSuccessful()
	    {
	        return driver.getPageSource().contains("Log out");
	    }
}


