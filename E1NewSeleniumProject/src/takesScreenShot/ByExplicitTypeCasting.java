package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByExplicitTypeCasting {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		
		//To perform Type Casting
		TakesScreenshot ts = (TakesScreenshot)driver; // to perform type casting
		
		File src = ts.getScreenshotAs(OutputType.FILE); //To take the screenshot of the webpage
		
		File dest = new File("./screenShot/google.png"); // To SPecify the location,name and extension of screenshot
		
		Files.copy(src, dest); // to save the screenshot into screenshot folder

	}

}
