Feature: Login

  @smoke
  Scenario: Login
    Given I have opened the browser
    When I send my credentials
    Then I should see the "Log In — WordPress.com" title of the page
