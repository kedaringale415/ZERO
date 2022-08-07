package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Chromebrowser;
import pom.ZerodhaLoginPage;
import utility.ExcelData;
import utility.Report;

public class ZerodhaLogin {
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	
	@BeforeTest
	public void getReport() {
		extent=Report.generateReports();
	}
	
	@BeforeMethod
	public void openURl() {
		driver=Chromebrowser.openbrowser();
		}
	
	@Test
	public void Login_with_valid_userID_and_valid_password() throws EncryptedDocumentException, IOException, InterruptedException {
		test=extent.createTest("Login_with_valid_userID_and_valid_password");
		ZerodhaLoginPage login=new ZerodhaLoginPage(driver);
		String title=driver.getTitle();
		login.enteruserid(ExcelData.fetchdata("Zerodha user id", 0, 0));
		login.enterpassword(ExcelData.fetchdata("Zerodha password", 0, 0));
		login.clicksubmit();
        login.enterpin(ExcelData.fetchdata("Zerodha Pin", 0, 0));
		login.clickOnContinue();
		}
	
	@AfterMethod
	public void postexecution(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,result.getName());
		}
		
	}
	@AfterTest
	public void printreport() {
		extent.flush();
	}
	
	
	
	
	
		
	}


