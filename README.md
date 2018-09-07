# Katalon Studio Samples: BDD Cucumber Tests
Katalon Studio is a free and easy-to-use automated functional and regression testing platform. It provides users the ability to implement full automated testing solutions for their application projects with minimal engineering and programming skill requirements.
______
The **katalon-bdd-cucumber-tests** perform UI & API functional automation tests written in BDD Cucumber format on Jira Web Application using Katalon Studio. The examples in this project range from common to advanced test cases.
## Getting Started
These instructions will get you a copy of the project up and running on your local machine.

### Important Notes:
- **This sample project is compatiple to Katalon version 5.7 and above only.**
- katalon-bdd-cucumber-tests project airms to demonstrate how to express Test Cases (or Test Scenarios) in Cucumber format using Gherkin language. To make the test easier to understand by users, this sample project is built on top of two other sample projects:
    + [Jira UI Tests](https://github.com/katalon-studio-samples/jira-ui-tests)
    + [Jira API Tests](https://github.com/katalon-studio-samples/jira-api-tests)
- You might need to explore these two projects before starting this project for better understanding.

### Prerequisites
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com/x/HwAM)
- Internet access
- Application Under Test (AUT):
     + Jira cloud: https://katalon.atlassian.net/
     + Account: demo@katalon.com/sPiHQ&YEa6ST`de+
### Setting Up
- [Check out](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) the code from this repository
- [Open the project](https://docs.katalon.com//display/KD/Manage+Test+Project) from Katalon Studio
### Executing a Feature
![Execute a simple feature](https://github.com/katalon-studio-samples/katalon-bdd-cucumber-tests/blob/master/Tutorials/Figures/Execute%20a%20feature.png?raw=true)
1. Expand the **Include** structure, where all the features and step definition scripts located
2. Select the **Feature** you want to execute
3. Execute the **Feature**

At the end of this README, you will find additional ways to execute automation test cases. 
## Test Features
Below is the list of all the available features in this project relating to the test scenarios as described. Simply select the test feature you want to run in Katalon Studio and execute accordingly. You can also make additional changes in these test features to get familiar with automation testing and specifically Katalon Studio. 
### Story: Verify issue information feature
```Gherkin     
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
``` 
## See Also
Update configurations for integration: [Jira](https://docs.katalon.com/x/7oEw), [Katalon Analytics](https://docs.katalon.com/x/KRhO)

Katalon Documentation: http://docs.katalon.com/, especially some [Tips and Tricks](https://docs.katalon.com/x/PgXR) to run a successful automation test. 

Katalon Forum: https://forum.katalon.com/

Katalon Business Support: https://www.katalon.com/support-service-options/
