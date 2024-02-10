package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMeth0od {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	    String title = driver.getTitle();
	     
	     System.out.println(title);
	}

}
