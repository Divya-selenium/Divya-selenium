package WebElement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./photo/skillrary.png");
				FileUtils.copyFile(src,des);
		
		
		

}
}