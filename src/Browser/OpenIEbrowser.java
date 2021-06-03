package Browser;


import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEbrowser 
{
	 
		public static void main(String[] args) throws InterruptedException
		{
	System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		
		InternetExplorerDriver ied=new InternetExplorerDriver();
		Thread.sleep(2000);
		ied.close();
		
		 
		
		
	}
	

}
