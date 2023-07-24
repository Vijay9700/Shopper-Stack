package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends BasePage {
	
	//public WebDriver driver;
	public WomenPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Tshirts'])[1]")
	private WebElement womenTshirtLink;
	public WebElement getWomenTshirtLink() {
		return womenTshirtLink;
	}

	public void setWomenTshirtLink(WebElement womenTshirtLink) {
		this.womenTshirtLink = womenTshirtLink;
	}
	public void clickWomenTshirtLink()
	{
		womenTshirtLink.click();
	}
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement addToCartButton;
	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}
	public void clickAddToCartButton()
	{
		addToCartButton.click();
	}

}
