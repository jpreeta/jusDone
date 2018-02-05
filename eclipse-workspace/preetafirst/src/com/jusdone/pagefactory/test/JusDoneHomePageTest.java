package com.jusdone.pagefactory.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jusdone.pagefactory.JusDoneHomePage;

public class JusDoneHomePageTest{
	JusDoneHomePage homePage;
	
@BeforeClass
public void setUp () {
	homePage = new JusDoneHomePage("Chrome", "http://jusdone.atomic77.in/", 10, 10);
}
@Test(priority=1)
public void homePageTest() {
	String homePageTest = homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTest,"jusDone","Mismatched Title "+homePageTest);
}

@Test(priority=2)
public void jusDoneLogoTest() {
	Assert.assertTrue(homePage.checkJusDoneButton());
}
 
@Test(priority=3)
public void signUpLogoTest() {
	Assert.assertTrue(homePage.checkSignUpButton());
}

@Test(priority=4)
public void loginLogoTest() {
	Assert.assertTrue(homePage.checkLoginButton());
}

@Test(priority=5)
public void contactUsLogoTest() {
	Assert.assertTrue(homePage.checkContactUsButton());
}

@Test(priority=6)
public void aboutUsLogoTest() {
	Assert.assertTrue(homePage.checkAboutUsButton());
}

@Test(priority=7)
public void clickSignUpButtonTest() {
	Assert.assertTrue(homePage.clickSignUpButton());
}
}

