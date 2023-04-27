package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	 @FindBy(id = "user-name")
	    WebElement usernameField;

	    @FindBy(id = "password")
	    WebElement passwordField;

	    @FindBy(id = "login-button")
	     WebElement loginButton;

	   
	    public void login(String username, String password) {
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        loginButton.click();
	    }

	
	
	
	

}
