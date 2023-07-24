package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BasePage {
	
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='address']")
	private WebElement chooseAddressRadiobutton;

	public WebElement getChooseAddressRadiobutton() {
		return chooseAddressRadiobutton;
	}

	public void setChooseAddressRadiobutton(WebElement chooseAddressRadiobutton) {
		this.chooseAddressRadiobutton = chooseAddressRadiobutton;
	}
	public void clickChooseAddressRadiobutton()
	{
		chooseAddressRadiobutton.click();
	}
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedButton;

	public WebElement getProceedButton() {
		return proceedButton;
	}

	public void setProceedButton(WebElement proceedButton) {
		this.proceedButton = proceedButton;
	}
	public void clickProceedButton()
	{
		proceedButton.click();
	}
}
