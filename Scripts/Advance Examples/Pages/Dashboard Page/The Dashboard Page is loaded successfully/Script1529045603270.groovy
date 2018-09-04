import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.jira.utils.JExpectedConditions
import com.jira.utils.JWait
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


WebUI.waitForElementVisible(findTestObject('Test Objects/Pages/Dashboard Page/elHeader'), GlobalVariable.element_timeout)

//JWait.wait.until(JExpectedConditions.readyStateShouldBe('complete'))

WebUI.verifyTextPresent('System dashboard', false)