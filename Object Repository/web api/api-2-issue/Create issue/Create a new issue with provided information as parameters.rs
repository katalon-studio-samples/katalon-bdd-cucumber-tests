<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create a new issue with provided information as parameters</name>
   <tag></tag>
   <elementGuidId>a19c8973-26a5-48e1-af51-96e5259f3731</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;fields\&quot;: {\n       \&quot;project\&quot;:\n       { \n          \&quot;key\&quot;: \&quot;${project_key}\&quot;\n       },\n       \&quot;summary\&quot;: \&quot;${summary}\&quot;,\n       \&quot;description\&quot;: \&quot;${description}\&quot;,\n       \&quot;issuetype\&quot;: {\n          \&quot;name\&quot;: \&quot;${issue_type}\&quot;\n       },\n       \&quot;priority\&quot;:{\n          \&quot;name\&quot;: \&quot;${priority}\&quot;\n       }\n   }\n}&quot;,
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
   <restUrl>https://katalon.atlassian.net/rest/api/2/issue/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.authorization</defaultValue>
      <description></description>
      <id>1e542fca-37d7-472a-96e6-c8e1b345d564</id>
      <masked>false</masked>
      <name>authorization</name>
   </variables>
   <variables>
      <defaultValue>'KD'</defaultValue>
      <description></description>
      <id>46a65413-78bd-4c16-ac9a-0116048ed518</id>
      <masked>false</masked>
      <name>project_key</name>
   </variables>
   <variables>
      <defaultValue>'This is default summary'</defaultValue>
      <description></description>
      <id>ee83bd9a-c177-4fae-a59e-92a5c68c42cb</id>
      <masked>false</masked>
      <name>summary</name>
   </variables>
   <variables>
      <defaultValue>'This is default description'</defaultValue>
      <description></description>
      <id>f93e3001-fbd8-4d81-83f9-af99633cac99</id>
      <masked>false</masked>
      <name>description</name>
   </variables>
   <variables>
      <defaultValue>'Bug'</defaultValue>
      <description></description>
      <id>3df20cd9-1fd7-47a2-a036-34d38ff0bd38</id>
      <masked>false</masked>
      <name>issue_type</name>
   </variables>
   <variables>
      <defaultValue>'Low'</defaultValue>
      <description></description>
      <id>f1ef15fb-9595-41b4-9bd5-ad4ff7d3c498</id>
      <masked>false</masked>
      <name>priority</name>
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

WS.verifyResponseStatusCode(response, 201)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
