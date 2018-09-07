@Issue_Tests
Feature: Verify issue information

Background:
	Given The Jira System is available

  @Get_By_Id
  Scenario: Verify issue information by Id
    When I get information of an issue with Id "KD-1"
    Then I get response code "200"
    And The issue information as below:
        |project_key |issue_type |priority |summary                          |
        |KD          |Bug        |Low      |REST - Create new issue using API|
        
  @Get_By_Id
  Scenario Outline: Verify issue information by Id
    When I get information of an issue with Id "<issue_key>"
    Then I get response code "200"
    And The issue information as below:
        |project_key   |issue_type   |priority   |summary   |
        |<project_key> |<issue_type> |<priority> |<summary> |
        
  Examples:
  |issue_key|project_key |issue_type |priority |summary                          |
  |KD-1     |KD          |Bug        |Low      |REST - Create new issue using API|
  |KD-2     |KD          |Bug        |Low      |Update summary from API example  |