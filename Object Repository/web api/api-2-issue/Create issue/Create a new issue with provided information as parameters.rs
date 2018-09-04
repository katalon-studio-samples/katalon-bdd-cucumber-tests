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
      <value>Basic dHJvbmdidWlAa21zLXRlY2hub2xvZ3kuY29tOkJBR1J5QWZ1UmV2dTB4clhkclpMNkVDRA==</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://katalon.atlassian.net/rest/api/2/issue/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
