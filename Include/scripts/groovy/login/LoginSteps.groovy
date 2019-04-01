package login
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


class LoginSteps {

	@Given('The Login page is loaded successfully')
	def The_Login_page_is_loaded_successfully() {
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Login Page/The Login page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('The Signup Page is opening')
	def The_Signup_Page_is_opening() {
		WebUI.callTestCase(findTestCase('Test Cases/Web UI Tests/Advance Tests/Pages/Signup Page/The Signup page is opening'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Given('I already logged in the system')
	def I_already_logged_in_the_system () {
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Login Page/The Login page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Login Page/Login with username and encrypted password'), [('username') : GlobalVariable.username
			, ('encryptedPassword') : GlobalVariable.encrypted_password], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Dashboard Page/The Dashboard Page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@When('I login the system with valid "(.*)" username and "(.*)" password')
	def I_login_the_system_with_valid_username_password(String username, String password) {
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Login Page/Login with username and password'), [('username') : username
			, ('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I login the system with invalid "(.*)" username and "(.*)" password')
	def I_login_the_system_with_invalid_username(String username, String password) {
		WebUI.callTestCase(findTestCase('Test Cases/Web UI Tests/Advance Tests/Pages/Login Page/Login with invalid username'), [('username') : username
			, ('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I login the system with "(.*)" username and invalid "(.*)" password')
	def I_login_the_system_with_invalid_password(String username, String password) {
		WebUI.callTestCase(findTestCase('Test Cases/Web UI Tests/Advance Tests/Pages/Login Page/Login with invalid password'), [('username') : username
			, ('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('The Dashboard Page is loaded successfully')
	def The_Dashboard_Page_is_loaded_successfully() {
		WebUI.callTestCase(findTestCase('Web UI Tests/Advance Tests/Pages/Dashboard Page/The Dashboard Page is loaded successfully'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then('There is an error message for invalid password: "(.*)"')
	def There_is_an_error_message_for_invalid_password(String error_message) {
		WebUI.callTestCase(findTestCase('Test Cases/Web UI Tests/Advance Tests/Pages/Login Page/Verify password error message for login'), ['error_message': error_message])
	}
}