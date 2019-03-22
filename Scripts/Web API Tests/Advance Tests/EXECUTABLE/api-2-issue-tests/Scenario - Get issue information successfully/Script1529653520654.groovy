import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

def response = WebUI.callTestCase(findTestCase('Test Cases/Web API Tests/Advance Tests/DO NOT RUN/api-2-issue/Get issue/I use API to get the issue information'), [('authorization') : GlobalVariable.authorization, ('issue_key') : issue_key], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Web API Tests/Advance Tests/DO NOT RUN/api-2-issue/Get issue/I could get correct information of the issue'), [('authorization') : GlobalVariable.authorization, ('response') : response
        , ('project_key') : project_key, ('issue_type') : issue_type, ('priority') : priority, ('summary') : summary, ('description') : description], FailureHandling.STOP_ON_FAILURE)

