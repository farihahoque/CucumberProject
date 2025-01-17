Feature: Logout feature
  Background:
    Given User should be on the login screen and Register Initially

   @logout
  Scenario: User should be able to log out
    When User enter valid username and password for login
    And User click on the login button first
    But User click on the logout button then

