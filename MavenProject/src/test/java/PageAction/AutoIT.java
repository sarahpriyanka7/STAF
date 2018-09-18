package PageAction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;
import ObjectRepository.AutoITObjects;
import ObjectRepository.FBObjects;

public class AutoIT extends TestBase {

	@Test
	public void FileUpload() throws IOException, InterruptedException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("H:\\Users\\user\\eclipse-workspace\\MavenProject\\src\\main\\java\\GenericLibrary\\config.properties");
		prop.load(fis);
	
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(prop.getProperty("browser"));
		driver.manage().window().maximize();
	    driver.get(prop.getProperty("AutoITurl"));
	    AutoITObjects Autoobj = PageFactory.initElements(driver, AutoITObjects.class);
	    
	    /*settext(Autoobj.q1_name,"Sarah");
	    settext(Autoobj.q2_email,"sarah@gmail.com");
	    settext(Autoobj.q3_articleTopic,"selenium");*/
	    
	    //javascriptperformclick(Autoobj.browsebtn);
	    driver.findElement(By.id("file-upload")).click();
	 
	    Thread.sleep(3000);
	    Runtime.getRuntime().exec("H:\\Selinium\\Autoit.exe");
	    Thread.sleep(3000);
	    driver.findElement(By.id("file-submit")).click();
	    
	    String checkingtext = "File Uploaded!";
	    WebElement text = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
	    if(text.getText().equalsIgnoreCase(checkingtext))
	    {
	    	System.out.println("File is Uploaded successfully");
	    }
	 
}
	
	
}
