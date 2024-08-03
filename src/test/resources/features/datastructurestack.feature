#Author: Anusuya S

Feature: Data Structure Stack

  Scenario: Login, select stack and logout
    Given I open the login page
    When I enter valid credentials
    And I click on login button
    Then I should be logged in successfully
    When I select Data Structures and Algorithms
    And I select Stack from the list
    Then I should see the stack page
    When I log out
    Then I should be logged out successfully