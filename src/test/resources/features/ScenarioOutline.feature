@regression
Feature: AppleStore with Scenario Outlines

  @smoke
  Scenario Outline: apple store buy
    Given Apple Store has <amount> "<item>"
    When User buys <buyAmount> "<item>"
    Then User should have <buyAmount> "<item>"
    And Apple Store should have <currentAppStoreAmount> "<item>"

    Examples:
      | amount | item   | buyAmount | currentAppStoreAmount |
      | 100    | Iphone | 10        | 90                    |
      | 50     | Ipad   | 5         | 45                    |
      | 80     | Watch  | 10        | 70                    |
      | 11     | Mac    | 10        | 1                     |





  Scenario: 1
    Given Apple Store has 100 "Iphone"
    When User buys 10 "Iphone"
    Then User should have 10 "Iphone"
    And Apple Store should have 90 "Iphone"


  Scenario: 2
    Given Apple Store has 50 "Ipads"
    When User buys 5 "Ipads"
    Then User should have 5 "Ipads"
    And Apple Store should have 45 "Ipads"


  Scenario: 3
    Given Apple Store has 80 "Watches"
    When User buys 10 "Watches"
    Then User should have 10 "Iphones"
    And Apple Store should have 70 "Watches"


  Scenario: 4
    Given Apple Store has 11 "Mac"
    When User buys 10 "Mac"
    Then User should have 10 "Mac"
    And Apple Store should have 1 "Mac"
