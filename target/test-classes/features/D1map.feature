Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title1
    Given The user should be in telecom homepage
    And User click the add customer
    When User should provide valid details
      | Fname   | raj               |
      | lname   | kumar             |
      | gmail   | success@gmail.com |
      | address | chn               |
      | phone   |              1234 |
    Then User should validate id
