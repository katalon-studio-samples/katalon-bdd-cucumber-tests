@IssueTests
Feature: Verify issue information

  @Get_By_Id
  Scenario: Verify issue information by Id
    Given The Jira System is available 
    When I get information of an issue with Id "KD-1"
    Then I get response code "200"
    And The issue information as below:
        |project_key |issue_type |priority |summary                      |
        |KD          |Bug        |Low      |The issue type is not correct|