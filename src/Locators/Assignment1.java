package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
driver.get("https://demoapp.skillrary.com/");
driver.findElement(By.linkText("LOGIN")).click();
driver.findElement(By.name("email")).sendKeys("user");
driver.findElement(By.name("password")).sendKeys("user");
driver.findElement(By.name("login")).click();
}
}
