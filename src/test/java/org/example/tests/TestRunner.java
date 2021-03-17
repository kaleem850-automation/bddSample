package org.example.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features/Google.feature"},
        glue = {"org.example.stepdefs"},
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
