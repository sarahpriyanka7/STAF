package PageAction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;

public class CookiesTest extends TestBase {
	@Test
	public void FBCookies() throws IOException, InterruptedException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
		prop.load(fis);
		
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(prop.getProperty("browser"));
		 driver.manage().window().maximize();
	     driver.get(prop.getProperty("url"));
	     //***********************Finding all the cookies and getting there details*******************
	     
	     Set<Cookie> allcookies = driver.manage().getCookies();
	     System.out.println("count of cookies:" + allcookies.size());
	     for(Cookie cookie : allcookies)
	     {
	    	 System.out.println("Name of the cookie:"+cookie.getName());
	    	 System.out.println("Doamain of the cookie:"+cookie.getDomain());
	    	 System.out.println("Path of the cookie:"+cookie.getPath());
	    	 System.out.println("Value of the Cookie:"+cookie.getValue());
	    	 System.out.println("_______________________________");
	    	
	     }
	     driver.manage().deleteAllCookies();
	     Set<Cookie> afterdeletecookies = driver.manage().getCookies();
	     System.out.println("COUNT OF COOKIES : "+afterdeletecookies.size());
	     driver.quit();

	}
}
