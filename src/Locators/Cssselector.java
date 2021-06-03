package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
	public static void main (String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriver cd=new ChromeDriver();
cd.get("https://stage2.numi.com/");
Thread.sleep(2000);

cd.findElement(By.cssSelector("input[id='email']")).sendKeys("dmanogaran@nutrisystem.com");
Thread.sleep(2000);
cd.findElement(By.cssSelector("input[class='password_input']")).sendKeys("test1234");
Thread.sleep(2000);
cd.findElement(By.cssSelector("a[class='sign_up_for_numi_text']")).click();
Thread.sleep(2000);

}
}
