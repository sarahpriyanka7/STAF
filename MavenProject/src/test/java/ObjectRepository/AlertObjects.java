package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertObjects {
		
		@FindBy(name = "cusid")
		public WebElement User_Name;
		
		@FindBy(name = "submit")
		public WebElement submit_button;
		
		@FindBy(linkText = "Click Here")
		public WebElement clickhere;
		
		@FindBy(name = "emailid")
		public WebElement Email;
		
		@FindBy(name = "btnLogin")
		public WebElement Submit;
	
}
