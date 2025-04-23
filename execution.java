package execution;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClassNew.BaseClass;
import pages.CartPage;
import pages.CheckoutComplete;
import pages.CheckoutOverview;
import pages.Checkoutpage;
import pages.LoginPage;
import pages.ProductPage;

public class execution {
	public class TestExecution extends BaseClass {

		private LoginPage loginPage;
		private ProductPage productpage;
		private CartPage cartpage;
		private Checkoutpage checkoutpage;
		 private CheckoutOverview checkoutoverview;
		 private CheckoutComplete  checkoutcomplete;

		@BeforeMethod
		public void setupTest() {
			setup();
			loginPage = new LoginPage(getDriver());
			productpage = new ProductPage(getDriver());
			cartpage = new CartPage(getDriver());
			checkoutpage = new Checkoutpage(getDriver());
			checkoutoverview = new CheckoutOverview(getDriver());
			checkoutcomplete = new CheckoutComplete(getDriver());
			

		}

		@Test
		public void login() throws InterruptedException {
			loginPage.enterUser("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLogin();

			Thread.sleep(5000);
			
			
			
			productpage.HighToLow();
			productpage.BuyFirstProduct();
			productpage.BuySecondProduct();
			productpage.LowToHigh();
			productpage.Buy3rdProduct();
			
			Thread.sleep(5000);
			
			cartpage.CartPageCheck();
			Thread.sleep(5000);
			
			
			checkoutpage.CheckOut();
			Thread.sleep(5000);
			
			checkoutoverview.CheckOutOverview();
			Thread.sleep(5000);
			
			checkoutcomplete.CheckOutComplete();
			Thread.sleep(5000);
			
			
			
			
			
		}
	    @AfterMethod
		public void closebrowser() {
			closeDown();
		}
}
}
