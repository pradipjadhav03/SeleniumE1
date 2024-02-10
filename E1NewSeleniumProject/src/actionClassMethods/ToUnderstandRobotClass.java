package actionClassMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandRobotClass {

	public static void main(String[] args) throws AWTException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Robot robot = new Robot();

		

	}

}
