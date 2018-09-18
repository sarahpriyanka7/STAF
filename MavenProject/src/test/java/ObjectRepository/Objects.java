package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Objects {
	@FindBy(name = "userName")
	public WebElement User_Name;
	
	@FindBy(name = "password")
	public WebElement Password;
	
	@FindBy(name = "login")
	public WebElement Login;
	
	@FindBy(linkText = "CONTACT")
	public WebElement Contacttab;

}
