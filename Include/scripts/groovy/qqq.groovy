import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class qqq {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to write a step with (.*)")
	def I_want_to_write_a_step_with_name(String name) {
		println name
	}

	@When("I check for the (\\d+) in step")
	def I_check_for_the_value_in_step(int value) {
		println value
	}

	@Then("I verify the (.*) in step")
	def I_verify_the_status_in_step(String status) {
		println status
	}
	
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to Cura System homepage")
	def I_navigate_to_Cura_System_homepage() {
		WebUI.openBrowser("http://demoaut.katalon.com")
		//WebUI.waitForPageLoad(30)
	}

	@When("I click Make Appointment button")
	def I_click_makeAppointment_button() {
		WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))
	}

	@And("I enter username (.*) and password (.*)")
	def I_enter_valid_username_password(String username, String password) {

		WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_userName'), username)

		WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), password)
	}

	@Then("I click Log in button. I should be able to login successfully")
	def I_login_successfully() {
		WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
		WebUI.verifyTextPresent('Make Appointment', false)
		WebUI.closeBrowser()
	}

	@And("I enter an invalid username (.*) and password (.*)")
	def I_enter_invalid_username_password(String username, String password) {

		WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_userName'), username)

		WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), password)
	}

	@Then("I click Log in button. I should NOT be able to login successfully")
	def I_login_unsuccessfully() {
		WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
		WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)
		WebUI.closeBrowser()
	}
}