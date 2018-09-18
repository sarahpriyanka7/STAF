package PageAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;
import ObjectRepository.FBObjects;

public class WaitMethods extends TestBase{

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
	     FBObjects fbob = PageFactory.initElements(driver, FBObjects.class);
	     WaitMethods obj = new WaitMethods();
	     obj.waituntil(fbob.User_Name);
	     settext(fbob.User_Name,prop.getProperty("username"));
	     settext(fbob.Password,prop.getProperty("password"));
	     obj.screenshot("prelogin");
	     selectDD(fbob.dd_month,"Apr","text");
	     Thread.sleep(2000);
	     obj.screenshot("selevt");
	     selectDD(fbob.dd_month,"5","value");
	     Thread.sleep(2000);
	     selectDD(fbob.dd_month,"6","index");
	     driver.quit();
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
	
