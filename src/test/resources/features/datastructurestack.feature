#Author: Anusuya S

Feature: Data Structure Stack

 Background: User is logged in
    Given User is on Login Page and data from excel file "src/test/resources/testdata.xlsx"
    When User enters username and password from extract data
    And User clicks on Login button
    Then User is navigated to the home page 

  Scenario: Navigate to Implementation of Stack
    When User scrolls to Implementation of Stack
    And User clicks on Implementation of Stack
    Then User is navigated to the Implementation of Stack page  
    
  
  
  
  