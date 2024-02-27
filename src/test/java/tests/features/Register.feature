@all
Feature: User Registration

  Background:
    Given User navigates to Register Account page

  Scenario: Register with mandatory fields

    When User enters first name "Tsvetozara" into the First Name field
    And User enters lastname "Tosheva" into the Last Name field
    And User enters email address "tsvetozara.beneva@gmail.com" into the Email address field
    And User enters telephone "1234567890" into the Telephone field
    And User enters password "12345" into the Password field
    And User enters password "12345" into the Password Confirm field
    And User selects Privacy Policy Field
    And User clicks on Continue button
    Then Account should get successfully created

  Scenario: Register with all fields

    When User enters first name "Tsvetozara" into the First Name field
    And User enters lastname "Tosheva" into the Last Name field
    And User enters email address "tsvetozara.beneva@gmail.com" into the Email address field
    And User enters telephone "1234567890" into the Telephone field
    And User enters password "12345" into the Password field
    And User enters password "12345" into the Password Confirm field
    And User selects Yes for Newsletter
    And User selects Privacy Policy Field
    And User clicks on Continue button
    Then Account should get successfully created

  Scenario: Register without providing any fields

    When User don't enter details into any fields
    And User clicks on Continue button
    Then Warning messages should be displayed for the mandatory fields

  Scenario: Register with a duplicate email address

    When User enters first name "Tsvetozara" into the First Name field
    And User enters lastname "Tosheva" into the Last Name field
    And User enters email address "tsvetozara.beneva@gmail.com" into the Email address field
    And User enters telephone "1234567890" into the Telephone field
    And User enters password "12345" into the Password field
    And User enters password "12345" into the Password Confirm field
    And User selects Yes for Newsletter
    And User selects Privacy Policy Field
    And User clicks on Continue button
    Then Warning message informing the User about duplicate email address should be displayed
