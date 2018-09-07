import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import io.cucumber.datatable.DataTable

import static org.assertj.core.api.Assertions.*


class CommonAPISteps {
	static response
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given('^The Jira System is available$')
	def the_jira_system_is_available() {
		WS.callTestCase(findTestCase('Web API Tests/Common/The Jira System is available'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When('^I get information of an issue with Id "(.*)"$')
	def get_info_of_an_issue_with_id(String id) {
		response = WS.callTestCase(findTestCase('Web API Tests/api-2-issue/Get issue/Get issue with Key'), [('issue_key') : id], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('^I get response code "(.*)"$')
	def get_reponse_code(String code) {
		WS.verifyResponseStatusCode(response, code as Integer)
	}

	@Then('^The issue information as below:$')
	def the_issue_information_as_below(DataTable data) {
		List<Map<String, String>> issue_info = data.asMaps(String.class, String.class);
		println issue_info[0]

		// Verify project information
		WS.verifyElementPropertyValue(response, 'fields.project.key', issue_info[0].project_key)

		// Verify issue information
		WS.verifyElementPropertyValue(response, 'fields.summary', issue_info[0].summary)
		WS.verifyElementPropertyValue(response, 'fields.priority.name', issue_info[0].priority)
		WS.verifyElementPropertyValue(response, 'fields.issuetype.name', issue_info[0].issue_type)

	}
}