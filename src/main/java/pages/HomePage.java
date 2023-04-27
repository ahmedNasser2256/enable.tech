package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement firstProduct;

    @FindBy(className = "shopping_cart_badge")
    WebElement cartBadge;
    
//    @FindBy (xpath = "//button[@type='submit']")
//	WebElement search;

    public void clickFirstProduct() {
        firstProduct.click();
    }
    
    public void viewCart() {
    	cartBadge.click();
    }
    
	
	
	
	

}
