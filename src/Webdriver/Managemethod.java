package Webdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethod
{
	public static void main (String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
WebDriver cd=new ChromeDriver();
Dimension d=new Dimension(150,300);
Options op=cd.manage();
Window win=op.window();

win.setSize(d);
Thread.sleep(2000);

Point p=new Point(150,210);
win.setPosition(p);
Thread.sleep(2000);

win.maximize();
Thread.sleep(2000);

win.fullscreen();
Thread.sleep(2000);

op.deleteAllCookies();
Thread.sleep(2000);

//cd.close();
cd.quit();
}
}
