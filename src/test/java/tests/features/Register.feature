@all
Feature: User Registration

  Background:
    Given User navigates to Register Account page

  Scenario: Register with mandatory fields

    When User enters below details into the fields
      | firstname | Tsvetozara                  |
      | lastname  | Tosheva                     |
      | email     | tsvetozara.beneva@gmail.com |
      | telephone | 1234567890                  |
      | password  | 12345                       |
    And User selects Privacy Policy Field
    And User clicks on Continue button
    Then Account should get successfully created

  Scenario: Register with all fields

    When User enters below details into the fields
      | firstname | Tsvetozara                  |
      | lastname  | Tosheva                     |
      | email     | tsvetozara.beneva@gmail.com |
      | telephone | 1234567890                  |
      | password  | 12345                       |
    And User selects Yes for Newsletter
    And User selects Privacy Policy Field
    And User clicks on Continue button
    Then Account should get successfully created

  Scenario: Register without providing any fields

    When User don't enter details into any fields
    And User clicks on Continue button
    Then Warning messages should be displayed for the mandatory fields

  Scenario: Register with a duplicate email address

    When User enters below details into the fields
      | firstname | Tsvetozara                            |
      | lastname  | Tosheva                               |
      | email     | tsvetozara.beneva.duplicate@gmail.com |
      | telephone | 1234567890                            |
      | password  | 12345                                 |
    And User selects Yes for Newsletter
    And User selects Privacy Policy Field
    And User clicks on Continue button
    Then Warning message informing the User about duplicate email address should be displayed
