package Browser;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenMultiplebrowser 
{
private static Scanner sc;

public static void main(String[] args) throws InterruptedException
{
	System.out.println("Enter browser name");
	sc = new Scanner(System.in);
			String browser=sc.next();
	if (browser.equals("chrome"))
	{
		String key= "webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		
		ChromeDriver cd=new ChromeDriver();
		Thread.sleep(2000);
		cd.close();
	}
	else
		if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	FirefoxDriver fd=new FirefoxDriver();
	Thread.sleep(2000);
	fd.close();
	
	
}
		else
			if(browser.equals("ie"))
			{
			
			System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
				
				InternetExplorerDriver ied=new InternetExplorerDriver();
				Thread.sleep(2000);
				ied.close();
				
}
		
	}

}
