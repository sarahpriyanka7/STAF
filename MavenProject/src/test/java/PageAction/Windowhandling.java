package PageAction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.support.PageFactory;

import GenericLibrary.TestBase;
import ObjectRepository.AlertObjects;

public class Windowhandling extends TestBase{

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("url"));
		//String browser = "Chrome";
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(prop.getProperty("browser"));
		 driver.manage().window().maximize();
	     driver.get(prop.getProperty("windowalerturl"));
	     AlertObjects altob = PageFactory.initElements(driver, AlertObjects.class);
	     altob.clickhere.click();
	     String MainWindow=driver.getWindowHandle();		
 		
	        // To handle all new opened window.	
	     Set<String> s1 = driver.getWindowHandles();
	            
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	   
	                    settext(altob.Email,"52309@gmail.com");
	           	     	PerformClick(altob.Submit);
	           	     	driver.close();
	            }
	         

	}
	        driver.switchTo().window(MainWindow);
	}
	

}
