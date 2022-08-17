package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParamStepDefs {

    //Regex - regular expression. a formula that you use to make sure only matching Strings are applied here.
    //^ means beginning of a regex
    //$ end of a regex
    //Hard coded Strings in regex mean passing String must match this words in the same case and same(exact) order
    //\" ->
    //( - beginning of a param
    // ) - end of a param
    //[^] -> means exclude \" double code
    //(*) -> any String.
    @Given("^User \"([^\"]*)\" with password \"([^\"]*)\" is registered$")
    public void user_with_password_is_registered(String username, String password) {
        System.out.println(username + " with password " + password + " is registered");
    }

    @When("^User \"([^\"]*)\" with password \"([^\"]*)\" logs in$")
    public void user_with_password_logs_in(String username, String password)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username + " with password " + password + " logs in");
    }

    //Then User "tim@apple.com" should be navigated to HomePage
    @Then("^User \"([^\"]*)\" should be navigated to HomePage$")
    public void user_should_be_navigated_to_HomePage(String username)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username + " should be navigated to HomePage");
    }

    //() - formula scope
    //\\d - digits
    //\\d+ - positive
    @And("^User buys (\\d+) \"([^\"]*)\"$")
    public void userBuys(int amount, String item) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User buys " + amount + " " + item);
    }

    //d{n} - limits to n digits.
    //d{2} - limits to two digits.
    @Then("^User total should be \\$(\\d+.\\d{2})$")
    public void userTotalShouldBe$(double price) {
        System.out.println("User total should be $" + price);
    }

    @And("^User credit standing should be '([^0-9*#+$])'$")
    public void userCreditStandingShouldBeA(char grade ) {
        System.out.println("User credit grade is " + grade);
    }


    @Then("^User should have (\\d+) \"([^\"]*)\"$")
    public void userShouldHave(int amount, String item) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User should have " + amount + " " + item);
    }
}
