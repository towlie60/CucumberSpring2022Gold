###Test setup - Test preconditions

  ##For Feature files which have 20 tests
  ##10 of them have the same pre-conditional steps
  #10 have different ones.
  #create 2 feature file - leverage background in one them,
  #and keep the other 10 as it is.
@smoke @regression
Feature: Avoiding Repetition

    ##We can put all repeating pre-conditional steps here
    ##only one Background per file
  Background:
    Given User "johnDoe@gmail.com" with password "ExtremelyHardPa$$" is registered
    When User "johnDoe@gmail.com" with password "ExtremelyHardPa$$" logs in
    And User "johnDoe@gmail.com" should be navigated to HomePage

    @login
  Scenario: Integer Params - Buy functionality
    And User buys 20 "Iphones"
    Then User should have 20 "Iphones"

      @ignore
  Scenario: Double Params - Buy functionality
    When User buys 20 "Iphones"
    Then User total should be $2000.55

  Scenario: Char Params - Buy functionality
    When User buys 20 "Iphones"
    Then User total should be $2000.55
    And User credit standing should be 'A'