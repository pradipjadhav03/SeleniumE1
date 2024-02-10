package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.manage().window().maximize(); // To maximize the browser window
		
		Thread.sleep(1000);
		
		Dimension targetSize = new Dimension(700, 200); //To pass the width & hight to Dimension class
		
		driver.manage().window().setSize(targetSize);
		

	}

}
