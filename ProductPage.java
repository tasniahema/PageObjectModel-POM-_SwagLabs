package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
protected WebDriver driver;
	
	
	
	//constructor
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//action
	public void HighToLow() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
		Select select = new Select(dropdown);
		select.selectByIndex(3);
		System.out.println("Dorpdown Completed");
		Thread.sleep(5000);
	}
	
	public void BuyFirstProduct() throws InterruptedException {
		//add to cart some products
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart")).click();
		System.out.println("1st product add to cart completed");
		Thread.sleep(5000);
	}
	
	public void BuySecondProduct() throws InterruptedException {
		driver.findElement(By.id("back-to-products")).click();
		
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		System.out.println("2nd product add to cart completed");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		System.out.println("Now we are in Cart Page");
		
		Thread.sleep(5000);
	}

	
	public void LowToHigh() throws InterruptedException {
		
		// click continue shopping button 
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[1]")).click();
		Thread.sleep(5000);

		// select low to high 
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
		Select selectLtoH = new Select(dropdown);
		selectLtoH.selectByIndex(2);
		System.out.println("Dorpdown Completed");
		Thread.sleep(5000);
		
	}
	public void Buy3rdProduct() throws InterruptedException {
		//add to cart some products
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart")).click();
		System.out.println("3rd product add to cart completed");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/button")).click();
		System.out.println("product Page");
		Thread.sleep(5000);
		
		//click cart icon 
				driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
				System.out.println("Now we are in Cart Page");
				Thread.sleep(5000);
	
}
}
