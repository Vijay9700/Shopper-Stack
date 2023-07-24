package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage {
	//public WebDriver driver;
	
	public WelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="loginBtn")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	@FindBy(xpath = "//h3[text()='Welcome to ShoppersStack. Enjoy shopping with us.']")
	private WebElement welcomeMessage;

	public WebElement getWelcomeMessage() {
		return welcomeMessage;
	}
	public void setWelcomeMessage(WebElement welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	public String welcomeMessageText()
	{
		return welcomeMessage.getText();
	}

}
