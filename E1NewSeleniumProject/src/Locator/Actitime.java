package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		
		WebElement usnid = driver.findElement(By.id("id_userLoginId"));
		usnid.sendKeys("Pradip");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.id("id_password"));
		pass.sendKeys("0320");
		Thread.sleep(4000);
		
		WebElement siButton = driver.findElement(By.tagName("button"));
		siButton.click();
		
	}

}
