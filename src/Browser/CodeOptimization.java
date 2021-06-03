package Browser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CodeOptimization 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
	}
	

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Enter browser name");
		Scanner sc = new Scanner(System.in);
				String browser=sc.next();
				WebDriver wd=null;
				
		if (browser.equals("chrome"))
		{
			
			
			wd=new ChromeDriver();
			
		}
		else
			if (browser.equals("firefox"))
			{
				
		wd=new FirefoxDriver();
		
		
		
	}
			else
				if(browser.equals("ie"))
				{
				
				
					
					wd=new InternetExplorerDriver();
					
					
	}
		Thread.sleep(2000);
		wd.close();
			
		}

	}//

