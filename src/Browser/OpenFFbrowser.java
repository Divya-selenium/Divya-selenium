package Browser;



import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFFbrowser 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		Thread.sleep(2000);
		fd.close();
	}
	
	
	

}
