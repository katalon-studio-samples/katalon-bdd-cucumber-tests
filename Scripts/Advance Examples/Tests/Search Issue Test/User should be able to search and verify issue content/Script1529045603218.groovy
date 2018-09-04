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

/**
 * The test case verifies that a ticket can be found via search feature and displays correct information
 * 
 * Given The Jira system is available
 * When I search an ticket using its summary
 * and I open the the ticket
 * Then The opening ticket displays correct information
 * 
 * @params
 * issue_summary: issue's summary, which is used in searching
 * issue_type: issue's type
 */

WebUI.callTestCase(findTestCase('Advance Examples/Tests/Search Issue Test/User should be able to search issues with an jql'), 
    [('issue_summary') : issue_summary], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Advance Examples/Pages/Search Issue Page/Simple Issue List/Open the issue having specified summary'), 
    [('issue_summary') : issue_summary], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Advance Examples/Pages/Issue Page/The opening issue displays correct information'), [('issue_summary') : issue_summary
        , ('issue_type') : issue_type], FailureHandling.STOP_ON_FAILURE)

