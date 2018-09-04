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
 *
 * @author
 *
 * This is a work-flow test case, which inputs username, password and clicks the login button.
 * The expected result will be on another test case which verifying the login action
 *
 * Given The Jira login page is opening
 * When  I input an account into login form
 * and   I click the Login button
 *
 * @params
 * username: username of the login account
 * encryptedPassword: encrypted password of the login account 
 */

WebUI.setText(findTestObject('Test Objects/Pages/Login Page/elUsername'), username)

WebUI.click(findTestObject('Test Objects/Pages/Login Page/elContinue'))

WebUI.setText(findTestObject('Test Objects/Pages/Login Page/elEmail'), username)

WebUI.click(findTestObject('Test Objects/Pages/Login Page/elNext'))

WebUI.setEncryptedText(findTestObject('Test Objects/Pages/Login Page/elPassword'), encryptedPassword)

WebUI.click(findTestObject('Test Objects/Pages/Login Page/elSignin'))

WebUI.click(findTestObject('Test Objects/Pages/Login Page/elYes'))