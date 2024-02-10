package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\QWA_SJFJVD_E1_Workspace\\\\WebElements\\TextBox.html");
		Thread.sleep(2000);
		
		WebElement textBox = driver.findElement(By.className("textbox"));
		textBox.sendKeys("manager");
		
	}

}
