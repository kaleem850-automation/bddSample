package org.example.stepdefs;

import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.example.config.Config;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Config.class)
@CucumberContextConfiguration
public class SpringConfiguration implements En {

    public SpringConfiguration(){
        After((Scenario scenario) -> {

        });
    }
}

