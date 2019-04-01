package issues
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.When
import io.cucumber.datatable.DataTable
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase



class CreateIssueSteps {

	@When('I create a new issue with provided information:')
	def I_create_a_new_issue_with_provided_information(DataTable dataTable) {
		List<Map<String, String>> data =  dataTable.asMaps();

		WebUI.callTestCase(findTestCase('Test Cases/Web UI Tests/Advance Tests/Pages/Create Issue Page/Create a new issue with provided information'),
				[('project') : data.get(0).get("project"), ('issueType') : data.get(0).get("issue_type"), ('priority') : data.get(0).get("priority"), ('description') : data.get(0).get("description"), ('summary') : data.get(0).get("summary")],
				FailureHandling.STOP_ON_FAILURE)
	}


	@When('The issue is created with correct information:')
	def The_issue_is_created_with_correct_information(DataTable dataTable) {
		List<Map<String, String>> data =  dataTable.asMaps();

		WebUI.callTestCase(findTestCase('Test Cases/Web UI Tests/Advance Tests/Pages/Issue Page/The opening issue displays correct information'),
				[('issue_summary') : data.get(0).get("summary"), ('issue_type') : data.get(0).get("issue_type")], FailureHandling.STOP_ON_FAILURE)
	}
}