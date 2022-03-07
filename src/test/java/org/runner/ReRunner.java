package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@src\\test\\resources\\rerun\\Fb.txt",
        glue = {"org.stepdef","org.hooks"},monochrome=true)
public class ReRunner {

	
	
}
