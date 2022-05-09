package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLogin {

	@FindBy(xpath="//input[@id='userid']") private WebElement userName;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement submit;
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continu;
	@FindBy(xpath = "//a[@class='text-light forgot-link']")private WebElement forgotpasswprd;
	@FindBy (xpath = "//a[@class='text-light']")private WebElement newsingup;
	
	public ZerodhaLogin (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonewsingupp() {
	newsingup.click();
	}
	public void clickonforgotpass() {
		forgotpasswprd.click();
	}
	public void enterthepin(String pinn ,WebDriver driver ) {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinn);
	}
	public void clickoncontinue() {
		continu.click();
	}
	public void enterUserName(String user)
	{
		userName.sendKeys(user);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
    public void clickonSubmit()
    {
	submit.click();
    }

}


