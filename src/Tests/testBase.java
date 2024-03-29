package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testBase {

	public static WebDriver driver = null;

	@BeforeSuite
	public void initialize() throws IOException{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); 
		//To maximize browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To open facebook
		driver.get("https://www.facebook.com");

	}

	@AfterSuite
	//Test cleanup
	public void TeardownTest()
	{
		testBase.driver.quit();
	}
}
