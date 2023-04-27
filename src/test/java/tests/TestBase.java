package tests;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {
	public  WebDriver driver;
	

	
@BeforeTest
	public void StartDriver()
	{


		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//drivers//geckodriver.exe");
//		driver = new FirefoxDriver();
		driver.navigate().to("http://www.saucedemo.com");
		driver.manage().window().maximize();
		
		

	}


	@AfterTest

	public void EndDriver()
	{
		driver.quit();
	}
}
