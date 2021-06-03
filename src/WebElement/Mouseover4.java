package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouseover4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.name("addresstype"));
		Select s=new Select(we);
		//s.deselectByIndex(1);
		s.selectByValue("category.php?category=testing");
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		WebElement sr1=driver.findElement(By.id("Selenium Training"));
		Thread.sleep(3000);
		WebElement sr2=driver.findElement(By.id("cartArea]"));
		Thread.sleep(3000);
		a.dragAndDrop(sr1, sr2).perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
