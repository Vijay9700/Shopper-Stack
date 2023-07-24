package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage extends BasePage{
	
	//public WebDriver driver;
	public HelpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="WebDriver driver")
	private WebElement creditCardLink;
	public WebElement getCreditCardLink() {
		return creditCardLink;
	}

	public void setCreditCardLink(WebElement creditCardLink) {
		this.creditCardLink = creditCardLink;
	}
	public void clickCreditCardLink()
	{
		creditCardLink.click();
	}

}
