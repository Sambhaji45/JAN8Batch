package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
public static void Scshot(WebDriver driver, String  name ) throws IOException {
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("E:\\Sambhaji\\SS\\KiteZerodha\\Screenshot\\.jpg");
		
	  FileHandler.copy(Source, Destination);
	  
		
	}
}
