#Author: A

Feature: Cross-browser testing

Scenario Outline: Open browser and check title
    Given I open the "<browser>" browser
    When I navigate to "https://example.com"
    Then the page title should be "Example Domain"

    Examples:
      | browser  |
      | chrome   |
      | firefox  |