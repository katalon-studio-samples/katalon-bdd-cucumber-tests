Feature: Login
  As a Jira admin, I do not want any users logging in successfully with an invalid account so that they could not access private information.

  Background: 
    Given The Login page is loaded successfully

  Scenario Outline: Log in unsuccessfully with invalid account
    When I login the system with invalid "<username>" username and "<password>" password
    Then The Signup Page is opening

    Examples: 
      | username            | password         |
      | demo@katalon.com123 | sPiHQ&YEa6ST`de+ |

  Scenario Outline: Log in unsuccessfully with invalid account
    When I login the system with "<username>" username and invalid "<password>" password
    Then There is an error message for invalid password: "Your account or password is incorrect. If you don't remember your password, reset it now."

    Examples: 
      | username         | password            |
      | demo@katalon.com | sPiHQ&YEa6ST`de+123 |
