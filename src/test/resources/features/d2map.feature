Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given The user should be in telecom homepage
    And User click the add customer
    When User should provide valid details
      | Fname | lname | gmail         | Address | phone  |
      | qaz   | kumar | su@gmail.com  | chn1    |  12345 |
      | wsx   | kumar | suc@gmail.com | chn2    | 123467 |
    Then User should validate id
