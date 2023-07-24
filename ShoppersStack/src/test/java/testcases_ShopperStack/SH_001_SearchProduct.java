package testcases_ShopperStack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic.Base_Test;


import pomclasses.AccountSettingsPage;
import pomclasses.HomePage;
import pomclasses.LoginPage;
import pomclasses.WelcomePage;

public class SH_001_SearchProduct extends Base_Test {
	
	@Test
	public void searchProduct()
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
		home.enterValueInSearchTextfield("Tshirts");
		home.clickSearchButton();
		home.clickaccountSettingsButton();
		
		AccountSettingsPage acc=new AccountSettingsPage(driver);
		acc.clickLogoutBotton();
		Assert.assertEquals(true, message.contains("Welcome"),"failed to navigate to welcomepage");
		Reporter.log("logged out successfully",true);
		
	}

}
