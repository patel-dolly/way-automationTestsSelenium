package com.selenium.learning;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.selenium.pageObjects.SignInPage;
import com.selenium.utility.BaseClass;
@Listeners(com.selenium.utility.TestListners.class)

public class TescCasesTest extends BaseClass  {

	//WebDriver driver;
	/*@Test(enabled = false)
	void registration() {
		RegistrationPage register = new RegistrationPage(driver);

		register.registerUser();
		// System.out.println("Print elementvalue")+register.;

	}*/

	@Test
	void registeredUserLogin() throws SikuliException {
		//SignInPage.userSignIn();
		SignInPage sign=new SignInPage(driver);
		sign.userSignIn();
	}

}