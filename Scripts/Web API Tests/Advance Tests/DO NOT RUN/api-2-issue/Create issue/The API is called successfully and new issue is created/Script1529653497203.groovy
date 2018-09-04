import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import static org.assertj.core.api.Assertions.*;


WS.verifyResponseStatusCode(response, 201)

// Response body: Convert to JSON Object
def jsonSlurper = new JsonSlurper()
def jsonResponse = jsonSlurper.parseText(response.getResponseText());

assertThat(jsonResponse.id).isNotEmpty();
assertThat(jsonResponse.key).isNotEmpty();
assertThat(jsonResponse.self).isNotEmpty();