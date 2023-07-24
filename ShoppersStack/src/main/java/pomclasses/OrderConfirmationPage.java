package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BasePage {
	
	public OrderConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h2[text()='Thank you for your order ']")
	private WebElement thankYouMessage;
	public WebElement getThankYouMessage() {
		return thankYouMessage;
	}
	public void setThankYouMessage(WebElement thankYouMessage) {
		this.thankYouMessage = thankYouMessage;
	}
	public String ThankyouMessageText()
	{
		return thankYouMessage.getText();
	}

}
