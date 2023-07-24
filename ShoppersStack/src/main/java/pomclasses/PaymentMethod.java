package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethod extends BasePage {
	
	public PaymentMethod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='COD']")
	private WebElement codRadioButton;

	public WebElement getCodRadioButton() {
		return codRadioButton;
	}

	public void setCodRadioButton(WebElement codRadioButton) {
		this.codRadioButton = codRadioButton;
	}
	public void clickCodRadioButton()
	{
		codRadioButton.click();
	}
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedButton;

	public WebElement getProceedButton() {
		return proceedButton;
	}

	public void setProceedButton(WebElement proceedButton) {
		this.proceedButton = proceedButton;
	}
	public void clickProceedButton() {
		proceedButton.click();
	}
	

}
