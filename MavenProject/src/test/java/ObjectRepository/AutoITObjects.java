package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoITObjects {

	@FindBy(id = "input_1")
	public  WebElement q1_name;
	
	@FindBy(id = "input_2")
	public WebElement q2_email;
	
	@FindBy(id = "input_3")
	public WebElement q3_articleTopic;
	
	@FindBy(xpath = "//div[@class = \"qq-upload-button\"]")
	public WebElement browsebtn;
}
