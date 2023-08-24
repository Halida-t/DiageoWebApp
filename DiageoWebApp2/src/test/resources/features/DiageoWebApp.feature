
@tag
Feature: Diageo Web Application Login
  User want to be able to login with valid credentials.
  User should not be logged in with invalid credentials.


  @DiageoLogin
  Scenario: User should be able to log in.
    Given User is on the log in page
    And The LOGIN button displays.
    When User enter valid email address.
    And User enter valid password.
    And User click on the LOGIN button
    Then User should be directed to dashboard.
    


