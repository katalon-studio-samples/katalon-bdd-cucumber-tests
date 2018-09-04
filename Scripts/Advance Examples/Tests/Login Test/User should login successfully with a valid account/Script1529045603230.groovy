import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.jira.utils.JExpectedConditions as JExpectedConditions
import com.jira.utils.JWait as JWait
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
 * The test case verifies that a user can login with a valid account
 *
 * Scenario Outline: Login successfully
 * 
 * Given The Login page is loaded successfully
 * When I login the system with valid <username> and <password>
 * Then The Dashboard Page is loaded successfully
 * 
 *
 * @params
 */
WebUI.callTestCase(findTestCase('Advance Examples/Pages/Login Page/The Login page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Advance Examples/Pages/Login Page/Login with username and password'), [('username') : username
        , ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Advance Examples/Pages/Dashboard Page/The Dashboard Page is loaded successfully'), [:], 
    FailureHandling.STOP_ON_FAILURE)

