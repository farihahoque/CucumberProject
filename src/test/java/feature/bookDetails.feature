Feature: Logout feature
  Background:
    Given User should be on the load website

  @logout
  Scenario: User should be able to see book details
    When User is able to click book option
    When User is able to click anybook
    When User should able to see readbook option
