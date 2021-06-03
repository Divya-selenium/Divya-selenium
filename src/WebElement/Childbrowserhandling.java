package WebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserhandling {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();
		System.out.print(parent);
		Set<String> child=driver.getWindowHandles();
		System.out.println(child);
		child.remove(parent);
		System.out.println(child.size());
		for(String b:child)
		{
			driver.switchTo().window(b);
			String title=driver.getTitle();
			System.out.println(title);
			
		
	
		
}
}
}
