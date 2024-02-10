package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://app.fireflink.com/signin");
		Thread.sleep(5000);
		
	 	WebElement loginTb = dr.findElement(By.xpath("//input[@placeholder='Enter your email']"));
	 	loginTb.sendKeys("pradipbjadhav001@gmail.com");
	 	Thread.sleep(2000);
	 	
	 	WebElement passTb = dr.findElement(By.xpath("//input[@placeholder='Enter your password']"));
	 	passTb.sendKeys("Pradip@123");
	 	Thread.sleep(2000);
	 	
	 	WebElement bt = dr.findElement(By.xpath("//button[@type='submit']"));
	 	bt.click();

	}

}
