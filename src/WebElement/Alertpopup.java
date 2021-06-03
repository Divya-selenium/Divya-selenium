package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup 
{
	public static void main(String[] args)
 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_users")).click();
	 driver.findElement(By.xpath("(//div[@class='components_button_label'])[1]")).click();
	 driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("test");
	 driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
Alert a=new Alert();



}
}
	
