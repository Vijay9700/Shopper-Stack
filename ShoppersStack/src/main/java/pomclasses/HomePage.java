package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	//public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id="search")
	private WebElement searchTextfield;
	
	public WebElement getSearchTextfield() {
		return searchTextfield;
	}

	public void setSearchTextfield(WebElement searchTextfield) {
		this.searchTextfield = searchTextfield;
	}
	public void enterValueInSearchTextfield(String valueInSearchTextfield)
	{
		searchTextfield.sendKeys(valueInSearchTextfield);
	}
	
	@FindBy(id="searchBtn")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountSettingsButton;
	public WebElement getAccountSettingsButton() {
		return accountSettingsButton;
	}

	public void setAccountSettingsButton(WebElement accountSettingsButton) {
		this.accountSettingsButton = accountSettingsButton;
	}
	public void clickaccountSettingsButton()
	{
		accountSettingsButton.click();
	}
	
	@FindBy(xpath = "//a[text()='Help Center']")
	private WebElement helpCenterLink;
	
	public WebElement getHelpCenterLink() {
		return helpCenterLink;
	}

	public void setHelpCenterLink(WebElement helpCenter) {
		this.helpCenterLink = helpCenter;
	}
	public void clickHelpCenterLink()
	{
		helpCenterLink.click();
	}
	
	@FindBy(xpath = "(//a[text()='Women'])[1]")
	private WebElement womenLink;
	public WebElement getWomenLink() {
		return womenLink;
	}

	public void setWomenLink(WebElement womenLink) {
		this.womenLink = womenLink;
	}
	public void moveOnWomenLink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(womenLink);
	}
	
	@FindBy(xpath = "//h3[text()='Hello, '] ")
	private WebElement helloMessage;

	public WebElement getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(WebElement helloMessage) {
		this.helloMessage = helloMessage;
	}
	public String helloMessageText()
	{
		return helloMessage.getText();
	}
	
	@FindBy(xpath = "//*[name()='svg' and @id='cartIcon']")
	private WebElement cartIcon;

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public void setCartIcon(WebElement cartIcon) {
		this.cartIcon = cartIcon;
	}
	public void clickCartIcon()
	{
		cartIcon.click();
	}
	
}
