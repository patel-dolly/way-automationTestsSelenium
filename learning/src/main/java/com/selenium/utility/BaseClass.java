package com.selenium.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	protected static WebDriver driver;

	protected BaseClass() {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selenium webDriver 3.0\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		System.out.println("Exceuted BAse cass");

	}

	@BeforeClass
	protected void openBrowser() throws IOException {
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//driver = new ChromeDriver();
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("firefox_binary","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		//D:\Selenium webDriver 3.0\geckodriver-v0.15.0-win32

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("D:\\GitProjectS\\learning\\AutoItScripts\\handleAuthenticationWindows.exe");

		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		// driver.get("https://www.facebook.com/");

		/*driver.findElement(
				By.xpath("/html/body/div/div/table[2]/tbody/tr/td/table[1]/tbody/tr[2]/td/a"))
				.click();
*/
	}
}
