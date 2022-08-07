package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignupPagePOM {
	@FindBy(xpath="//a[@class='text-light']")private WebElement signup;
	@FindBy(xpath="//input[@id='user_mobile']")private WebElement mobilenumber;
	@FindBy(xpath="//button[@id='open_account_proceed_form']")private WebElement continuebutton;
	
	public ZerodhaSignupPagePOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void signupzerodha(WebDriver driver,String number) {
		signup.click();
		Set<String>handles=driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		
		while(i.hasNext()) {
			  String address = i.next();
	    driver.switchTo().window(address);
	    String title="Signup and open a Zerodha trading and demat account online and start investing – Zerodha";
	    String currenttitle=driver.getTitle();
	    if(title.equals(currenttitle)) {
	        mobilenumber.sendKeys(number);
	        continuebutton.click();
	    }
		 }
	      }
	       }
