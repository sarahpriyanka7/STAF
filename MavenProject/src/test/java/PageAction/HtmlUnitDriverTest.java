package PageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitDriverTest {
	
	@Test
	public void HTMLDriver()
	{
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.google.com/"); 
		System.out.println("Title of the page :" +driver.getTitle());
		
		driver.quit();
	}

}
