import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable

def response = WS.sendRequest(findTestObject('web api/api-2-issue/Create issue/Create a new issue with provided information as parameters', 
        [('authorization') : GlobalVariable.authorization, ('project_key') : project_key, ('summary') : summary
            , ('description') : description, ('issue_type') : issue_type, ('priority') : priority]))

return response

