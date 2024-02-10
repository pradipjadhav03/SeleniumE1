package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); //// To launch the browser
		
		driver.manage().window().maximize(); // TO Maximize
		
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/QWA_SJFJVD_E1_Workspace/WebElements/TextBox.html"); //To launch the web page
		Thread.sleep(2000);
		
		WebElement textBox = driver.findElement(By.tagName("input")); //Find Password TextField on the webpage
		
		textBox.sendKeys("manager"); // To pass the inputs to Password Textfield
		
		// Nore :- Inputs are passed to Username Textfield because it is the first element designed with input tag

	}
 
}
