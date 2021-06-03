package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement3
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		WebElement select=driver.findElement(By.xpath("//input[@value='1']"));
		
		if(select.isSelected())
		{
			System.out.println("Gender selected");
			
	}
		else
		{
			System.out.println("Gender not selected");
		}
		driver.close();
	}
}
