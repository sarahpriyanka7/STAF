package PageAction;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;
import ObjectRepository.Objects;


public class Launchingbrowsers extends TestBase{

	
	@Test
	public void login() throws IOException 
	{
		String browser = "Chrome";
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(browser);
		Objects obj = PageFactory.initElements(driver, Objects.class);
		 driver.manage().window().maximize();
	     driver.get("http://newtours.demoaut.com/");
	     //WebElement User_Name = driver.findElement(By.name("userName"));
	     //User_Name.sendKeys("Beasant");
	     //User_Name.clear();
	     //User_Name.sendKeys("mercury");
	     //driver.findElement(By.name("userName")).sendKeys("mercury");
	     //driver.findElement(By.name("password")).sendKeys("mercury");
	     //drivefindElement(By.name("login")).click();
	     //driver.findElement(By.linkText("CONTACT")).click();  
	     //obj.User_Name.clear();
	     //obj.User_Name.sendKeys("mercury");
	     settext(obj.User_Name,"mercury");
	     //obj.Password.sendKeys("mercury");
	     settext(obj.Password,"mercury");
	     //obj.Login.click();
	     PerformClick(obj.Login);
	     //javascriptperformclick(obj.Login);
	     //obj.Contacttab.click();
	     PerformClick(obj.Contacttab);
	     //javascriptperformclick(obj.Contacttab);
	}
	

}