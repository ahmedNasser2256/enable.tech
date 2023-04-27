package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutComplete extends PageBase {

	public checkoutComplete(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "pony_express")
	public WebElement completeImag;
}
