package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover3 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(we).perform();
		driver.findElement(By.xpath("//a[text()='Cucumber']")).click();
		WebElement we1=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		a.doubleClick(we1).perform();
		driver.close();
		
}
}
