package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShots;

public class ListenerTest extends BaseTest implements ITestListener {
	WebDriver driver;
	public void onTestStart( ITestResult result)
	{
		System.out.println("My test is Started "+ result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("My test is Successful "+ result.getName());
	}
	public void OnTestFailure(ITestResult result)
	{
	 try {
		ScreenShots.Scshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	public void OnTestSkipped(ITestResult result)
	{
		System.out.println("My Test is Skipped "+ result.getName());
	}
	

}
