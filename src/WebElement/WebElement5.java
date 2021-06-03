package WebElement;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement5 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		List<WebElement> option=driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println ("count of the suggestion option"+option.size());
		
		for(WebElement we:option)
		{
			System.out.println(we.getText());
		}
	
		driver.findElement(By.xpath("//b[text()=' python']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("selenium python - Google Search"))
			
		{
			System.out.println("validation pass");
		}
		else
		{
			System.out.println("fail");	
		}
		
		driver.close();
	}
	
}
