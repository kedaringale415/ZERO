package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	public static ExtentReports generateReports() {
		ExtentSparkReporter htmlreport=new ExtentSparkReporter ("extentReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlreport);
		extent.setSystemInfo("Test", "zerodha");
		extent.setSystemInfo("Tester", "Kedar");
		return extent;
		
		
		
	}

}
