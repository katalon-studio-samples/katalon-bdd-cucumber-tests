import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper


def jsonSlurper = new JsonSlurper()
def jsonResponse = jsonSlurper.parseText(response.getResponseText())
println jsonResponse

WS.verifyElementPropertyValue(response, 'issues[0].fields.project.key', project_key)
WS.verifyElementPropertyValue(response, 'issues[0].fields.issuetype.name', issue_type)
WS.verifyElementPropertyValue(response, 'issues[0].fields.priority.name', priority)
WS.verifyElementPropertyValue(response, 'issues[0].fields.summary', summary)
WS.verifyElementPropertyValue(response, 'issues[0].fields.description', description)
