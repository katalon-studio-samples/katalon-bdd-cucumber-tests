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

response = WS.sendRequest(findTestObject('web api/api-2-issue/Get issue/Get an issue with issue Key specified in the URL', 
        [('authorization') : GlobalVariable.authorization, ('URL') : GlobalVariable.URL, ('issue_key') : 'KD-1']))

// Verify response code
WS.verifyResponseStatusCode(response, 200)

// Verify response information
WS.verifyElementPropertyValue(response, 'fields.project.key', 'KD')

WS.verifyElementPropertyValue(response, 'fields.issuetype.name', 'Bug')

WS.verifyElementPropertyValue(response, 'fields.priority.name', 'Low')

WS.verifyElementPropertyValue(response, 'fields.summary', 'REST - Create new issue using API')

WS.verifyElementPropertyValue(response, 'fields.description', 'As a User, I want to be able to create a new tickets, so that I can keep track all tasks')

