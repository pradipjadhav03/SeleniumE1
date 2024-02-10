package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver(); // to launch the browser
		Thread.sleep(2000); // to hold on the browser for 2 seconds
		driver.manage().window().maximize(); //to maximize browser
		Thread.sleep(2000);
		
		Point targetPoint = new Point(400, 800); // to pass x & y co-ordinates
		
		driver.manage().window().setPosition(targetPoint); // to passs the co-ordinated setPosition Method
		
	}

}
