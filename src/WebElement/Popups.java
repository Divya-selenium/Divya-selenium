package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popups {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.linkText("COURSE"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(we).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='product.php?product=selenium-training']")).click();
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();
	}
		
		
		
		
}
