package common
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


class CommonAPISteps {

	@Given('^The Jira System is available$')
	def the_jira_system_is_available() {
		WS.callTestCase(findTestCase('Web API Tests/Common/The Jira System is available'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('^I get response code "(.*)"$')
	def get_response_code(String code) {
		WS.verifyResponseStatusCode(GlobalVariable.latest_response, code as Integer)
	}
}


