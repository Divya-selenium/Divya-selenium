package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//WebElement drop=driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
	
		WebElement drop=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//drop.click();
		Thread.sleep(3000);
		Select s=new Select(drop);
		Thread.sleep(3000);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("search-alias=warehouse-deals");
		Thread.sleep(3000);
		s.selectByVisibleText("Appliances");
		Thread.sleep(3000);
		driver.close();
		
		
}
}