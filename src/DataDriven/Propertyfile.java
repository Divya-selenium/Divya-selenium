package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Propertyfile {

	public static void main (String[] args) throws InterruptedException, FileNotFoundException, IOException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    Properties p=new Properties();
    p.load(new FileInputStream("./data.properties"));
    
    
    driver.get(p.getProperty("url"));
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();

    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(p.getProperty("firstname"));

    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(p.getProperty("lastname"));

    driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys(p.getProperty("username"));

    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(p.getProperty("username"));

    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(p.getProperty("password"));

    driver.close();
	}
}
