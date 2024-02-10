package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
	 	WebDriver dr  = new ChromeDriver();
	 	dr.manage().window().maximize();
	 	dr.get("https://www.instagram.com/");
	 	Thread.sleep(4000);
	 	
	 	//To find locate username textbox and pass the inut
	 	WebElement usnTB = dr.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
	 	usnTB.sendKeys("pradipjadhav");
//	 	WebElement usnTb = dr.findElement(By.cssSelector("input[aria-label='Phone number, username or email address']"));
//	 	usnTb.sendKeys("pradipjadhav");
//	 	Thread.sleep(1000);
	 	
	 	//To find / locate password textbox and pass the input
	 	WebElement passTb = dr.findElement(By.cssSelector("input[type='password']"));
	 	passTb.sendKeys("Pradip@123");
	 	Thread.sleep(1000);
	 	
	 	//To click on login button
	 	WebElement loginButton = dr.findElement(By.cssSelector("button[type='submit']"));
	 	loginButton.click();
	 	Thread.sleep(1000);
	 	
	}

}
