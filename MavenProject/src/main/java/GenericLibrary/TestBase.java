package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public static WebDriver driver;
	public WebDriver Initialisedriver(String browser) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
		prop.load(fis);
		if(browser.equalsIgnoreCase("Chrome"))
		{
	System.setProperty("Webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
	 driver = new ChromeDriver();
		}
else if(browser.equalsIgnoreCase("Firefox"))
		{
	System.setProperty("Webdriver.gecko.driver", prop.getProperty("gekodriverpath"));
	driver = new FirefoxDriver();
		}
		return driver;
	}
	public static void settext(WebElement obj, String value)
	{
		obj.clear();
		obj.sendKeys(value);
	}
	public static void PerformClick(WebElement obj)
	{
		obj.click();
	}
	public void javascriptperformclick(WebElement obj)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();",obj);
	}
	public void  javascriptsettext(WebElement obj,String value)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("document.obj[0].value="+value);
	}
	public void selectDD(WebElement obj, String fieldValue, String type) {
		Select s = new Select(obj);
		if(type.equals("text"))
		{
			s.selectByVisibleText(fieldValue);
		}
		else if(type.equals("value"))
		{
			s.selectByValue(fieldValue);
		}
		else if(type.equals("index"))
		{
			s.selectByIndex(Integer.parseInt(fieldValue));
		}
	
	}
	public void waituntil(WebElement obj) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(obj));
	}
	public void screenshot(String imgName) throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("H:\\Selinium\\Screenshots\\"+imgName+".png");
		FileHandler.copy(SrcFile, DestFile);
	}
	
}
