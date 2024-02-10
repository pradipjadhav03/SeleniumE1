package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReleaseMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(dr);
		
		dr.findElement(By.xpath("//section[text()='Mouse Actions']"));
		dr.findElement(By.xpath("//section[text()='Click & Hold']"));
		
		//TO find the element to n=be clicked and hold
		WebElement clickAndHold = dr.findElement(By.xpath("//div[@id='circle']"));		
		act.clickAndHold(clickAndHold).perform();//To perform click andHold operation
		Thread.sleep(7000);
		act.release(clickAndHold).perform();
		
	}

}
