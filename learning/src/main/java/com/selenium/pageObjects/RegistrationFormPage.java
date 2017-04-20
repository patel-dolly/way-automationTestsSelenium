package com.selenium.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utility.BaseClass;

public class RegistrationFormPage extends BaseClass {
	//WebDriver driver;

	public RegistrationFormPage(WebDriver driver) {
		BaseClass.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "name")
	WebElement firstName;
	@FindBy(xpath = "//*[@id='register_form']/fieldset[1]/p[2]/input")
	WebElement lastName;
	@FindBy(name = "m_status")
	List<WebElement> marritalStatus;
	@FindBy(name = "hobby")
	List<WebElement> hobby;
	@FindBy(xpath = "//*[@id='register_form']/fieldset[4]/select")
	WebElement country;
	@FindBy(xpath = "//*[@id='register_form']/fieldset[5]/div[1]/select")
	WebElement monthDob;
	@FindBy(xpath = "//*[@id='register_form']/fieldset[5]/div[3]/select")
	WebElement yearDob;
	@FindBy(xpath = "//*[@id='register_form']/fieldset[5]/div[2]/select")
	WebElement dayDob;
	@FindBy(name = "phone")
	WebElement phone;
	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(xpath = "//*[@id='register_form']/fieldset[9]/input")
	WebElement upload;
	@FindBy(xpath = "//*[@id='register_form']/fieldset[10]/textarea")
	WebElement aboutUrself;
	@FindBy(name = "password")
	WebElement pwd;
	@FindBy(name = "c_password")
	WebElement cnfPwd;
	@FindBy(xpath = "//*[@id='register_form']/fieldset[13]/input")
	WebElement submitForm;
	@FindBy(xpath = "//a[text()='Registration']")
	WebElement HomeLinkToRegistration;

	public void fillForm() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.elementToBeClickable(HomeLinkToRegistration));

		HomeLinkToRegistration.click();
		firstName.sendKeys("arvind");
		lastName.sendKeys("patel");
		marritalStatus.get(0).click();
		selectHobby();
		selectCountry();
		enterDOB();
		phone.sendKeys("989344622");
		username.sendKeys("arvind.patel");
		email.sendKeys("arvind.patel@gmail.com");
		upload.sendKeys("D:\\Selenium webDriver 3.0\\SikuliImages\\img1.png");
		aboutUrself.sendKeys("Automated by dolly ");
		pwd.sendKeys("abcdef");
		cnfPwd.sendKeys("abcdef");
		submitForm.submit();

	}

	private void enterDOB() {
		// TODO Auto-generated method stub
		Select s_Mon = new Select(monthDob);
		Select s_Day = new Select(dayDob);
		Select s_Year = new Select(yearDob);
		s_Mon.selectByValue("1");
		s_Day.selectByValue("1");
		s_Year.selectByValue("2014");

	}

	private void selectCountry() {
		// TODO Auto-generated method stub
		Select select = new Select(country);
		select.selectByValue("India");
	}

	private void selectHobby() {
		// TODO Auto-generated method stub
		hobby.get(0).click();
		hobby.get(1).click();
	}

}
