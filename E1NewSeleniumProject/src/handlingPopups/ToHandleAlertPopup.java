package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
		driver.get("htts://omayo.blogspoy.com/");
		
		//To generate alert popup
		driver.findElement(By.id("alert")).click();
		Thread.sleep(3000);
		
		//To switch the control to alert popup
		Alert alertPopup = driver.switchTo().alert();
		
		//To click on Ok button from the popup
		alertPopup.accept();

	}

}
