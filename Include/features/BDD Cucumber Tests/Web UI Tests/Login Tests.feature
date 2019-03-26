@tag
Feature: The test case verifies that a user can login with a valid account

  Scenario Outline: Login successfully
    Given The Login page is loaded successfully
    When I login the system with valid "<username>" username and "<password>" password
    Then The Dashboard Page is loaded successfully

    Examples: 
      | username         | password         |
      | demo@katalon.com | sPiHQ&YEa6ST`de+ |
