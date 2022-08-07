package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepagePOM {
	@FindBy(xpath="//input[@icon='search']")private WebElement search;
	@FindBy(xpath="//span[@class='tradingsymbol']") private List <WebElement> stocklist;
	@FindBy(xpath="//button[@data-balloon='Buy']")private WebElement buy;
	@FindBy(xpath="//span[@class='icon icon-plus']")private WebElement add;
	@FindBy(xpath="//span[@class='nice-name']")private List<WebElement> watchlist;
	
	public homepagePOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public void writetata (String initial) {
    	search.sendKeys(initial);
    }
   
    public void stockFromSearchList(WebDriver driver,String stockname) {
    	for(int i=0;i<stocklist.size();i++) {
    		WebElement currentstock=stocklist.get(i);
    		String name=currentstock.getText();
    		if(name.equals(stockname))
    		{
    		Actions actions=new Actions(driver);
    		actions.moveToElement(currentstock);
    		actions.perform();
    		//buy.click();
    		add.click();
    		}
    		}
    	 }
    public void getwatchlist(WebDriver driver) {
    for(int j=0;j<watchlist.size();j++) {
    	WebElement watch=watchlist.get(j);
    	System.out.println(watch);
    }
    	
    }
    
    

    
    
    
    
    
    
}
