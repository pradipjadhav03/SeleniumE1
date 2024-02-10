package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		
	 	WebDriver  driver = new EdgeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 	
	 	driver.get("http://127.0.0.1/login.do;jsessionid=456a25lgvaki6");
	 	
	 	
	 	//To find login button and store in a variable
	 	WebElement lb = driver.findElement(By.id("loginButton"));
	 	lb.click(); // To click on login
	 	
	 	
	 	
	 	

	}

}
