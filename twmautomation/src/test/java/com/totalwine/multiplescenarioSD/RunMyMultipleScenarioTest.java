package com.totalwine.multiplescenarioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
			//dryRun=true,
			features= {"src/test/resources/com/basic/multiplescenarioFF/"},
			glue= {"com/totalwine/multiplescenarioFF/"},
			
			plugin= {"pretty",
					 "html:target/cucumber-html-report",
					 "json:target/cucumber-report.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
			}
			)

public class RunMyMultipleScenarioTest {

}
