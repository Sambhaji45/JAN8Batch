package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.BuyandSell;
import POM.ZerodhaLogin;
import Pojo.Browser;
import Utility.Excel;

public class TestSign {
    WebDriver driver;
    
    @BeforeMethod
    public void lunchbrow()
	{

		driver=Browser.Browser1("https://kite.zerodha.com/");
	}
   @Test
    
   public void loginacc() throws EncryptedDocumentException, IOException
   {
	   ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);
	     String user= Excel.getTestdata(0, 1, "credential");
	     zerodhalogin.enterUserName(user);
	     String pass= Excel.getTestdata(1, 1, "credential");
	     zerodhalogin.enterPassword(pass);
	     zerodhalogin.clickonSubmit();
	     String pin= Excel.getTestdata(2, 1, "credential");
	     zerodhalogin.enterthepin(pin, driver);
	     zerodhalogin.clickoncontinue();  
   }
 //  @Test
   
   
   
   
   
   
   
   
   
   
   
  
   
}
