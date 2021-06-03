package WebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Childbrowserhandling1 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
	WebElement el=driver.findElement(By.xpath("(//a[@href='https://demoapp.skillrary.com'])[2]"));
	el.click();
	String title=el.getText();
	
	System.out.println(title);
	
	
	driver.switchTo().window(title);
	//Set<String> child=driver.getWindowHandles();
	//System.out.println(child);
	}
	
	
	
	
		
		
		
		
}
