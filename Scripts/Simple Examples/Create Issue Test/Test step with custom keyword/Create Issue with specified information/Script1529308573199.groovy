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

WebUI.callTestCase(findTestCase('Simple Examples/Login Test/Test data hardcoding examples/Login with username and password specified in the test steps'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Test Objects/Pages/Master Page/Menu/elCreate'), 0)

WebUI.click(findTestObject('Test Objects/Pages/Master Page/Menu/elCreate'))

WebUI.waitForElementVisible(findTestObject('Test Objects/Pages/Create Issue Page/elRoot'), GlobalVariable.element_timeout)

WebUI.verifyElementText(findTestObject('Test Objects/Pages/Create Issue Page/elTitle'), 'Import issues\nCreate issue')

CustomKeywords.'com.jira.components.JSelect.selectByText'('Project', 'Katalon-Demo (KD)')

CustomKeywords.'com.jira.components.JSelect.selectByText'('Issue Type', 'Bug')

String time = new Date().getTime()

String fixed_summary = String.format('%s %s', 'Ticket created at', time)

WebUI.waitForElementClickable(findTestObject('Test Objects/Pages/Create Issue Page/elSummary'), GlobalVariable.element_timeout)

WebUI.setText(findTestObject('Test Objects/Pages/Create Issue Page/elSummary'), fixed_summary)

CustomKeywords.'com.jira.components.JSelect.selectByText'('Priority', 'Low')

WebUI.setText(findTestObject('Test Objects/Pages/Create Issue Page/elDescription'), 'As a User, I want to be able to create a new tickets, so that I can keep track all tasks')

WebUI.waitForElementClickable(findTestObject('Test Objects/Pages/Create Issue Page/elCreate'), GlobalVariable.element_timeout)

WebUI.click(findTestObject('Test Objects/Pages/Create Issue Page/elCreate'))

WebUI.waitForElementClickable(findTestObject('Test Objects/Pages/Master Page/elFlag', [('summary') : fixed_summary]), GlobalVariable.element_timeout)

WebUI.click(findTestObject('Test Objects/Pages/Master Page/elFlag', [('summary') : fixed_summary]))

