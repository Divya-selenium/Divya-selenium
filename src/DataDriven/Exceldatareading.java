package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exceldatareading {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		FileInputStream f=new FileInputStream("./Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();


		driver.get(url);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		String us = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(us);

		String pwd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.id("pass")).sendKeys(pwd);
}
}
