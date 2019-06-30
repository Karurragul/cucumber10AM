Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Title of your scenario
    Given The user should be in telecom homepage
    And User click the add customer
    When User should provide valid details
      | ram | kumar  | success@gmail.com | chn  |   1234 |
      | qaz | kumar1 | su@gmail.com      | chn1 |  12345 |
      | wsx | kumar2 | suc@gmail.com     | chn2 | 123467 |
    Then User should validate id
