<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create a new issue with hard coding test data</name>
   <tag></tag>
   <elementGuidId>6a4a26cf-7e83-4209-9f93-01e7d875ec09</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;fields\&quot;: {\n       \&quot;project\&quot;:\n       { \n          \&quot;key\&quot;: \&quot;KD\&quot;\n       },\n       \&quot;summary\&quot;: \&quot;REST - Create new issue using API\&quot;,\n       \&quot;description\&quot;: \&quot;Creating of an issue using project keys and issue type names using the REST API\&quot;,\n       \&quot;issuetype\&quot;: {\n          \&quot;name\&quot;: \&quot;Story\&quot;\n       },\n       \&quot;priority\&quot;:{\n          \&quot;name\&quot;: \&quot;High\&quot;\n       }\n   }\n}&quot;,
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
