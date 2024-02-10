package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		
		dr.findElement(By.xpath("//section[text()='Mouse Actions']"));
		dr.findElement(By.xpath("//section[text()='Drag & Drop']"));
		dr.findElement(By.xpath("//a[text()='Drag Position']"));
		
		//Mobile and laptop source elements
		dr.findElement(By.xpath("//div[text()='Mobile Charger']"));
		dr.findElement(By.xpath("//div[text()='Laptop Charger']"));
		dr.findElement(By.xpath("//div[text()='Mobile Cover']"));
		dr.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		//Mobile and laptop target elements
		WebElement mobileAccessoriesTarget = dr.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopAccessoriesTarget = dr.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		
		
	}

}
