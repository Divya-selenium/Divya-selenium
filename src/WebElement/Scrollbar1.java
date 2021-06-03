package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.xpath("//a[text()='JMeter']"));
		Point loc=we.getLocation();
		int x=loc.getX();
		
		int y=loc.getY();
		
	JavascriptExecutor scroll=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	scroll.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(3000);
	
	we.click();
	}
	}
