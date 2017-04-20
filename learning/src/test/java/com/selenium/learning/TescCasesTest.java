package com.selenium.learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.selenium.pageObjects.SignInPage;
import com.selenium.utility.BaseClass;

@Listeners(com.selenium.utility.TestListners.class)
public class TescCasesTest extends BaseClass {
	Logger logs;

	// WebDriver driver;
	/*
	 * @Test(enabled = false) void registration() { RegistrationPage register =
	 * new RegistrationPage(driver);
	 * 
	 * register.registerUser(); //
	 * System.out.println("Print elementvalue")+register.;
	 * 
	 * }
	 */

	@Test(priority = 0)
	void registeredUserLogin() throws SikuliException, InterruptedException {
		SignInPage sign = new SignInPage(driver);

		logs = Logger.getLogger(getClass());
		PropertyConfigurator.configure("log4j.properties");
		logs.info("Testing user sign in test");
		sign.userSignIn();

		/*Actions action = new Actions(driver);
		// Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By
				.xpath("//*[@id='wrapper']/header/div"))));

		System.out.println("executing hover");
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id='toggleNav']/li[3]/a"))).perform();
				action.moveToElement(
						driver.findElement(By
								.xpath("//*[@id='toggleNav']/li[3]/ul/li[3]/a")))
				.click().perform();*/
		
	}

	@Test(dependsOnMethods = { "registeredUserLogin" }, priority = 1)
	void selectDatePicker() throws InterruptedException {
		 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//WebDriverWait wait=new WebDriverWait(driver, 30);
WebElement menu=driver.findElement(By.xpath("//*[@id='toggleNav']/li[3]/a"));
			WebElement submenu=driver.findElement(By.xpath("//*[@id='toggleNav']/li[3]/ul/li[3]/a"));
	Actions action=new Actions(driver);
	action.moveToElement(menu).perform();
	Thread.sleep(2000);
	action.click(submenu).perform();
	//Thread.sleep(2000);
		 driver.switchTo().frame(0);
		 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.querySelector('#datepicker').value='04/04/2017'");
		js.executeScript("document.getElementById('ui-datepicker-div').value='04/04/2017'");
		driver.switchTo().defaultContent();
		System.out.println("Performed");

	}
}