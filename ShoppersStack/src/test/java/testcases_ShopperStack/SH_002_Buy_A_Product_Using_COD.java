package testcases_ShopperStack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic.Base_Test;

import pomclasses.AccountSettingsPage;
import pomclasses.AddAddressPage;
import pomclasses.AddressPage;
import pomclasses.CartPage;
import pomclasses.HomePage;
import pomclasses.LoginPage;
import pomclasses.OrderConfirmationPage;
import pomclasses.PaymentMethod;
import pomclasses.WelcomePage;
import pomclasses.WomenPage;

public class SH_002_Buy_A_Product_Using_COD extends Base_Test {
	
	@Test
	public void buyAProductUsingCod() throws InterruptedException
	{
		WelcomePage welcome=new WelcomePage(driver);
		String message = welcome.welcomeMessageText();
		Assert.assertEquals(true, message.contains("Welcome"),"failed to navigate to welcomepage");
		Reporter.log("welcome page is displayed",true);
		
		welcome.clickLoginButton();
		
		LoginPage login=new LoginPage(driver);
		String loginMessage=login.loginMessageText();
		Assert.assertEquals(true, loginMessage.contains("Shopper Login"),"failed to navigate to loginpage");
		Reporter.log("loginPage is displayed",true);
		login.enterEmail("vijayganesan.in@gmail.com");
		login.enterPassword("Vijayganesan77@");
		login.clickLoginButton();
		
		HomePage home=new HomePage(driver);
		String helloMessage=home.helloMessageText();
		Assert.assertEquals(true, helloMessage.contains("Hello, "),"failed to navigate to homepage");
		Reporter.log("logged in successfully",true);
		
		home.moveOnWomenLink();
		WomenPage women=new WomenPage(driver);
		women.clickWomenTshirtLink();
		Thread.sleep(3000);
		Actions action=new Actions(driver);
//		WebElement facebookLink=driver.findElement(By.xpath("//a[text()='facebook']"));
//		action.moveToElement(facebookLink);
		women.clickAddToCartButton();
		Thread.sleep(3000);
		home.clickCartIcon();
		
		CartPage  cart=new CartPage(driver);
		cart.clickBuyNowButton();
		
		AddAddressPage address=new AddAddressPage(driver);
		address.clickOfficeRadioButton();
		address.enterName("vijay");
		address.enterHouseOfficeInfo("indiqube southmile");
		address.enterStreetInfo("jayanagar");
		address.enterLandmark("indiqube");
		address.selectCountry();
		address.selectState();
		address.selectcity();
		address.enterPincode("560010");
		address.enterPhoneNumber("9787071322");
		address.clickAddAddressButton();
		
		AddressPage adpage=new AddressPage(driver);
		adpage.clickChooseAddressRadiobutton();
		adpage.clickProceedButton();
		
		PaymentMethod payment=new PaymentMethod(driver);
		payment.clickCodRadioButton();
		payment.clickProceedButton();
		
		OrderConfirmationPage confirm=new OrderConfirmationPage(driver);
		String thankyouMessage=confirm.ThankyouMessageText();
		Assert.assertEquals(true, thankyouMessage.contains("Thank you"),"failed to buy a product");
		Reporter.log("Order successfully placed",true);
		
		AccountSettingsPage acc=new AccountSettingsPage(driver);
		acc.clickLogoutBotton();
		Assert.assertEquals(true, message.contains("Welcome"),"failed to navigate to welcomepage");
		Reporter.log("logged out successfully",true);
	}

}
