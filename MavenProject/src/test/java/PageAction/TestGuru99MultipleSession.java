package PageAction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.TestBase;
import ObjectRepository.Objects;

public class TestGuru99MultipleSession extends TestBase {

	@Test    
    public void executSessionOne() throws IOException{
            //First session of WebDriver
		String browser = "Chrome";
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(browser);
		 driver.manage().window().maximize();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            
        }
        
    @Test    
        public void executeSessionTwo() throws IOException{
            //Second session of WebDriver
    	String browser = "Chrome";
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(browser);
		 driver.manage().window().maximize();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        
        }
        
    @Test    
        public void executSessionThree() throws IOException{
            //Third session of WebDriver
    	String browser = "Chrome";
		TestBase tb = new TestBase();
		driver = tb.Initialisedriver(browser);
		 driver.manage().window().maximize();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        
        }        
}
