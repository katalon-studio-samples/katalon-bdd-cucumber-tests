<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Search issues by jql with hard coding test data</name>
   <tag></tag>
   <elementGuidId>5330776f-e80d-49ef-ae20-4aa64558f731</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;jql\&quot;: \&quot;issueKey \u003d KD-1\&quot;,\n    \&quot;startAt\&quot;: 0,\n    \&quot;maxResults\&quot;: 15,\n    \&quot;fields\&quot;: [\n        \&quot;summary\&quot;,\n        \&quot;status\&quot;,\n        \&quot;issuetype\&quot;,\n        \&quot;assignee\&quot;,\n        \&quot;project\&quot;,\n        \&quot;priority\&quot;,\n        \&quot;description\&quot;\n    ]\n}\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${authorization}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://katalon.atlassian.net/rest/api/2/search?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.authorization</defaultValue>
      <description></description>
      <id>215e2605-3a67-4904-b318-5b51e5406680</id>
      <masked>false</masked>
      <name>authorization</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

def jsonSlurper = new JsonSlurper()
def jsonResponse = jsonSlurper.parseText(response.getResponseText())

// Verify issue key
WS.verifyElementPropertyValue(response, 'issues[0].key', 'KD-1')

// Verify project information
WS.verifyElementPropertyValue(response, 'issues[0].fields.project.key', 'KD')
WS.verifyElementPropertyValue(response, 'issues[0].fields.project.name', 'Katalon-Demo')

// Verify issue information
WS.verifyElementPropertyValue(response, 'issues[0].fields.summary', 'REST - Create new issue using API')
WS.verifyElementPropertyValue(response, 'issues[0].fields.description', 'As a User, I want to be able to create a new tickets, so that I can keep track all tasks')
WS.verifyElementPropertyValue(response, 'issues[0].fields.issuetype.name', 'Bug')
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
