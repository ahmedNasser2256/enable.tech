package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(className = "inventory_item_name")
	public WebElement itemName;
	
	@FindBy(id = "checkout")
	WebElement checkoutBtn;
	
	public void clickCheckoutBtn() {
		checkoutBtn.click();
	}

}
