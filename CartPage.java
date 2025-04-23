package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage {
	protected WebDriver driver;
	

	//constructor
	public CartPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//action
		public void CartPageCheck() throws InterruptedException {
			
			// hard assertion 
			WebElement Yourcartpage = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
			String Yourcart = Yourcartpage.getText();
			String pagecart = "Your Cart";
			Assert.assertEquals(Yourcart, pagecart);
			// System.out.println("Hard Assertion");
			System.out.println(Yourcart);
			// click checkout button 
		    driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
			System.out.println("cartpage Completed");
			Thread.sleep(5000);
		}
 
}
