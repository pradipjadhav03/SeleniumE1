package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // to launch the browser
		Thread.sleep(2000); // to hold on the browser for 2 seconds
		driver.manage().window().maximize(); //to maximize browser
		Thread.sleep(2000);
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
		
		//driver.close();

		driver.quit();
	}

}
