package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[text()='Buy Now'])")
	private WebElement buyNowButton;

	public WebElement getBuyNowButton() {
		return buyNowButton;
	}

	public void setBuyNowButton(WebElement buyNowButton) {
		this.buyNowButton = buyNowButton;
	}
	public void clickBuyNowButton()
	{
		buyNowButton.click();
	}

}
