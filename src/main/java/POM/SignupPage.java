package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	@FindBy(xpath="//a[@class='text-light']") private WebElement createAcc;
	@FindBy(xpath="//img[@class='logo-img']") private WebElement logo;
	@FindBy(xpath="//input[@id='user_mobile']") private WebElement signup;
	@FindBy(xpath="//button[@type='submit']") private WebElement conti;
	
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String  gettitlepage(WebDriver driver)
	{
	return driver.getPageSource();
	}
	public void Clickoncreateacc()
	{
		createAcc.click();
	}
	public boolean  logoisDisplayed()
	{
	    return logo.isDisplayed();
	}
	public void EntermobNum(String number)
	{
		signup.sendKeys(number);
	}
    public void clickonContinue()
    {
	     conti.click();
    }
}
