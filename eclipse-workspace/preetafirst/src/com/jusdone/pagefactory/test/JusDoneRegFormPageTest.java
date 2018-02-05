package com.jusdone.pagefactory.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jusdone.pagefactory.JusDoneRegFormPage;

public class JusDoneRegFormPageTest{
	JusDoneRegFormPage registerPage;
	
@BeforeClass
public void setUp () {
	registerPage = new JusDoneRegFormPage("Chrome", "http://jusdone.atomic77.in/register", 10, 10);
}
@Test(priority=1)
public void verifyJusDoneRegFromPageTest() {
	Assert.assertTrue(registerPage.verifyJusDoneRegFromPage());	
}

@Test(priority=2)
public void  createNewValidAcctTest() {
	registerPage.createNewValidAcct("xyz", "xyz@gmail.com", "123456", "123456");	
}

@Test(priority=3)
public void  clickRegisterButtonTest() {
	Assert.assertTrue(registerPage.clickRegisterButton());
	}


}