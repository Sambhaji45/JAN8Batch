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

public class BuySellTest {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser()
	{
		driver= Browser.Browser1("https://kite.zerodha.com/");
	}
    
	@Test
	public void Loginwdvalidcredential() throws EncryptedDocumentException, IOException 
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
     
     BuyandSell buysell= new BuyandSell(driver);
     buysell.watch6();
     buysell.SearchStk("HSCL");
     buysell.addst();
     
    
    }
}
