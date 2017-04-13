package com.selenium.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class TakeScreenShots extends BaseClass{
	
public void captureScreenshot(String imageName) throws IOException{
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("./test-output/TestScreenshots/"+imageName+".png"));
	System.out.println("Captured");
	
}


	
}
