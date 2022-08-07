package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Chromebrowser;
import pom.ZerodhaSignupPagePOM;

public class ZerodhaSignUp {
	WebDriver driver;
	
	@BeforeMethod
	public void url() {
		driver=Chromebrowser.openbrowser();
		}
	
	@Test
	public void openSignupPage() {
		ZerodhaSignupPagePOM z=new ZerodhaSignupPagePOM (driver);
		z.signupzerodha(driver, "9284529624");
	}

}
