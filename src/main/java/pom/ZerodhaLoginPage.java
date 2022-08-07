package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	@FindBy(xpath="//input[@id='userid']")private WebElement userid;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//input[@label='PIN']")private WebElement pin;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement continueButton;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	
	public  ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enteruserid(String user) {
		userid.sendKeys(user);
	}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
    public void clicksubmit() {
    	submit.click();
    }
    public void clickforgot() {
    	forgot.click();
    }
    public void enterpin(String key) {
    	pin.sendKeys(key);
    }
    public void clickOnContinue() {
    	continueButton.click();
    }

}
