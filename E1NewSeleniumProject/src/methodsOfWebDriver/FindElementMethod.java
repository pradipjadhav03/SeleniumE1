package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new EdgeDriver();
		dr.manage().window().maximize();
		dr.get("http://127.0.0.1/login.do;jsessionid=1dfsw07ttk830");
		Thread.sleep(2000);
		
		WebElement usn = dr.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		Thread.sleep(1000);

		WebElement pass = dr.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("admin");
		Thread.sleep(1000);
		
		WebElement cl = dr.findElement(By.xpath("//body[@bgcolor='#ffffff']"));
		cl.click();
		
	}

}
