package org.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JVMClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\featurefiles"},
        glue = {"org.stepdef","org.hooks"},monochrome=true,
        		dryRun=false,tags= {"@logininv"},
        plugin = {"pretty","json:target/cucumber.json","html:target/cucumber.html",
        				"junit:target/cucumber.xml",
        				"rerun:src\\test\\resources\\rerun\\Fb.txt"
        		
        		})
public class RunnerClass {

	@AfterClass
	public static void genReport() {
		JVMClass.generateJVMReport(System.getProperty("user.dir")+"\\target\\cucumber.json");

	}}
	
	


