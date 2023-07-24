package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingsPage extends BasePage {
	//public WebDriver driver;
	public AccountSettingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//li[@role='menuitem'])[7]")
	private WebElement logoutButton;
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public void setLogoutButton(WebElement logoutButton) {
		this.logoutButton = logoutButton;
	}
	public void clickLogoutBotton()
	{
		logoutButton.click();
	}

}
