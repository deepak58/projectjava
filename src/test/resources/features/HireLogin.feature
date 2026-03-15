Feature: Login functionality of HireAccel

    #Gherkin KeyWords
    #Steps: to use with keys
    #Given: Preconditions - Browser open->url nav
    #When: Action steps related test cases
    #Then: Validate result of actions
  Background:
    Given User navigate to login page

  Scenario: Error check in email and password field
    When User click login with empty field
    Then User should see email error field in "Email or phone number is required"
    And User should see password error field in "Password is required"

  Scenario Outline: Login test with valid and invalid credentials
    When User enter email "<email>"
    And User enter password "<password>"
    And User click login
    Then User should see "<result>"

    Examples:
      | email               | password | result          |
      | testadmin@gmail.com | Abcd@123 | Admin Dashboard |
      | wrong@gmail.com     | Abcd@123 | Invalid credentials |
