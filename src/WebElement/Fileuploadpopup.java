package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@title='Create account on Naukri.com for free']")).click();
		driver.findElement(By.name("userType")).click();
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\dmanogaran\\OneDrive - Nutrisystem, Inc\\Desktop\\test.docx");
	}
}
