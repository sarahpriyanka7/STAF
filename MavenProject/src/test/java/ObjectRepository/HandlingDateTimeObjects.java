package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandlingDateTimeObjects {
	
	@FindBy(xpath = "//input[@name = 'bdaytime']")
	public WebElement Bdaytime;
	
	@FindBy(xpath = "//*[@id='example']/div/span/span/span[2]/span[1]/span")
	public WebElement SelectCalender;
	
	@FindBy(xpath = "//*[@id='flightSearchContainer']/div[4]/button")
	public WebElement SelectCalender1;
	
	
			

}
