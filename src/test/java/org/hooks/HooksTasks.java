package org.hooks;

import java.io.IOException;
import java.time.Duration;

import org.helper.HelperClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class HooksTasks extends HelperClass {

	@Before
	public void befrClass() {
		getDateAndTime();
		System.out.println("-------BEFORE EXECUTION----------");
		launchBrowser();
		maxWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@After
	public void aftrClass(Scenario s) throws IOException {
		
		if (s.isFailed()) {
			TakesScreenshot t = (TakesScreenshot)driver;
			byte[] screenshotAs = t.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
		}
		
		
		
//		String name =s.getName();
//		String name1=name.replace(" ", "_");
//		toTakeScreenShot(name1);
		getDateAndTime();
		System.out.println("------------AFTER EXECUTION------------");
		driver.close();
		
	}
	
}
