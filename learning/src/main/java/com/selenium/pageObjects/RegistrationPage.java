package com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;
	@FindBy(name = "name")
	private WebElement name;
	@FindBy(name = "phone")
	WebElement phone;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "country")
	WebElement country;
	@FindBy(name = "city")
	WebElement city;
	@FindBy(xpath = "//*[@id='load_form']/fieldset[6]/input")
	WebElement uName;

	@FindBy(xpath="//*[@id='load_form']/fieldset[7]/input")
	WebElement password;
	@FindBy(xpath="//*[@id='load_form']/div/div[2]/input")
	WebElement submit;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		System.out.println("Intialized");

	}

	public void registerUser() {

		name.sendKeys("Dolly");
		phone.sendKeys("898989898");
		email.sendKeys("patel.dolly@gmail.com");
		selectCoutry();
		city.sendKeys("Bangalore");
		uName.sendKeys("patel.dolly@gmail.com");
		password.sendKeys("abcd");
		submit.submit();
	}

	private void selectCoutry() {
		// String selectCountry;
		Select select = new Select(country);
		select.selectByValue("China");

	}

}
