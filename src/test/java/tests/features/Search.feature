@all
Feature: Search functionality

  Background:
    Given User opens the Application

  @search
  Scenario: Search for a valid product

    When User enters valid product into Search field
    And User clicks on Search button
    Then Valid Product should get displayed in the Search results

  @search
  Scenario: Search for a non-existing product

    When User enters non-existing product into Search field
    And User clicks on Search button
    Then Proper text informing the User about no product matching should be displayed

  @search
  Scenario: Search without providing any product

    When User don't enter any product into Search field
    And User clicks on Search button
    Then Proper text informing the User about no product matching should be displayed