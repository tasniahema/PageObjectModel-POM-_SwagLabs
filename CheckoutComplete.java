package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckoutComplete {
  
	
protected WebDriver driver;
	
	
	//constructor
		public CheckoutComplete(WebDriver driver) {
			this.driver=driver;
			
		}
		
		public void CheckOutComplete() throws InterruptedException {
			
			// hard assertion 
			WebElement Checkoutcomplete = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
			String checkComplete = Checkoutcomplete.getText();
			String Complete = "Checkout: Complete!";
			Assert.assertEquals(checkComplete ,Complete);
			System.out.println(checkComplete );
		    Thread.sleep(5000);
		    
		    
		    driver.findElement(By.xpath("/html/body/div/div/div/div[2]/button")).click();
		    
		    Thread.sleep(5000);
		    
		    WebElement products = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
			String Product = products.getText();
			String page = "Products";
			Assert.assertEquals(Product, page, "Condition Mismatch");
			// System.out.println("Hard Assertion");
			System.out.println(Product);
		    
		}
}
