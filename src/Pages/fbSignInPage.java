package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class fbSignInPage {

	WebDriver driver;
	public fbSignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//*[@id='u_0_e']") WebElement firstName;
	@FindBy(how=How.XPATH, using="//*[@id='u_0_g']") WebElement lastName;
	
	public void typeFNames(String fname) {
		firstName.sendKeys(fname);
	}
	public void typeLNames(String lname) {

		lastName.sendKeys(lname);
	}
}
