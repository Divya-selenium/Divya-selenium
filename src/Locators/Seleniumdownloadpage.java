package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdownloadpage 
{
	public static void main (String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriver cd=new ChromeDriver();
cd.get("https://www.selenium.dev/downloads/");
Thread.sleep(2000);
cd.findElement(By.xpath("//h1[contains(text(),'Downloads')]"));
cd.findElement(By.xpath("//h2[contains(text(),'Selenium Server (Grid)')]"));
cd.findElement(By.xpath("//h2[contains(text(),'The Internet Explorer Driver Server')]"));
cd.findElement(By.xpath("//h1[contains(text(),'//h2[contains(text(),'Selenium Client & WebDriver Language Bindings')]')]"));

}
}