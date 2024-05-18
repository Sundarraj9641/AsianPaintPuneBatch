package com.AP.Asianpaints;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","json:target/Cucumber.json",                            //JSON, XML and HTML reports
                "junit:target/Cucumber.xml",
                "html:target/Cucumber.html",
                "html:test-output"},
		features = "src/test/resources/features",
		glue= {"Steps"}, 
		tags="@tag1" )
public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
