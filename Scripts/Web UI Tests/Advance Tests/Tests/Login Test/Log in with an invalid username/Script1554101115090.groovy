import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Login Page/The Login page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)

def invalid_username = GlobalVariable.username + "123"

WebUI.callTestCase(findTestCase('Test Cases/Web UI Tests/Advance Tests/Pages/Login Page/Login with invalid username'), [('username') : invalid_username
		  , ('encryptedPassword') : GlobalVariable.encrypted_password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Web UI Tests/Advance Tests/Pages/Signup Page/The Signup page is opening'), [:], FailureHandling.STOP_ON_FAILURE)
