package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pojo.Browser;

public class D1 {
	

	public static void main(String[] args) {
    
		
		double g=0;
		WebDriver  driver = Browser.Browser1("https://demo.guru99.com/test/web-table-element.php");
		
	List<WebElement> row  =	driver.findElements(By.xpath("//tbody//tr"));
	 
	
	
	for(int i=1;i<=row.size();i++) {
		
		WebElement row1=driver.findElement(By.xpath("//tr["+i+"]/td[4]"));
		
		String sh=row1.getText();
	double max=Double.parseDouble(sh);WebElement row11=driver.findElement(By.xpath("//tr["+i+"]/td[1]"));	
	  String shearn = row11.getText();
	
	if(max>g) {
		g=max;
			
	}
	
	}
	System.out.println(g);
	//System.out.println(shearn);
	
	}

	private static void test23() {
		// TODO Auto-generated method stub
		
	}

	private static void delet() {
		
		System.out.println("SK12");
		
	}
	}
	

