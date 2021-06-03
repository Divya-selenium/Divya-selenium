package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements
{
	public static void main (String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriver cd=new ChromeDriver();
cd.get("https://stage2.numi.com/");
Thread.sleep(2000);
WebElement text=cd.findElement(By.id("email"));
text.sendKeys("divya.manogaran@tivityhealth.com");
Thread.sleep(2000);
WebElement text1=cd.findElement(By.id("password"));
text1.sendKeys("test1234");

Thread.sleep(2000);
cd.findElement(By.cssSelector("input[value='Log In']")).click();
Thread.sleep(2000);
cd.close();

}
}