package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement1 
{
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");
	//Verify get text method
	WebElement ew=driver.findElement(By.linkText("Home & Living"));
	String text=ew.getText();
	System.out.println(text);
	//Verify getsize method
	WebElement ew1=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	
	Dimension d1=ew1.getSize();
	System.out.println("Height"+d1.getHeight());
	System.out.println("Width"+d1.getWidth());
	//Verify Get location method
	WebElement ew2=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	Point p1=ew2.getLocation();
	System.out.println("X"+p1.x);
	System.out.println("y"+p1.y);
	//Verify getAttribute method
	WebElement ew3=driver.findElement(By.xpath("//a[@data-group='home-&-living']"));
	String s1=ew3.getAttribute("data-index");
	System.out.println(s1);
	driver.close();  
	
	
	
	
	}

	}

