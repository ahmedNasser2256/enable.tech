package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutOverview extends PageBase{

	public checkoutOverview(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "finish")
	WebElement finishBtn;
	
	public void clickFinishBtn() {
		finishBtn.click();
	}

}
