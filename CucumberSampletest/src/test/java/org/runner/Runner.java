package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\WINDOW'S\\eclipse-workspace\\CucumberSampletest\\src\\test\\resources\\test.feature", glue = "org.stepdefinition", monochrome = false)


public class Runner {



}
