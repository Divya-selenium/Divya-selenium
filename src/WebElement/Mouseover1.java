package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.linkText("Jackets"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(we).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/collections/outerwear']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
}
}
