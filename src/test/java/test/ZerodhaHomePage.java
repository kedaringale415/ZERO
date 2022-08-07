package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Chromebrowser;
import pom.ZerodhaLoginPage;
import pom.homepagePOM;
import utility.ExcelData;

public class ZerodhaHomePage {
	WebDriver driver;

	@BeforeMethod
	public void url() throws EncryptedDocumentException, IOException, InterruptedException {
		driver = Chromebrowser.openbrowser();
		ZerodhaLoginPage z=new ZerodhaLoginPage(driver);
		z.enteruserid(ExcelData.fetchdata("Zerodha user id", 0, 0));
		z.enterpassword(ExcelData.fetchdata("Zerodha password", 0, 0));
		z.clicksubmit();
		Thread.sleep(1000);
		z.enterpin(ExcelData.fetchdata("Zerodha pin", 0, 0));
		z.clickOnContinue();
		}

	@Test
	public void homepage() throws EncryptedDocumentException, IOException, InterruptedException {
		homepagePOM home = new homepagePOM(driver);
		Thread.sleep(1000);
		home.writetata("Tata");
		Thread.sleep(1000);
        home.stockFromSearchList(driver,"TATACHEM");
		}
	@Test(enabled=false)
	public void checkwatchlist() {
		homepagePOM watch = new homepagePOM(driver);
		watch.getwatchlist(driver);
		
	}
	

}
