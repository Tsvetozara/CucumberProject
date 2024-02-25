Feature: User Login
  Registered user should be able to login to access account details

  Scenario: Login with valid credentials

    Given User navigates to Login page
    When User enters a valid email address "amotooricap9@gmail.com"
    And Enters a valid password "12345"
    And Clicks on Login button
    Then User should login successfully

  Scenario: Login with invalid credentials

    Given User navigates to Login page
    When User enters an invalid email address "amotooricap9111@gmail.com"
    And Enters an invalid password "12345111"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with valid email address and invalid password

    Given User navigates to Login page
    When User enters a valid email address "amotooricap9@gmail.com"
    And Enters an invalid password "12345111"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with invalid email address and valid password

    Given User navigates to Login page
    When User enters an invalid email address "amotooricap9111@gmail.com"
    And Enters a valid password "12345"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login without providing any credentials

    Given User navigates to Login page
    When User don't enter any credentials
    And Clicks on Login button
    Then User should get a proper warning message