package com.jira.components
import static java.util.concurrent.TimeUnit.*

import org.openqa.selenium.By;
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

class JSelect {

	KeywordLogger log = new KeywordLogger();

	private TestObject oInput;
	private String label;
	private WebElement elInput;
	private WebDriver driver;

	public JSelect(){
	}

	public JSelect(TestObject o) {
		log.logInfo("Init JSelect by TestObject");
		
		this.oInput = o;
		this.elInput = WebUiBuiltInKeywords.findWebElement(oInput);
	}

	public JSelect(String label) {
		log.logInfo("Init JSelect by Label");
		this.label = label;
		driver = DriverFactory.getWebDriver();
		
		WebElement temp = driver.findElement(By.xpath(String.format("//label[starts-with(.,'%s')]", label)));
		String id = temp.getAttribute("for") + "-field"
		this.elInput = driver.findElement(By.xpath(String.format(".//input[@id='%s']", id)));
	}

	public JSelect(WebElement el) {
		log.logInfo("Init JSelect by WebElement");
		this.elInput = el;
	}

	private void openDropDown() {
		log.logInfo("Open dropdown list");
		this.elInput.click();
	}

	private void select(String text) {
		log.logInfo("Selecting item: " + text);
		if (elInput.getAttribute("value").equals(text)) {
			return;
		}
		elInput.sendKeys(text);
		elInput.sendKeys(Keys.ENTER);
	}

	@Keyword
	def selectByText(TestObject o, String optionText) {
		JSelect jselect = new JSelect(o);

		jselect.select(optionText);
	}

	@Keyword
	def selectByText(String labelSelect, String optionText) {
		JSelect jSelect = new JSelect(labelSelect);
		jSelect.select(optionText);
	}

	@Keyword
	def selectByText(WebElement el, String optionText) {
		JSelect jSelect = new JSelect(el);
		jSelect.select(optionText);
	}
}