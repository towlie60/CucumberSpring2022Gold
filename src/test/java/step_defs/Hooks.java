package step_defs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before("@smoke") //run this only before smoke tests("scenarios which have @smoke tag")
    public void appleStoreSetup(){
        System.out.println("Setup some tests");
    }

    @Before("~@ignore")// do not run this before @ignore.
    public void testSetup(){
        System.out.println("Second Setup");
    }

    @After
    public void testCleanUp(Scenario scenario){
        if(scenario.isFailed()){
            //Take a screenshot & add it to my report => in Selenium you can do this.
        }
        System.out.println("Post testing cleaning up");
    }

}
