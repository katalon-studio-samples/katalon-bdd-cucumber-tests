package issues
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
import io.cucumber.datatable.DataTable


class IssueSteps {

	@When('^I get information of an issue with Id "(.*)"$')
	def get_info_of_an_issue_with_id(String id) {
		GlobalVariable.latest_response = WS.callTestCase(findTestCase('Test Cases/Web API Tests/Advance Tests/DO NOT RUN/api-2-issue/Get issue/Get issue with Key'), [('issue_key') : id], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('^The issue information as below:$')
	def the_issue_information_as_below(DataTable data) {
		List<Map<String, String>> issue_info = data.asMaps(String.class, String.class);

		// Verify project information
		WS.verifyElementPropertyValue(GlobalVariable.latest_response, 'fields.project.key', issue_info[0].project_key)

		// Verify issue information
		WS.verifyElementPropertyValue(GlobalVariable.latest_response, 'fields.summary', issue_info[0].summary)
		WS.verifyElementPropertyValue(GlobalVariable.latest_response, 'fields.priority.name', issue_info[0].priority)
		WS.verifyElementPropertyValue(GlobalVariable.latest_response, 'fields.issuetype.name', issue_info[0].issue_type)

	}
}