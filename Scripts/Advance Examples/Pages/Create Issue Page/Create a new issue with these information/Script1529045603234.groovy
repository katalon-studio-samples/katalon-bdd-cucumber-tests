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
 * The workflow test case inputs information into Create issue form
 * The expected result will be on another test case which verifying the created issue
 *
 * Given The Create issue form is opening
 * When  I input neccessary information into the form
 *
 * @params
 * project: project's key
 * issueType: issue's type, such as Bug, Task, Story, Enum, etc
 * priority: issue's priority
 * summary: issue's summary
 */
WebUI.callTestCase(findTestCase('Advance Examples/Pages/Master Page/Open the Create Issue form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Test Objects/Pages/Create Issue Page/elRoot'), GlobalVariable.element_timeout)

WebUI.verifyElementText(findTestObject('Test Objects/Pages/Create Issue Page/elTitle'), 'Import issues\nCreate issue')

CustomKeywords.'com.jira.components.JSelect.selectByText'('Project', project)

CustomKeywords.'com.jira.components.JSelect.selectByText'('Issue Type', issueType)

String time = new Date().getTime()

String fixed_summary = String.format('%s %s', summary, time)

WebUI.waitForElementClickable(findTestObject('Test Objects/Pages/Create Issue Page/elSummary'), GlobalVariable.element_timeout)

WebUI.setText(findTestObject('Test Objects/Pages/Create Issue Page/elSummary'), fixed_summary)

CustomKeywords.'com.jira.components.JSelect.selectByText'('Priority', priority)

WebUI.setText(findTestObject('Test Objects/Pages/Create Issue Page/elDescription'), description)

WebUI.waitForElementClickable(findTestObject('Test Objects/Pages/Create Issue Page/elCreate'), GlobalVariable.element_timeout)

WebUI.click(findTestObject('Test Objects/Pages/Create Issue Page/elCreate'))

WebUI.waitForElementClickable(findTestObject('Test Objects/Pages/Master Page/elFlag', [('summary') : fixed_summary]), 
    GlobalVariable.element_timeout)

WebUI.click(findTestObject('Test Objects/Pages/Master Page/elFlag', [('summary') : fixed_summary]))

return fixed_summary

