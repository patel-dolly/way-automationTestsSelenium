package com.selenium.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class TakeScreenShots {
	
public void captureScreenshot(WebDriver driver,String imageName) throws IOException{
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("./test-output/TestScreenshots/"+imageName+".png"));
	System.out.println("Captured");
	
}


	
}
