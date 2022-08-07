package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Chromebrowser;
import pom.ZerodhaForgotPasswordPOM;

public class forgotuser {
	WebDriver driver;
	
	@BeforeMethod
	public void openurl() {
		driver=Chromebrowser.openbrowser();
		}
	@Test
	public void clickOnForgotPass() throws InterruptedException {
		ZerodhaForgotPasswordPOM f=new ZerodhaForgotPasswordPOM(driver);
		Thread.sleep(1500);
		f.forgotidpassword(driver, "abc@gmail.com");
	}

}
