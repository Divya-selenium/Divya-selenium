package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser
{
	public static void main(String[] args) throws InterruptedException
	{
	String key= "webdriver.chrome.driver";
	String value="./Drivers/chromedriver.exe";
	System.setProperty(key, value);
	
	ChromeDriver cd=new ChromeDriver();
	Thread.sleep(2000);
	cd.close();
	

}
}
