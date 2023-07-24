package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCardPage extends BasePage {
	
	//public WebDriver driver;
	public CreditCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(id="WebDriver driver")
	

}
