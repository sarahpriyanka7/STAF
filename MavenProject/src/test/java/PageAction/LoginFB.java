package PageAction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;
import GenericLibrary.Xls_Reader;
import ObjectRepository.FBObjects;

public class LoginFB extends TestBase{

	@Test
	public void login() throws IOException, InterruptedException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("url"));
		//String browser = "Chrome";
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(prop.getProperty("browser"));
		 driver.manage().window().maximize();
	     driver.get(prop.getProperty("url"));
	     
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
	     /*FBObjects fbob = PageFactory.initElements(driver, FBObjects.class);
	     Xls_Reader xl = new Xls_Reader("H:\\Users\\user\\eclipse-workspace\\MavenProject\\testdata.xlsx");
	     //settext(fbob.User_Name,xl.getCellData("Sheet1","Username", 1));
	     javascriptsettext(fbob.User_Name,xl.getCellData("Sheet1","Username", 1));
	     WebElement x = fbob.namecheck;
	     System.out.println(x.getText());
	     xl.setCellData("Sheet1", "Result", 1, x.getText());
	     //settext(fbob.User_Name,prop.getProperty("username"));
	     //settext(fbob.Password,prop.getProperty("password"));
	     selectDD(fbob.dd_month,"Apr","text");
	     Thread.sleep(2000);
	     selectDD(fbob.dd_month,"5","value");
	     Thread.sleep(2000);
	     selectDD(fbob.dd_month,"6","index");
*/	     driver.quit();
	     
	}

}
