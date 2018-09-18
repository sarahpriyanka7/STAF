package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandlingframeObjects {
	
	@FindBy(linkText = "Deprecated Fields")
	public WebElement DeprecatedFieldslink;
	
	@FindBy(linkText = "org.openqa.selenium")
	public WebElement Seleniumframelink;
	
	@FindBy(xpath = "//span[contains(text() ,\"Alert\")]")
	public WebElement AlertLink;
}
