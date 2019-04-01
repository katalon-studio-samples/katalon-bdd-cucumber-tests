Feature: Create tickets
  As a Jira user, I want to be able to create tickets so that I could keep track of my tasks

  Background: 
    Given I already logged in the system

  Scenario Outline: Log in unsuccessfully with invalid account
    When I create a new issue with provided information:
      | project   | issue_type   | priority   | summary   | description   |
      | <project> | <issue_type> | <priority> | <summary> | <description> |
    Then The issue is created with correct information:
      | issue_type   | summary   |
      | <issue_type> | <summary> |

    Examples: 
      | project           | issue_type | priority | summary     | description                     |
      | Katalon-Demo (KD) | Bug        | Low      | A bug found | A bug is found on Login feature |
      | Katalon-Demo (KD) | Story      | High     | A bug found | A bug is found on Login feature |
