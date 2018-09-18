package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBObjects {
	@FindBy(name = "email")
	public WebElement User_Name;
	
	@FindBy(id = "pass")
	public WebElement Password;
	
	@FindBy(id="month")
	public WebElement dd_month;
	
	@FindBy(xpath = "//span[contains(text(),'Create an account')]")
	public WebElement namecheck;
}
