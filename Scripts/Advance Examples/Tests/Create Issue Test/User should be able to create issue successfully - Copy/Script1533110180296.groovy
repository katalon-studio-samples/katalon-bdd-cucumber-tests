import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/**
 * The test case verifies that a new issue can be created successfully
 * Scenario: Create ticket successfully
 * 
 * Given I login the system with a valid account
 * When I create a new ticket with below information
 * Then the ticket is created successfully
 * 
 * @params
 * project: project's key
 * issueType: issue's type, such as Bug, Task, Story, Enum, etc
 * priority: issue's priority
 * summary: issue's summary
 */
WebUI.callTestCase(findTestCase('Advance Examples/Pages/Login Page/Login with username and encrypted password'), [('username') : GlobalVariable.username
        , ('encryptedPassword') : GlobalVariable.encrypted_password], FailureHandling.STOP_ON_FAILURE)

def fixed_summary = WebUI.callTestCase(findTestCase('Advance Examples/Pages/Create Issue Page/Create a new issue with these information'), [('project') : project
        , ('issueType') : issueType, ('priority') : priority, ('description') : description, ('summary') : summary], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Advance Examples/Pages/Issue Page/The opening issue displays correct information'), [('issue_summary') : fixed_summary
        , ('issue_type') : issueType], FailureHandling.STOP_ON_FAILURE)

