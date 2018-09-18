package PageAction;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;
import ObjectRepository.Objects;

public class log4j_demo extends TestBase {

	@Test
	public void Log4j() throws IOException
	{
		BasicConfigurator.configure();
		Logger log = LogManager.getLogger(log4j_demo.class.getName());
		/*log.debug("Debug Message");
		log.info("info message");
		log.error("error message");
		log.fatal("fatal message");
		log.warn("warn message");*/
		
		String browser = "Chrome";
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(browser);
		log.info("chrome driver getting initialised");
		 driver.manage().window().maximize();
		 log.info("browser window  is maximised");
		 log.debug("Now hitting Amazon server");
		 driver.get("https://www.amazon.com/");
		 log.info("Landed on amazon home page");
		 
		 log.debug("Getting the frames count");
		 System.out.println(driver.findElements(By.tagName("iframe")).size());
		 log.info("Frames count retreived");
		 try
		 {
		 driver.switchTo().frame(0);
		 log.info("Successfully switched to frame");
		 }
		 catch(Exception e)
		 {
		 log.error("Cannot identify the frame");
		 }
	
	}
	

}
