package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAddressPage extends BasePage {
	
	//public WebDriver driver;
	public AddAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Home")
	private WebElement homeRadioButton;
	public WebElement getHomeRadioButton() {
		return homeRadioButton;
	}

	public void setHomeRadioButton(WebElement homeRadioButton) {
		this.homeRadioButton = homeRadioButton;
	}
	public void clickHomeRadioButton()
	{
		homeRadioButton.click();
	}
	
	@FindBy(id="Office")
	private WebElement officeRadioButton;
	public WebElement getOfficeRadioButton() {
		return officeRadioButton;
	}

	public void setOfficeRadioButton(WebElement officeRadioButton) {
		this.officeRadioButton = officeRadioButton;
	}
	public void clickOfficeRadioButton()
	{
		officeRadioButton.click();
	}
	
	@FindBy(id="Other")
	private WebElement othersRadioButton;
	public WebElement getOthersRadioButton() {
		return othersRadioButton;
	}

	public void setOthersRadioButton(WebElement othersRadioButton) {
		this.othersRadioButton = othersRadioButton;
	}
	public void clickOthersRadioButton()
	{
		othersRadioButton.click();
	}
	
	@FindBy(id="Name")
	private WebElement nameTextField;
	public WebElement getNameTextField() {
		return nameTextField;
	}

	public void setNameTextField(WebElement nameTextField) {
		this.nameTextField = nameTextField;
	}
	public void enterName(String name)
	{
		nameTextField.sendKeys(name);
	}
	
	@FindBy(id="House/Office Info")
	private WebElement houseOfficeInfoTextfield;
	public WebElement getHouseOfficeInfoTextfield() {
		return houseOfficeInfoTextfield;
	}

	public void setHouseOfficeInfoTextfield(WebElement houseOfficeInfoTextfield) {
		this.houseOfficeInfoTextfield = houseOfficeInfoTextfield;
	}
	public void enterHouseOfficeInfo(String houseOfficeInfo)
	{
		houseOfficeInfoTextfield.sendKeys(houseOfficeInfo);
	}
	
	@FindBy(id="Street Info")
	private WebElement streetInfoTextfield;
	public WebElement getStreetInfoTextfield() {
		return streetInfoTextfield;
	}

	public void setStreetInfoTextfield(WebElement streetInfoTextfield) {
		this.streetInfoTextfield = streetInfoTextfield;
	}
	public void enterStreetInfo(String streetInfo)
	{
		streetInfoTextfield.sendKeys(streetInfo);
	}
	
	@FindBy(id="Pincode")
	private WebElement pincodeTextField;
	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public void setPincodeTextField(WebElement pincodeTextField) {
		this.pincodeTextField = pincodeTextField;
	}
	public void enterPincode(String pincode)
	{
		pincodeTextField.sendKeys(pincode);
	}
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTextfield;
	public WebElement getPhoneNumberTextfield() {
		return phoneNumberTextfield;
	}

	public void setPhoneNumberTextfield(WebElement phoneNumberTextfield) {
		this.phoneNumberTextfield = phoneNumberTextfield;
	}
	public void enterPhoneNumber(String phoneNumber)
	{
		phoneNumberTextfield.sendKeys(phoneNumber);
	}
	
	@FindBy(id="addAddress")
	private WebElement addAddressButton;
	public WebElement getAddAddressButton() {
		return addAddressButton;
	}

	public void setAddAddressButton(WebElement addAddressButton) {
		this.addAddressButton = addAddressButton;
	}
	public void clickAddAddressButton()
	{
		addAddressButton.click();
	}
	
	@FindBy(id = "Landmark")
	private WebElement landmarkTextfield;
	public WebElement getLandmarkTextfield() {
		return landmarkTextfield;
	}

	public void setLandmarkTextfield(WebElement landmarkTextfield) {
		this.landmarkTextfield = landmarkTextfield;
	}
	public void enterLandmark(String landmark)
	{
		landmarkTextfield.sendKeys(landmark);
	}
	
	@FindBy(id="Country")
	private WebElement countryDropdown;
	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public void setCountryDropdown(WebElement countryDropdown) {
		this.countryDropdown = countryDropdown;
	}
	Select sel=new Select(countryDropdown);
	public void selectCountry()
	{
		sel.selectByIndex(1);
	}
	
	@FindBy(id = "State")
	WebElement stateDropdowwn;
	Select sel1=new Select(stateDropdowwn);
	public void selectState()
	{
		sel1.selectByVisibleText("Karnataka");
	}
	
	@FindBy(id = "City")
	WebElement cityDropdowwn;
	Select sel2=new Select(cityDropdowwn);
	public void selectcity()
	{
		sel1.selectByVisibleText("Bengaluru");
	}
}
