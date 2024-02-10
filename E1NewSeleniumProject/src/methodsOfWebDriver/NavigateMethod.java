package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // To launch the browser
		driver.navigate().to("https://www.flipkart.com/");  // To launch the web application
		driver.navigate().back(); // 
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.close();

	}

}
