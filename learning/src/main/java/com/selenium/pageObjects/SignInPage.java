package com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.Assert;

public class SignInPage {
	@FindBy(xpath = "//a[@href='#login']")
	WebElement signIn;
	/*@FindBy(xpath="//*[@id='load_form']/div/div[2]/input")
	WebElement submit; */
	@FindBy(xpath="//*[@id='alert1']")
	WebElement msg;
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void userSignIn() throws SikuliException {
		signIn.click();
		Screen s=new Screen();
		Pattern uNmae= new Pattern("D:\\Selenium webDriver 3.0\\SikuliImages\\us1.png");
		Pattern pwd = new Pattern("D:\\Selenium webDriver 3.0\\SikuliImages\\pass1.png");
		Pattern buttonSignUp= new Pattern("D:\\Selenium webDriver 3.0\\SikuliImages\\signUp.png");
		s.click(uNmae);
		s.type(uNmae, "patel.dolly");
		s.click(pwd);
		s.type(pwd, "monusonu05");	
		s.click(buttonSignUp);
		//Assert.assertEquals(expectedMsg, msg.getText());
			
			
		}
		
	void verifyPhoneNumber(){
		
	}
		
		
	}

