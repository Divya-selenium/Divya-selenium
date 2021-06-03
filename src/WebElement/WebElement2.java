package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://twitter.com/");
		driver.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-13gxpu9 r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-b88u0q r-1777fci r-rjixqe r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']")).click();
		WebElement display=driver.findElement(By.name("session[username_or_email]"));
		if(display.isDisplayed())
		{
			System.out.println("username or mobile test field displaying");
		}
		else
		{
			System.out.println("username or mobile test field not displaying");
		}
		//WebElement login=driver.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-b88u0q r-1777fci r-rjixqe r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0'])[1]"));
		WebElement login=driver.findElement(By.xpath("//div[@aria-disabled='true']"));
		if(login.isEnabled())
		{
			System.out.println("Login enabled");
			
		}
		else
		{

			System.out.println("Login disabled");
	}
		
	}

}
