package WebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Filedownloadhandling {
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://selenium-release.storage.googleapis.com/3.141/selenium-server-standalone-3.141.59.jar']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.close();
	}
	
	
	
}