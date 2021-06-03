package WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement drop=driver.findElement(By.id("cars"));
		Thread.sleep(3000);
		Select s=new Select(drop);
		List<WebElement> options=s.getOptions();
		System.out.println(options.size());
		
		for (WebElement we:options)
		{
			System.out.println(we.getText());
		
		s.selectByIndex(2);
		
		s.selectByValue("299");
		}
		System.out.println(s.isMultiple());
		
		
		if(s.isMultiple())
		{
		
			s.deselectByIndex(2);
			
			s.deselectByValue("299");
			
		
		}
		driver.close();
}
	}

