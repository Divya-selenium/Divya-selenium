package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods
{
	public static void main (String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	cd.get("https://stage2.numi.com/");
	Thread.sleep(2000);
String title=cd.getTitle();
System.out.println(title);
//String Source=cd.getPageSource();
//System.out.println(Source);
String url=cd.getCurrentUrl();
System.out.println(url);
cd.navigate().to("https://www.stage.nutrisystem.com/");

	Thread.sleep(2000);
	cd.navigate().back();
	Thread.sleep(2000);
	cd.navigate().forward();
	Thread.sleep(2000);
	cd.navigate().refresh();
	Thread.sleep(2000);
	cd.close();
	
	

}
}
