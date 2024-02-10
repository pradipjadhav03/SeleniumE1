package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new EdgeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		WebElement activeEle = dr.switchTo().activeElement();
		activeEle.sendKeys("bikes");
		Thread.sleep(1000);
		
		List<WebElement> bikesOption = dr.findElements(By.xpath(""));
		for( WebElement we:bikesOption)
		{
			String s = we.getText();
			System.out.println(s);
			
		}
		

	}

}
