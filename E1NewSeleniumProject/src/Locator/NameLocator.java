package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		
		 WebElement usnTB = driver.findElement(By.name("username"));
		 usnTB.sendKeys("Bhupendar Jogi");
		 Thread.sleep(2000);
		 
		 WebElement passTB = driver.findElement(By.name("password"));
		 passTB.sendKeys("Joker");
		 Thread.sleep(2000);
		 
		 WebElement loginBT = driver.findElement(By.className("x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1"));
		 loginBT.click();
		
		
	}

}
