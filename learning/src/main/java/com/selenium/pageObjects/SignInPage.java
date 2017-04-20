package com.selenium.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

import com.selenium.utility.BaseClass;

public class SignInPage extends BaseClass {
	@FindBy(xpath = "//a[@href='#login']")
	 WebElement signIn;
	/*@FindBy(xpath="//*[@id='load_form']/div/div[2]/input")
	WebElement submit; */
	@FindBy(xpath="//*[@id='alert1']")
	WebElement msg;
	//private WebDriver driver;
	//WebDriver driver;
	//private WebDriver driver;
	@FindBy(xpath="//*[@name='username']")
	List<WebElement> uName;
	//WebElement uName;
	//@FindBy(xpath="")

	public SignInPage(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void  userSignIn() throws SikuliException, InterruptedException {
		signIn.click();
	/*	for (int i=0;i<uName.size();i++){
			int x=uName.get(i).getLocation().getX();
			if(x!=0){
				uName.get(i).click();
				uName.get(i).sendKeys("patel.dolly");
			}
		}*/
		
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
		//Thread.sleep(2000);
			
			
		}
		
	void verifyPhoneNumber(){
		
	}
		
		
	}

