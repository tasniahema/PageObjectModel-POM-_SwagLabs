package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckoutOverview {
 

	protected WebDriver driver;
	
	
	//constructor
		public CheckoutOverview(WebDriver driver) {
			this.driver=driver;
			
		}
		
		public void CheckOutOverview() throws InterruptedException {
			
			// hard assertion 
			WebElement Checkoutoverview = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
			String checkoverview = Checkoutoverview.getText();
			String Overview = "Checkout: Overview";
			Assert.assertEquals(checkoverview , Overview);
			System.out.println(checkoverview );
		    Thread.sleep(5000);
		    
		    
		    driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
		    
		    Thread.sleep(5000);
		    
		}
}
