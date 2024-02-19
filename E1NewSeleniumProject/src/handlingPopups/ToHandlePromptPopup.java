package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(3000);
		
		Alert prAlert = driver.switchTo().alert();
		
		String text = prAlert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		prAlert.sendKeys("Pradip");
		Thread.sleep(2000);
		
		prAlert.accept();
		Thread.sleep(1000);
		
		driver.close();

	}

}
