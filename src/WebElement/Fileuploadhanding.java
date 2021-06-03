package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadhanding {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("user");
		driver.findElement(By.id("last")).click();
		driver.findElement(By.xpath("//img[@class='user-image']")).click();
		driver.findElement(By.xpath("//a[text()='Profile']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-flat btn-sm']")).click();
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\dmanogaran\\OneDrive - Nutrisystem, Inc\\Pictures\\2020_03_23_03_27_11_Google.png");
	driver.findElement(By.xpath("//button[text()='Update']")).submit();
	driver.close();
	}
	
		
		
}
