Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given The user should be in telecom homepage
    And User click the add customer
    When User should provide valid details"<fname>","<lname>","<email>","<address>","<phone>"
    Then User should validate id

    Examples: 
      | fname | lname | email             | address | phone |
      | ram   | kumar | success@gmail.com | chn     |  1234 |
      | prem  | raj   | Fail@gmail.com    | bgrle   |  9865 |
