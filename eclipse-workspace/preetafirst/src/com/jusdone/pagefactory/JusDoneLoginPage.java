package com.jusdone.pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jusdone.utility.BaseTest;

public class JusDoneLoginPage extends BaseTest{

	
	JusDoneHomePage homepage;
	public JusDoneLoginPage(String browserType, String url, long pageLoadTimeOut, long implicitWait) {
		super(browserType, url, pageLoadTimeOut, implicitWait);
		
		//Initializing Page factory for jusdone page
		PageFactory.initElements(driver, this);
		
		//Create homepage object to call login page
		homepage = new JusDoneHomePage(browserType, url, pageLoadTimeOut, implicitWait);
		
		//Call login page
		homepage.clickLoginButton();
	}
	
	//Locating Login page element
	
	@FindBy(id="email")
	public WebElement userNameField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(xpath="html/body/div/div/div/div/form/div[3]/div/label")
	public WebElement rememberMeField;
	
	@FindBy(xpath="html/body/div[1]/div/div/div/form/div[4]/button")
	public WebElement submitLoginButton;
	
	@FindBy(xpath="html/body/div/div/div/div/form/a")
	public WebElement createAnAcctField;	
	
	@FindBy(xpath = ".//*[@id='sidebar']/ul/li[1]/a")
	public WebElement dashBoardOnAccountPage;

//verify the pagetitle
public String verifyLoginPageTitle(){
	return driver.getTitle();
}

//CHECK PAGE FIELDS

public boolean checkUserNameField() {
	return userNameField.isDisplayed();
}	
public boolean checkpasswordField() {
	return passwordField.isDisplayed();
}	
public boolean checkRememberMeField() {
	return rememberMeField.isDisplayed();
}	
public boolean checkSubmitLoginButton() {
	return submitLoginButton.isDisplayed();
}	
public boolean checkCreateAnAcctField() {
	return createAnAcctField.isDisplayed();	
}
public void diverBack() {
	driver.navigate().back();
}

//verify validlogin Functionality
public boolean checkValidLogin(String Username,String Password) {
	userNameField.sendKeys(Username);     
    passwordField.sendKeys(Password);
	submitLoginButton.click();
		return true;	
}

//for invalid login
public boolean checkInvalidLogin(String Username, String Password)
{
   userNameField.sendKeys(Username);     
    passwordField.sendKeys(Password);
	//submitLoginButton.click();
	return false;
}
}

