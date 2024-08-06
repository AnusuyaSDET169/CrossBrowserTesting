#Author: Anusuya S



  
Feature: Queue Feature

  Background: User is logged in
    Given User is on Login Page
    When User enters username as "validUser" and password as "validPassword"
    And User clicks on Login button
    Then User is navigated to the home page

  Scenario: Navigate to Implementation of Queue
    When User scrolls to Implementation of Queue
    And User clicks on Implementation of Queue
    Then User is navigated to the Implementation of Queue page
    