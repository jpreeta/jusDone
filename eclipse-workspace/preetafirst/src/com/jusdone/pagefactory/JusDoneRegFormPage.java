package com.jusdone.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jusdone.utility.BaseTest;

public class JusDoneRegFormPage extends BaseTest {
	
	// Initialize driver and base classes
		public JusDoneRegFormPage(String browserType, String url, long pageLoadTimeOut, long implicitWait) {
			super(browserType, url, pageLoadTimeOut, implicitWait);
			
		//Initializing Page factory for jusdone page	
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "html/body/div[1]/div/div/div")
		public WebElement registerPageContainer;

		@FindBy(xpath=".//*[@id='name']")
		public WebElement nameField;

		@FindBy(xpath = ".//*[@id='email']")
		public WebElement emailField;

		@FindBy(xpath = ".//*[@id='password']")
		public WebElement passwordField;

		@FindBy(xpath = ".//*[@id='password-confirm']")
		public WebElement passwordConfirmField;

		@FindBy(xpath = "html/body/div[1]/div/div/div/form/div[5]/button")
		public WebElement registerButton;
		
		@FindBy(xpath = ".//*[@id='sidebar']/ul/li[1]/a")
		public WebElement dashBoardOnAccountPage;
		
		// Initializing the Page Objects:
		public boolean verifyJusDoneRegFromPage(){
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", registerPageContainer);
			return registerPageContainer.isDisplayed();
		}
		
		public void createNewValidAcct(String Name, String Email, String Password, String ConfirmPassword) {
			
		//JavascriptExecutor jsN = (JavascriptExecutor) driver;
		//jsN.executeScript("argument[0].sendKeys;", nameField);
           nameField.sendKeys(Name);
           nameField.sendKeys(Keys.ENTER);
         
//            JavascriptExecutor jsE = (JavascriptExecutor) driver;
//			jsE.executeScript("argument[0].click();", emailField);
			emailField.sendKeys(Email);
			emailField.sendKeys(Keys.ENTER);
            
//            JavascriptExecutor jsP = (JavascriptExecutor) driver;
//			jsP.executeScript("argument[0].click();", passwordField);
			passwordField.sendKeys(Password);
			passwordField.sendKeys(Keys.ENTER);
            
//            JavascriptExecutor jsPC = (JavascriptExecutor) driver;
//			jsPC.executeScript("argument[0].click();", passwordConfirmField);
			passwordConfirmField.sendKeys(ConfirmPassword);
			passwordConfirmField.sendKeys(Keys.ENTER);
		}
		
		   public boolean clickRegisterButton() {			
			registerButton.click();
			return dashBoardOnAccountPage.isDisplayed();
}
}
