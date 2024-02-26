Feature: User Login
  Registered user should be able to login to access account details

  Background:
    Given User navigates to Login page

  Scenario Outline: Login with valid credentials

    When User enters a valid email address <email>
    And Enters a valid password <password>
    And Clicks on Login button
    Then User should login successfully
    Examples:
    |email                 |password|
    |amotooricap9@gmail.com|12345   |
    |amotooricap3@gmail.com|12345   |
    |amotooricap1@gmail.com|12345   |

  Scenario: Login with invalid credentials

    When User enters an invalid email address "amotooricap9111@gmail.com"
    And Enters an invalid password "12345111"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with valid email address and invalid password

    When User enters a valid email address "amotooricap9@gmail.com"
    And Enters an invalid password "12345111"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with invalid email address and valid password

    When User enters an invalid email address "amotooricap9111@gmail.com"
    And Enters a valid password "12345"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login without providing any credentials

    When User don't enter any credentials
    And Clicks on Login button
    Then User should get a proper warning message