package WebElement;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	JavascriptExecutor scroll=(JavascriptExecutor) driver;
	scroll.executeScript("window.scrollBy(0,5000)");
	Thread.sleep(3000);
	scroll.executeScript("window.scrollBy(0,-5000)");
	
	}
	
}
