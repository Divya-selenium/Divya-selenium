package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApplication
{
	public static void main (String[] args)
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
/*driver.get("https://accounts.google.com/");
driver.findElement(By.id("identifierId")).sendKeys("sudha.divya7@gmail.com");
driver.findElement(By.className("VfPpkd-RLmnJb")).click();
driver.findElement(By.id("password")).sendKeys("Letv@123");
driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).click();
String title=driver.getTitle();
System.out.println(title);*/
/*driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("sudha.divya7@gmail.com");
driver.findElement(By.id("pass")).sendKeys("dheeran@10");
driver.findElement(By.name("login")).click();
String title=driver.getTitle();
System.out.println(title);
if(title.equals("Facebook - Log In or Sign Up"))
{
	System.out.println("Facebook home page displaying");
}
else
{
	System.out.println("Facebook home page not displaying");
}
driver.findElement(By.id("userNavigationLabel")).click();
driver.findElement(By.xpath("//div[text()='Log Out'])")).click();
driver.close();*/
driver.get("https://www.naukri.com/");
driver.findElement(By.linkText(linkText)("login")).click();
driver.findElement(By.id("email")).sendKeys("sudha.divya7@gmail.com");
driver.findElement(By.id("pass")).sendKeys("dheeran@10");
driver.findElement(By.name("login")).click();
String title=driver.getTitle();
System.out.println(title);
if(title.equals("Facebook - Log In or Sign Up"))
{
	System.out.println("Facebook home page displaying");
}
else
{
	System.out.println("Facebook home page not displaying");
}
driver.findElement(By.id("userNavigationLabel")).click();
driver.findElement(By.xpath("//div[text()='Log Out'])")).click();
driver.close();
}
}