package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.fbSignInPage;

public class signUptoFB extends testBase {

	@Test
	public void init() throws Exception{
		fbSignInPage signUp= PageFactory.initElements(driver, fbSignInPage.class);
		signUp.typeFNames("Ashif");
		Thread.sleep(1000);
		signUp.typeLNames("uzzaman");
		
	}
	
	
}
