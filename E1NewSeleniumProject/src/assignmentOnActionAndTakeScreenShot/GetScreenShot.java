package assignmentOnActionAndTakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class GetScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.bluestone.com/");
		
		Actions act = new Actions(driver);
		
		WebElement gr = driver.findElement(By.id("goldCoins"));
		gr.click();
		
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenShot/GoldCoin.jpg");
		
		Files.copy(src, dest);
	}

}
