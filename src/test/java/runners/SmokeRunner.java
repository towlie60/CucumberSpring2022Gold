package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

//Annotations are labels for classes, methods, constructors and parameters
//We are using RunWith annotation to annotate(to let the JVM know that this class will be Junit Test Runner class.
@RunWith(Cucumber.class)
//CucumberOptions annotation is used to setup runner class configs like which feature files should be scanner
//where to look for step definitions etc.
@CucumberOptions(
        //which feature file to scan
        //classpath - is root path of the project compiled code.
        features = {"classpath:features"},
        //where to look for step definitions
        glue = {"step_defs"},
        //tags are same thing as groups in TestNG(test filters)
        //tags applied on a feature file level are applied to all scenarios in that feature file
        //tilde (~) - means - don't include this tag
        tags = {"@smoke, @hello", "~@ignore", "~@multipleaccount"},// "@tag", "@tag" -> two separate double quotes, separated by comma, mean "&&"
        //"@tag, @tag2" -> two (or maybe more) tags, inside the single double quotes, separated by comma mean "||"

        //.json file => is responsible for generating junit reports in json format.
        //json -> JavaScript object notation.
        //junit JSON reports are the first level of reports
        //we will need it for generating cucumber reports -> which will generate the test report
        //based on this .json report.
        plugin = {"json:target/cucumberSpring2022Gold.json"}, //this will append to the existing cucumber.json
        //generating cucumber html reports from cucumber.json file
        //html -is a face of the webpage. it's used for creating webpages. static webpage.
        format = {"pretty", "html:target/reports"}
        //generate step defs for all scenarios. it doesn't have an idea about whether any of the
        //scenarios have it. So it will just skip all the steps.
//        dryRun = false


)
public class SmokeRunner {

    //CME -> we have to ssh to qa server where the app is running.
    //and run update version(redeploy with new version) command -> app redeploy -u AppName(jeb)(jeb_adapter)(repo_gen)

    //Apple -> there is a (internal)web app which you can use to redeploy new versions.
    //option:
    //1. env - qa,dev,qa2,qa3
    //2. which app - ITunes, ApplePay.
    //3. which version -> 2.4.6, 2.0.0-Snapshot.
    //4. extra app specific configs.

    @BeforeClass//run only once before anything. change the version of the app under test to the latest one.
    public static void oneTimeSetup(){
        System.out.println("Before Class");
    }

    //Last thing to run before we are done with the Smoke test.
    //runs only once.
    @AfterClass
    public static void oneTimeTearUp(){
        System.out.println("AfterClass");
    }


}


///let's say you have scenarios for Apple Pay iwatch, iphone, Ipad.
///Same test scenarios for each device.
///SmokeIwatch -> "@iwatch", "@smoke"
//SmokeIphone
//SmokeIpad
//SmokeIphoneAndIpad -> "@smoke", "@iphone, @ipad";

