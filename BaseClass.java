package BaseClassNew;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
 
  protected WebDriver driver;
	
	public void setup() {
		  driver = new ChromeDriver();//lunch chromebrowser
		  driver.manage().window().maximize();//maximize browser
		  System.out.println("Setup completed ");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//use a wait for all
		  driver.get("https://www.saucedemo.com/"); // set url to the browser
	}
	//driver quite or close
		public void closeDown() {
			if (driver != null) {
				driver.quit();
			}
		}
		// return the driver
		public WebDriver getDriver() {// beforemethod ,aftermethod use korbo tokhn bar bar calll hobe tai amdr return er proyojon
			return driver;
		}
}
