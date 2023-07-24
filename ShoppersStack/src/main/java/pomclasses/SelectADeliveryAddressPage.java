package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectADeliveryAddressPage extends BasePage {
	
	//public WebDriver driver;
	public SelectADeliveryAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='address']")
	private WebElement addressRadioButton;
	public WebElement getAddressRadioButton() {
		return addressRadioButton;
	}

	public void setAddressRadioButton(WebElement addressRadioButton) {
		this.addressRadioButton = addressRadioButton;
	}
	public void clickAddressRadioButton()
	{
		addressRadioButton.click();
	}

}
