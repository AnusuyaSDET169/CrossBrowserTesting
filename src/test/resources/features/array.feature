#Author: Mathumathi Balakrishnan

@sanity
@regression
Feature: Array

Background: User is on Login Page
    Given User is on Login Page
    When User enters username as "validUser" and password as "validPassword"
    And User clicks on Login button
    Then User is navigated to the home page

#Arrays in Python link-practice page
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
   Then User is able to see the error msg in console
  
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
  
  Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Max Consecutive Ones link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Max Consecutive Ones array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Max Consecutive Ones array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Max Consecutive Ones array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Max Consecutive Ones array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
 
 
   Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Find Numbers with Even Number of Digits link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Find Numbers with Even Number array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Find Numbers with Even Number array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Find Numbers with Even Number array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Find Numbers with Even Number array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console  
 
 Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
 Given The user is in the  Array Practice page
  When The user clicks Squares of  a Sorted Array link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Squares of  a Sorted Array array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Squares of  a Sorted Array array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Squares of  a Sorted Array array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Squares of  a Sorted Array array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console 
 
 
 






#Practice Question: Arrays Using List
	  
  Scenario: Verify if user able to redirect to Practice page
  Given The user is in the Array page after logged in
  When The user clicks Arrays Using List in Topics covered section
  Then The user should be directed to Arrays Using List Page
  When The user clicks Practice Questions link
  Then The user should be redirected to Practice page
 
  Scenario: Verify if user able to select "Search the Array"in Array Practice page and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Search the Array link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
   Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in array practice page page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in array practice page page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes invalid python code in array practice page page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes invalid python code in array practice page page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
 
  Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Max Consecutive Ones link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Max Consecutive Ones array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Max Consecutive Ones array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Max Consecutive Ones array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Max Consecutive Ones array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
 
 
   Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Find Numbers with Even Number of Digits link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Find Numbers with Even Number array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Find Numbers with Even Number array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Find Numbers with Even Number array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Find Numbers with Even Number array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console  
 
 Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
 Given The user is in the  Array Practice page
  When The user clicks Squares of  a Sorted Array link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Squares of  a Sorted Array array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Squares of  a Sorted Array array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Squares of  a Sorted Array array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Squares of  a Sorted Array array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
 
 
  #Practice Question: Basic Operations in Lists
 
 
Scenario: Verify if user able to redirect to Practice page
  Given The user is in the Array page after logged in
  When The user clicks Basic Operations in Lists in Topics covered section
  Then The user should be directed to Basic Operations in Lists Page
  When The user clicks Practice Questions link
  Then The user should be redirected to Practice page
 
 Scenario: Verify if user able to select "Search the Array"in Array Practice page and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Search the Array link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
   Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in array practice page page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in array practice page page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes invalid python code in array practice page page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes invalid python code in array practice page page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
 
  Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Max Consecutive Ones link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Max Consecutive Ones array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Max Consecutive Ones array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Max Consecutive Ones array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Max Consecutive Ones array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
 
 
   Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Find Numbers with Even Number of Digits link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Find Numbers with Even Number array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Find Numbers with Even Number array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Find Numbers with Even Number array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Find Numbers with Even Number array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console  
 
 Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
 Given The user is in the  Array Practice page
  When The user clicks Squares of  a Sorted Array link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Squares of  a Sorted Array array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Squares of  a Sorted Array array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Squares of  a Sorted Array array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Squares of  a Sorted Array array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
 
 
   #Practice Question: Applications of Array
 
 
Scenario: Verify if user able to redirect to Practice page
  Given The user is in the Array page after logged in
  When The user clicks Applications of Array in Topics covered section
  Then The user should be directed to Applications of Array Page
  When The user clicks Practice Questions link
  Then The user should be redirected to Practice page
  
 Scenario: Verify if user able to select "Search the Array"in Array Practice page and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Search the Array link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
   Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in array practice page page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in array practice page page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes invalid python code in array practice page page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes invalid python code in array practice page page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
 
  Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Max Consecutive Ones link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Max Consecutive Ones array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Max Consecutive Ones array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Max Consecutive Ones array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Max Consecutive Ones array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
 
 
   Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
  Given The user is in the  Array Practice page
  When The user clicks Find Numbers with Even Number of Digits link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Find Numbers with Even Number array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Find Numbers with Even Number array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Find Numbers with Even Number array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Find Numbers with Even Number array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console  
 
 Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
 
 Given The user is in the  Array Practice page
  When The user clicks Squares of  a Sorted Array link
  Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
 
  Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Squares of  a Sorted Array array practice page
  And Click the Run button in array page
  Then User is able to see the output in console of Arrays practice page
 
    Scenario: Verify if user able to see the output in console
  Given The user is on the Arrays practice page tryEditor page
  When The User writes Valid python code in Squares of  a Sorted Array array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console


   Scenario: Verify if user to see the error msg in pop up window
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Squares of  a Sorted Array array practice page
  And Click the Run button in array page
  Then User is able to see the error msg in Arrays practice page pop up window
 
    Scenario: Verify if user to see the error msg in console
  Given The user is on the Arrays practice page tryEditor page
  When The user writes Invalid python code in Squares of  a Sorted Array array practice page
  And Click the Submit button in array page
  Then User is able to see the error msg in console
  
 
 
 
   
 
  
   