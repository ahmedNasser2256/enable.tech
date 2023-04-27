package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.checkoutComplete;
import pages.checkoutOverview;


public class AddItemToCart extends TestBase{

	HomePage objectHomePage;
	LoginPage objectLoginPage;
	CartPage objectCartPage;
	CheckoutPage objeCheckoutPage;
	checkoutOverview objCheckoutOverview;
	checkoutComplete objeCheckoutComplete;

	
	@Test
	public void addProductsToCart()
	{
		
		//Login
		objectLoginPage = new LoginPage(driver);
		objectLoginPage.login("standard_user", "secret_sauce");
		
		//add item to cart
		objectHomePage = new HomePage(driver);
		objectHomePage.clickFirstProduct();
		
		//view cart
		objectCartPage = new CartPage(driver);
		objectHomePage.viewCart();
		assertEquals(objectCartPage.itemName.getText(), "Sauce Labs Backpack");
		objectCartPage.clickCheckoutBtn();
		
		//add user information
		objeCheckoutPage = new CheckoutPage(driver);
		objeCheckoutPage.addUserInformation("Ahmed", "Nasser", "1234");
		
		//complete the order
		objCheckoutOverview = new checkoutOverview(driver);
		objCheckoutOverview.clickFinishBtn();
		
		//assert complete page is displayed
		objeCheckoutComplete = new checkoutComplete(driver);
		assertTrue(objeCheckoutComplete.completeImag.isDisplayed());
		
		
			
		}
		
	}
	
	

