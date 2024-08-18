#Author: Anusuya S

Feature: Data Structure Stack



  Background: User is on Login Page
  
    Given User is on Login Page
    When User enters username as "validUser" and password as "validPassword"
    And User clicks on Login button
    Then User is navigated to the home page
    #Given User is on Login Page and data from excel file "src/test/resources/testdata.xlsx"
    

  Scenario: Navigate to Implementation of Stack
    When User scrolls to Implementation of Stack
    And User clicks on Implementation of Stack
    Then User is navigated to the Implementation of Stack page  
    
  
  
  
  