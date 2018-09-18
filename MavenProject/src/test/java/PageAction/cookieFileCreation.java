package PageAction;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;
import ObjectRepository.CookieObjects;

public class cookieFileCreation extends TestBase{
	
	public static void main(String args[]) throws IOException
	{

			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
			prop.load(fis);
			
			TestBase tb = new TestBase();
			driver = tb.Initialisedriver(prop.getProperty("browser"));
		    driver.manage().window().maximize();
		    driver.get(prop.getProperty("cookieurl"));
		    CookieObjects obj = PageFactory.initElements(driver, CookieObjects.class);
		    settext(obj.username,"abc123");
		    settext(obj.password,"123xyz");
		    PerformClick(obj.submitbtn);
		    
		 // create file named Cookies to store Login Information		
	        File file = new File("Cookies.data");							
	        try		
	        {	  
	            // Delete old file if exists
				file.delete();		
	            file.createNewFile();			
	            FileWriter fileWrite = new FileWriter(file);							
	            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
	            // loop for getting the cookie information 		
	            	
	            // loop for getting the cookie information 		
	            for(Cookie ck : driver.manage().getCookies())							
	            {			
	                Bwrite.write(("Name:"+ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
	                Bwrite.newLine();             
	            }			
	            Bwrite.close();			
	            fileWrite.close();	
	            
	        }
	        catch(Exception ex)					
	        {		
	            ex.printStackTrace();			
	        }		
		     
	        
		}
	}
