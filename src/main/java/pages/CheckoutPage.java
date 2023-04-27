package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "first-name")
	WebElement firstNameField;
	
	@FindBy(id = "last-name")
	WebElement lastNameField;
	
	@FindBy(id = "postal-code")
	WebElement postalCodeField;
	
	@FindBy(id = "continue")
	WebElement continueBtn;
	
	
	
	public void addUserInformation (String firstName, String lastName, String PostalCode) {
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		postalCodeField.sendKeys(PostalCode);
		continueBtn.click();
		
	}

}
