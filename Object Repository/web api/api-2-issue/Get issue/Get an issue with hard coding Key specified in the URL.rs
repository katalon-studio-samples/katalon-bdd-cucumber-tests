<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get an issue with hard coding Key specified in the URL</name>
   <tag></tag>
   <elementGuidId>47d3e0ac-5268-4b7d-a75b-87b535c9c1f4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic dHJvbmdidWlAa21zLXRlY2hub2xvZ3kuY29tOkJBR1J5QWZ1UmV2dTB4clhkclpMNkVDRA==</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://katalon.atlassian.net/rest/api/2/issue/KD-1?filter=issueTypes</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

WS.verifyElementsCount(response, 'issues', 6)
WS.verifyEqual(jsonResponse.issues.size, 6)

assertThat(jsonResponse.issues.size).isEqualTo(6)
assertThat(jsonResponse.issues).hasSize(6)

WS.verifyGreaterThan(jsonResponse.issues.size, 5)
assertThat(jsonResponse.issues.size).isGreaterThan(5)

assertThat(jsonResponse.issues.size).isBetween(5,7)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
