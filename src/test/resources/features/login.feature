#Author: Anusuya S




 Feature: Login feature

  Background: User is on Login Page
    Given User is on Login Page

  Scenario: Successful Login with Valid Credentials
    When User enters username as "validUser" and password as "validPassword"
    And User clicks on Login button
    Then User is navigated to the home page
  