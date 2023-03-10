package cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "cydeo/step_definitions",
   //     plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cucumber.xml"}
        dryRun = false,
        tags ="" ,//if we write only @ don't run anything.
                 // if we use 'or' turn us both conditions. @admin or @student it turns student and admin
                 // and => @employee and @librarian => only gets librarian
                 // and not => @Regression and not @employee => only gets students
        publish = false
        //- "pretty" plugin:
        //- basically it just prints out additional information about the scenario that is being executed.
        //
        //------------------------------------------------------------------------------
        //
        //publish = true;
        //    --> will enable a functionality from cucumber to generate a public link for the report of our final execution of our code
        //    --> the link will be automatically generated and printed in the console
        //    --> it will be ready to share with anyone
)
public class CukesRunner {


}
