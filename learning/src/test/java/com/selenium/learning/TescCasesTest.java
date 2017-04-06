package com.selenium.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.pageObjects.RegistrationPage;

public class TescCasesTest {
	static WebDriver driver;

	/*public TescCasesTest( ) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

	}
*/
	@BeforeTest
	void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		//driver.get("https://www.facebook.com/");

		driver.findElement(
				By.xpath("/html/body/div/div/table[2]/tbody/tr/td/table[1]/tbody/tr[2]/td/a"))
				.click();

	}

	@Test
	void registration() {
		 RegistrationPage register = new RegistrationPage(driver);

		register.registerUser();
		// System.out.println("Print elementvalue")+register.;

	}

}