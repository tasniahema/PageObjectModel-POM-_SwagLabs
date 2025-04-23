package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
protected WebDriver driver;
	
	//Locate the web element
	//private By usernameField = By.id("user-name");//replace by 23 no line
	//private By passwordField = By.id("password");
	//private By loginButton = By.id("login-button");
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//actions
	public void enterUser(String username) {
		//driver.findElement(usernameField).sendKeys(username);
		//old method
		driver.findElement(By.id("user-name")).sendKeys(username);
		System.out.println("User set completed");
	}
	
	public void enterPassword(String password) {
		//driver.findElement(passwordField).sendKeys(password);
		//old method
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("Password set completed");
		
	}
	
	public void clickLogin() {
		//driver.findElement(loginButton).click();
		//old method
		driver.findElement(By.id("login-button")).click();;
		System.out.println("Click completed");

	}
}
