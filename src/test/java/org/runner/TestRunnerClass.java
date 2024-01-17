package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporting.JvmReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\publish\\1LoginPage.feature",
		"src\\test\\resources\\publish\\2SearchHotel.feature",
		"src\\test\\resources\\publish\\3SelectHotel.feature",
		"src\\test\\resources\\publish\\4PaymentDetails.feature"},
		glue= "org.step",
		monochrome = true,
		dryRun=false,
		snippets=SnippetType.CAMELCASE,
		plugin= {"html:target\\htmlReport",
				"junit:target\\xmlReport.xml",
				"json:target\\jsonReport.json"
				}
		)

public class TestRunnerClass {
	
	@AfterClass
	public static void fnAfterClass() {

		JvmReportingClass.generateReport("target\\jsonReport.json");
	}
}
