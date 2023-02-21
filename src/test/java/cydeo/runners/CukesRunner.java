package cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "cydeo/step_definitions",
   //     plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cucumber.xml"}
        dryRun = false,
        tags ="@wip" //if we write only @ don't run anything.
                 // if we use 'or' turn us both conditions. @admin or @student it turns student and admin
                 // and => @employee and @librarian => only gets librarian
                 // and not => @Regression and not @employee => only gets students
)
public class CukesRunner {


}
