package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignup 
{
	public static void main (String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriver cd=new ChromeDriver();
cd.get("https://www.facebook.com/");
Thread.sleep(2000);
cd.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
Thread.sleep(2000);
cd.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Divyatest");
Thread.sleep(2000);
cd.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mtest");
Thread.sleep(2000);
cd.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("numitesting@gmail.com");
Thread.sleep(2000);
cd.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("numitesting@gmail.com");
Thread.sleep(2000);
cd.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("test1234");
Thread.sleep(2000);
Select s=new Select(cd.findElement(By.xpath("//select[@name='birthday_month']")));
s.selectByIndex(4);
Thread.sleep(2000);
Select s1=new Select(cd.findElement(By.xpath("//select[@name='birthday_day']")));
s1.selectByIndex(4);
Thread.sleep(2000);
Select s2=new Select(cd.findElement(By.xpath("//select[@name='birthday_year']")));
s2.selectByIndex(20);
Thread.sleep(2000);
cd.findElement(By.xpath("//input[@value='1']")).click();
Thread.sleep(2000);
cd.findElement(By.xpath("//button[@name='websubmit']")).click();
Thread.sleep(2000);
cd.close();


}
}
