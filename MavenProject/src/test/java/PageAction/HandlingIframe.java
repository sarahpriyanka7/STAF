package PageAction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;
import ObjectRepository.FBObjects;
import ObjectRepository.HandlingframeObjects;

public class HandlingIframe extends TestBase {
	@Test
	public void FrameWindow() throws IOException, InterruptedException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("url"));
		//String browser = "Chrome";
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(prop.getProperty("browser"));
		 driver.manage().window().maximize();
	     driver.get(prop.getProperty("FrameHandlingurl"));
	     HandlingframeObjects hfobj = PageFactory.initElements(driver, HandlingframeObjects.class);
	     
	     driver.switchTo().frame("packageFrame");
	     try {
	     List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	     System.out.println(alllinks.size());
	     //*****************for each loop for handling Webelements********************
	     /*for(WebElement we : alllinks)
	     {
	    	 //System.out.println(we.getText());
	    	 if(we.getText().equalsIgnoreCase("Alert"))
	    	 {
	    		 PerformClick(hfobj.AlertLink);
	    	 }
	     }
	     driver.switchTo().defaultContent();*/
	     
	     //****************for loop for handling webelemnts***************
	     for(int i =0;i<= alllinks.size()-1;i++)
	     {
	    	 System.out.println(alllinks.get(i).getText());
	     }
	     }
	     catch(IndexOutOfBoundsException e) {
	    	 System.out.println("my index exception is "+e);
	     }
	     catch(Exception e) {
	    	 System.out.println(e);
	     }
	     finally {
	    	 System.out.println("finally block");
	     }
	     //PerformClick(hfobj.AlertLink);
	   
	     /*driver.switchTo().defaultContent();
	    
	     driver.switchTo().frame("classFrame");
	     PerformClick(hfobj.DeprecatedFieldslink);
	     driver.switchTo().defaultContent();
	     
	     driver.switchTo().frame("packageListFrame");
	     PerformClick(hfobj.Seleniumframelink);
	     driver.switchTo().defaultContent();*/

}
}
