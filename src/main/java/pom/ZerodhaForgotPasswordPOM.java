package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPasswordPOM {
	@FindBy(xpath="//a[@class='text-light forgot-link']")private WebElement remuserid;
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement userid;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement email;
	@FindBy(xpath="//input[@placeholder='Captcha']")private WebElement captcha;
	@FindBy(xpath="//button[@type='submit']")private WebElement reset;
	
	public ZerodhaForgotPasswordPOM(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	
	public void forgotidpassword(WebDriver driver,String value) {
		remuserid.click();
		userid.sendKeys(value);
		pan.sendKeys(value);
		email.sendKeys(value);
		captcha.sendKeys(value);
		reset.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}