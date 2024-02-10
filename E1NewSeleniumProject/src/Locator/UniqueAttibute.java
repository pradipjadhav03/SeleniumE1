package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttibute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://app.fireflink.com/signin");
		Thread.sleep(5000);
		
		WebElement usnTB = dr.findElement(By.xpath("//input[@name='namename']"));
		usnTB.sendKeys("pradipjadhav");
		Thread.sleep(2000);
		
		WebElement passTB = dr.findElement(By.xpath("//input[@name='password'"));
		passTB.sendKeys("Pradip@123");
		Thread.sleep(2000);
		
		
		WebElement passTb = dr.findElement(By.xpath("//button[@type='submit']"));
		passTb.click();
		Thread.sleep(2000);
	}

}
