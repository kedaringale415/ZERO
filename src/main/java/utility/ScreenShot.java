package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void takescreenshot(WebDriver driver,String name) throws InterruptedException, IOException {
		String date = getdate();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourse = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\KEDAR\\Selenium\\New folder\\"+name+date+".jpg");
		FileHandler.copy(sourse, destination);
	}

	private static String getdate() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MMM-dd hh-mm-ss");
		LocalDateTime currentTime=LocalDateTime.now();
		String d=dtf.format(currentTime);
		return d;
	}

}
