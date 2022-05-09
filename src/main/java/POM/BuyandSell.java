package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyandSell {
WebDriver driver;
	
	@ FindBy(xpath="//li[@data-balloon='6']") private WebElement Watchlist6;
	@FindBy(xpath="//input[@type='text']") private WebElement SearchStock;
	//@FindBy(xpath="") private WebElement StockName;
	@FindBy(xpath="(//li[@class='search-result-item selected'][1])") private WebElement addstock;
    
	public BuyandSell(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void watch6()
	{
		Watchlist6.click();
	}
	public void SearchStk(String shear)
	{
		SearchStock.sendKeys(shear);
	}
   public void addst()
   {
	   addstock.click();
   }




}
