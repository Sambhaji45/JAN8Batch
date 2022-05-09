package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static void addreport()
	{
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("extentReoprter.html");
         ExtentReports reports = new ExtentReports();
         reports.attachReporter(htmlReport);	
         reports.setSystemInfo("Env", "UAT");
         reports.setSystemInfo("TestingType", "Regression");
         
	}
}
