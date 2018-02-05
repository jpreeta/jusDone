package com.jusdone.pagefactory.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jusdone.pagefactory.JusDoneLoginPage;
import com.jusdone.pagefactory.JusDoneRegFormPage;

public class JusDoneLoginPageTest {
	JusDoneLoginPage loginPage;
	private Object driver;
  
  @BeforeClass
 public void setUp () {
	  loginPage = new JusDoneLoginPage("Chrome", "http://jusdone.atomic77.in", 10, 10);
	  System.out.println("beforeclass");
  }

  @AfterClass
  public void afterClass() {
	 System.out.println("afterclass");
  }
  @Test(priority=1)
  public void verifyLoginPageTitleTest() {
	  String loginPageTitle = loginPage.verifyLoginPageTitle();
		Assert.assertEquals(loginPageTitle,"Laravel","Mismatched Title "+loginPageTitle);
		System.out.println("passed");
  }  
  @Test(priority=2)
  public void checkUserNameFieldTest() {
	 		Assert.assertTrue(loginPage.checkUserNameField());
  }
  @Test(priority=3)
  public void checkpasswordFieldTest() {	  
		Assert.assertTrue(loginPage.checkpasswordField());
  }
  @Test(priority=4)
  public void checkRememberMeFieldTest() {
		Assert.assertTrue(loginPage.checkRememberMeField());
  }
  @Test(priority=5)
  public void checkSubmitLoginButtonTest() {
		Assert.assertTrue(loginPage.checkSubmitLoginButton());
  }  
  @Test(priority=6)
  public void checkCreateAnAcctFieldTest() {
		Assert.assertTrue(loginPage.checkCreateAnAcctField());
  }  
  @Test(priority=7)
  public void checkInValidLoginTest() throws InterruptedException {
	  boolean loginPassed = loginPage.checkInvalidLogin("123@gmail.com", "123");
		Assert.assertFalse(loginPassed);
		Thread.sleep(10000);
  }
  @Test(priority=8)
  public void diverBack()  {
	  
  }
  @Test(priority=9)
  public void checkValidLoginTest() {	 
	  boolean loginPassed = loginPage.checkValidLogin("xyz@gmail.com", "123456");
		Assert.assertTrue(loginPassed);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }

}
