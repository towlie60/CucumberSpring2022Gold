package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//We are using RunWith annotation to annotate(to let the JVM know that this class will be Junit Test Runner class.
@RunWith(Cucumber.class)
//CucumberOptions annotation is used to setup runner class configs like which feature files should be scanner
//where to look for step definitions etc.
@CucumberOptions(
        //which feature file to scan
        //classpath - is root path of the project compiled code.
        features = {"classpath:features"},
        //wher to look for step definitions
        glue = {"step_defs"},
        //tags are same thing as groups in TestNG(test filters)
        //tags applied on a feature file level are applied to all scenarios in that feature file
        //tilde - ~ means do not include this tag
        tags = {"@regression"} // "@tag", "@tag" -> two seprate double quotes, mean &&
        //"@tag, @tag2" -> a single double mean ||

        //is responsible for generating junit reports in json format. -> json file
        //json -> java script object notation.
        //junit JSON reports are the first level of reports
        //we will need it for generating cucumber reports -> which will genarate the test repot
        //based on this .json report.
       // plugin = {"json:target/cucumber.json"}
        //generating cucumber html reports from cucumber.json file
        //html -is a face of the webpage. it's used for creating webpages. static webpage.

)
public class RegressionRunner {

}
