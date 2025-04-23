package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Checkoutpage {
  
	protected WebDriver driver;
	
	
	//constructor
		public Checkoutpage(WebDriver driver) {
			this.driver=driver;
			
		}
		
		public void CheckOut() throws InterruptedException {
			// hard assertion 
						WebElement Checkoutpage = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
						String checkout = Checkoutpage.getText();
						String CheckOutPage = "Checkout: Your Information";
						Assert.assertEquals(checkout, CheckOutPage);
						System.out.println(checkout);
					    Thread.sleep(5000);
					    
					    
					    // provide first name ,last name , zip code 
					    
					    

						driver.findElement(By.id("first-name")).sendKeys("Tasnia");
						driver.findElement(By.id("last-name")).sendKeys("Hema");
						driver.findElement(By.id("postal-code")).sendKeys("1216");
						Thread.sleep(4000);
						driver.findElement(By.id("continue")).click();
						Thread.sleep(5000);
		}
}
