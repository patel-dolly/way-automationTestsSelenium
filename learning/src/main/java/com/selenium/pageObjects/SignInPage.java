package com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
@FindBy(xpath="//a[@href='#login']")
WebElement signIn;
//@FindBy(xpath="//*[@id='login'])/fieldset[1]/input")
WebElement uName ;
@FindBy(xpath="//*[@id='load_form']/fieldset[1]/input")
WebDriver driver;
public SignInPage(WebDriver driver) {
	driver=this.driver;
	PageFactory.initElements(driver, this);
	
	
}

public void userSignIn(){
	signIn.click();
	
	

}}

