package PageAction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;
import ObjectRepository.AutoITObjects;
import ObjectRepository.HandlingDateTimeObjects;

public class HandlingDateTime extends TestBase {
	@Test
	public void HandlingDate() throws IOException, InterruptedException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
		prop.load(fis);
		
		HandlingDateTimeObjects Dateobj = PageFactory.initElements(driver, HandlingDateTimeObjects.class);
		
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(prop.getProperty("browser"));
		driver.manage().window().maximize();
		//**************Handling Date Time by directly passing it as text*******************************
	/*    driver.get(prop.getProperty("HandlingDateTimeurl"));
	    
	    
	    Dateobj.Bdaytime.sendKeys("09Oct");
	    Dateobj.Bdaytime.sendKeys(Keys.TAB);
	    Dateobj.Bdaytime.sendKeys("2016");
	    Dateobj.Bdaytime.sendKeys(Keys.TAB);
	    Dateobj.Bdaytime.sendKeys("0245PM");*/
	    
	    //*******************Handling Date Time by clicking on the calender and time images*******************8888
	    driver.get(prop.getProperty("HandlingDateTimeurl1"));
	    //waituntil(Dateobj.SelectCalender);
	    Thread.sleep(5000);
	    driver.manage().deleteAllCookies();
	    Set<Cookie> afterdeletecookies = driver.manage().getCookies();
	    System.out.println("COUNT OF COOKIES : "+afterdeletecookies.size());
	    //driver.findElement(By.xpath("//*[@id='flightSearchContainer']/div[4]/button")).click();
	    javascriptperformclick(Dateobj.SelectCalender);
	    //Dateobj.SelectCalender.click();
	  
	   
	     

	}
}
	
	
