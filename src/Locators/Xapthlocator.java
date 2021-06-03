package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xapthlocator {
	public static void main (String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriver cd=new ChromeDriver();
    cd.manage().window().maximize();
cd.get("https://stage2.numi.com/");
Thread.sleep(2000);
cd.findElement(By.xpath("//input[@id='email']")).sendKeys("dmnogaran@nutrisystem.com");
cd.findElement(By.xpath("//input[@class='password_input']")).sendKeys("test1234");
cd.findElement(By.xpath("//input[@value='Log In']")).click();


//cd.findElement(By.xpath("//p[contains(@class,'pull-left footer_body_rights_reserved_text')]")).equals(true);
cd.findElement(By.xpath("//a[text()='Forgot your password']")).click();
Thread.sleep(2000);

}
}