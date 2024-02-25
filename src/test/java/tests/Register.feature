Feature: User Registration

  Scenario: Register with mandatory fields

    Given User navigates to Register Account page
    When User enters first name "Arun" into the First Name field
    And User enters lastname "Motoori" into the Last Name field
    And User enters email address "arun.motoori@gmail.com" into the Email address field
    And User enters telephone "1234567890" into the Telephone field
    And User enters password "12345" into the Password field
    And User enters password "12345" into the Password Confirm field
    And User selects Privacy Policy Field
    And User clicks on Continue button
    Then Account should get successfully created

  Scenario: Register with all fields

    Given User navigates to Register Account page
    When User enters first name "Arun" into the First Name field
    And User enters lastname "Motoori" into the Last Name field
    And User enters email address "arun.motoori@gmail.com" into the Email address field
    And User enters telephone "1234567890" into the Telephone field
    And User enters password "12345" into the Password field
    And User enters password "12345" into the Password Confirm field
    And User selects Yes for Newsletter
    And User selects Privacy Policy Field
    And User clicks on Continue button
    Then Account should get successfully created

  Scenario: Register without providing any fields

    Given User navigates to Register Account page
    When User don't enter details into any fields
    And User clicks on Continue button
    Then Warning messages should be displayed for the mandatory fields

  Scenario: Register with a duplicate email address

    Given User navigates to Register Account page
    When User enters first name "Arun" into the First Name field
    And User enters lastname "Motoori" into the Last Name field
    And User enters email address "arun.motoori@gmail.com" into the Email address field
    And User enters telephone "1234567890" into the Telephone field
    And User enters password "12345" into the Password field
    And User enters password "12345" into the Password Confirm field
    And User selects Yes for Newsletter
    And User selects Privacy Policy Field
    And User clicks on Continue button
    Then Warning message informing the User about duplicate email address should be displayed