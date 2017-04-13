package com.selenium.learning;

import org.testng.annotations.Test;

import com.selenium.pageObjects.RegistrationPage;
import com.selenium.utility.BaseClass;

public class TescCasesTest extends BaseClass {



	

	@Test
	void registration() {
		 RegistrationPage register = new RegistrationPage(driver);

		register.registerUser();
		// System.out.println("Print elementvalue")+register.;

	}

}