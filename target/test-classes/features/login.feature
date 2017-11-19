Feature: Login

  @smoke
  Scenario: Login
    Given I have opened the browser
    When I send my credentials "<user>"
    Then I should see the "<Wordpress>" title of the page
