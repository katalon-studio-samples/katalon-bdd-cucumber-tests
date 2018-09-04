import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper

WS.verifyElementPropertyValue(response, 'issues[0].fields.project.key', project_key)
WS.verifyElementPropertyValue(response, 'issues[0].fields.issuetype.name', issue_type)
WS.verifyElementPropertyValue(response, 'issues[0].fields.priority.name', priority)
WS.verifyElementPropertyValue(response, 'issues[0].fields.summary', summary)
WS.verifyElementPropertyValue(response, 'issues[0].fields.description', description)


