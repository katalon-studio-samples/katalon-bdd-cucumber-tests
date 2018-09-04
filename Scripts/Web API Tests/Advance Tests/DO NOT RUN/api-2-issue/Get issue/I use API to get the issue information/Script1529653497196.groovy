import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper as JsonSlurper

response = WS.sendRequest(findTestObject('web api/api-2-search/Search issues/Search issues by issue key as parameter', [('issue_key'):issue_key]))

WS.verifyResponseStatusCode(response, 200)

return response

