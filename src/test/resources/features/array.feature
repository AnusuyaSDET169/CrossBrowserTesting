#Author: Mathumathi Balakrishnan

@sanity
@regression
Feature: Array

Background: User is on Login Page
  
    Given User is on Login Page
    When User enters username as "validUser" and password as "validPassword"
    And User clicks on Login button
    Then User is navigated to the home page

   Scenario: Verify if user able to redirect to Practice page
   
   Given The user is in the Array page after logged in 
   When  The user clicks Arrays in Python link in Topics covered section 
   Then  The user should be directed to Arrays in Python Page
   When  The user clicks Practice Questions link
   Then The user should be redirected to Practice page
  
   
   Scenario: Verify if user able to select "Search the Array"in Array Practice page and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Search the Array link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
   Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
   
  