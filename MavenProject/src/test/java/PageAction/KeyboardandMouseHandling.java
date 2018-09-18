package PageAction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.TestBase;
import ObjectRepository.FBObjects;

public class KeyboardandMouseHandling extends TestBase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
		prop.load(fis);
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(prop.getProperty("browser"));
		 driver.manage().window().maximize();
	     driver.get(prop.getProperty("url"));
	     FBObjects fbob = PageFactory.initElements(driver, FBObjects.class);
	     Actions builder = new Actions(driver);
	     Action seriesofactions = builder
	    		 .moveToElement(fbob.User_Name)
	    		 .click()
	    		 .keyDown(fbob.User_Name, Keys.SHIFT)
	    		 .sendKeys(fbob.User_Name, "hello")
	    		 .keyUp(fbob.User_Name, Keys.SHIFT)
	    		 .doubleClick(fbob.User_Name)
	    		 .contextClick()
	    		 .build();
	     seriesofactions.perform();
	     
	}

}
