package com.jusdone.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jusdone.utility.BaseTest;

public class JusDoneHomePage extends BaseTest {

	public JusDoneHomePage(String browserType, String url, long pageLoadTimeOut, long implicitWait) {
		super(browserType, url, pageLoadTimeOut, implicitWait);
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath ="/html/body/div[1]/div/button" )
	public WebElement jusDoneButton;
	
	@FindBy(xpath = "/html/body/div/div/ul/li[2]/label") 
	public WebElement signUpButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/ul/li[1]/label")
	public WebElement loginButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/ul/li[4]/label")
	public WebElement aboutUsButton;
	
	@FindBy(xpath ="/html/body/div[1]/div/ul/li[3]/label")
	public WebElement contactUsButton;
	
	@FindBy(xpath = "html/body/div[1]/div/div/div")	
	public WebElement registerPageContainer;
	
	//verify the pagetitle
	public String verifyHomePageTitle(){
		return driver.getTitle();
}
	public boolean checkJusDoneButton() {
		return jusDoneButton.isDisplayed();
	}
	
	public boolean checkLoginButton() {
		return loginButton.isDisplayed();
	}
	
	public boolean checkSignUpButton() {
		return signUpButton.isDisplayed();
	}
	
	public boolean checkContactUsButton() {
		return contactUsButton.isDisplayed();
	}
	
	public boolean checkAboutUsButton() {
		return aboutUsButton.isDisplayed();
	}
	
	public boolean clickSignUpButton() {
		signUpButton.click();
		return registerPageContainer.isDisplayed();
	}
	public boolean clickLoginButton() {
		loginButton.click();
		return true;
	}
}	
