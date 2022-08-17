package step_defs;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class AppleStoreSteps {

    //Just like Junit/ TestNG
    //Cucumber has @Before and @After ->
    //@Before runs once before every scenario
    //@After runs once after every scenario.

    @Before
    public void appleStoreSetup(){
        System.out.println("Setup some tests ");
    }

    @After
    public void testCleanUp(){
        System.out.println("Post testing cleaning up");
    }
    @Given("^Apple Store has (\\d+) \"([^\"]*)\"$")
    public void appleStoreHas(int amount, String item)  {
        System.out.println("Loading " + amount + item +"s");
    }

    @And("^Apple Store should have (\\d+) \"([^\"]*)\"$")
    public void appleStoreShouldHave(int amount, String item) {
        System.out.println("Apple Store has " + amount + item +"(s/es) in Stock");
    }


}
