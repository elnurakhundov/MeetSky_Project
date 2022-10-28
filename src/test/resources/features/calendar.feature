Feature: Calendar Module

  Scenario: User can display daily calendar view
    Given User is on the login page
    When User clicks on the Calendar module
    And User clicks on the calendar icon
    And User clicks on the Day option
    Then Daily calendar view should be displayed

  Scenario: User can display weekly calendar view
    Given User is on the login page
    When User clicks on the Calendar module
    And User clicks on the calendar icon
    And User clicks on the Week option
    Then Weekly calendar view should be displayed

  Scenario: User can display monthly calendar view
    Given User is on the login page
    When User clicks on the Calendar module
    And User clicks on the calendar icon
    And User clicks on the Month option
    Then Monthly calendar view should be displayed

  Scenario: User can create a new event under the Calendar module and see it on the Monthly Calendar view
    Given User is on the login page
    When User clicks on the Calendar module
    And User clicks on the +New event option
    And User enters event title
    And User enters valid starting date and time
    And User enters valid ending date and time
    And User clicks on the Save button
    Then User is able to create a new event
    Then User can see the new event on the monthly calendar view

  Scenario: User can delete any event through the Monthly Calendar view by clicking on the event and then using “more” option
    Given User is on the login page
    When User clicks on the Calendar module
    And User clicks on the calendar icon
    And User clicks on the Month option
    And User clicks on the created new event through the monthly calendar view
    And User clicks on the More option
    And User clicks on the ... option
    And User clicks on the delete option
    Then User is able to delete the event

