package PageAction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.TestBase;
import ObjectRepository.AlertObjects;
import ObjectRepository.FBObjects;

public class Alertclass extends TestBase {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("url"));
		//String browser = "Chrome";
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(prop.getProperty("browser"));
		 driver.manage().window().maximize();
	     driver.get(prop.getProperty("alerturl"));
	     AlertObjects altob = PageFactory.initElements(driver, AlertObjects.class);
	     settext(altob.User_Name,"52309");
	     PerformClick(altob.submit_button);
	     Alert alt = driver.switchTo().alert();
	     System.out.println(alt.getText());
	     alt.accept();
	     Thread.sleep(3000);
	     alt.accept();
	    // alt.dismiss();
	}

}
