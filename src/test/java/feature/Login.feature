Feature: Login feature
  Background:
    Given User should be on the login screen and Register

  @sanity @login
  Scenario: User should be able to log in with valid credentials
    Given User should be on the login screen and Register
    When User enter valid username and password
    And User click on the login button
    But User should not be on the login page

  Scenario: User should not be able to login with name
    When User enter "fara" on the username filed
    And User enter "Farihahoque123" on the password filed
    And User click on the login button
    Then User should see 'Error: The username fara is not registered on this site. If you are unsure of your username, try your email address instead.' error message for wrong username

  Scenario: User should not be able to login with wrong email
    When User enter "farihahoque10@gmail.com" on the username filed
    And User enter "Farihahoque123" on the password filed
    And User click on the login button
    Then User should see 'Unknown email address. Check again or try your username.' error message for wrong email

  Scenario: User should not be able to login with wrong password
    When User enter "farihahoque1610@gmail.com" on the username filed
    And User enter "Farih123" on the password filed
    And User click on the login button
    Then User should see "Error: The password you entered for the email address farihahoque1610@gmail.com is incorrect. Lost your password?" error message for wrong password