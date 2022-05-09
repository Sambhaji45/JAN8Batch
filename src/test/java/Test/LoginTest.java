package Test;

import java.io.IOException;


import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.SignupPage;
import POM.ZerodhaLogin;
import Pojo.Browser;
import Utility.Excel;
import Utility.ScreenShots;

@Listeners(ListenerTest.class)
public class LoginTest extends BaseTest {
	
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
    Assert.assertTrue(false);
    }
	
	 @Test
	 
	 public void creatnewAcc()
	 {
		ZerodhaLogin newacc= new ZerodhaLogin(driver);
		newacc.clickonewsingupp();
		ArrayList<String> i = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(i.get(1));
		SignupPage signup1 = new  SignupPage(driver);
		String ActualTitle =driver.getTitle();
		String expectedTitle ="Signup and open a Zerodha trading and demat account online and start investing – Zerodha";
		SoftAssert Sowft= new SoftAssert();
		Sowft.assertEquals(ActualTitle, expectedTitle);
		
		//Assert.assertEquals(ActualTitle, expectedTitle);
		//Assert.assertFalse(signup1.logoisDisplayed());
		signup1.EntermobNum("9172202717");
		Sowft.assertAll();
	 }
	
	
	@AfterMethod
	public void ScreenShot() throws IOException {
		ScreenShots.Scshot(driver, "sambhaji");
		
	}
	}