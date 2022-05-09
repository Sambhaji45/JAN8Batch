package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pojo.Browser;

public class WebTable {
 
	public static void main(String[] args) {
		WebDriver driver= Browser.Browser1("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> row = driver.findElements(By.xpath("//table//tbody//tr"));
        
		List<WebElement> column= driver.findElements(By.xpath("//table//thead//tr//td"));
		Double max= 0.0;
		Double baseprice=0.0; 
		
		for(int i=1; i<=row.size();i++)
		{
			WebElement  Currentprice = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			String price =Currentprice.getText();
			max = Double.parseDouble(price); //convert string to double
			if(max >baseprice)
			{
				baseprice = max;
			}
			}
		System.out.println("max current pice is"+baseprice);

	}  
	   }

