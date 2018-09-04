package com.jira.utils

import java.util.function.Function;

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement

import com.kms.katalon.core.logging.KeywordLogger

public class JExpectedConditions {

	public static KeywordLogger log = new KeywordLogger();

	public static Function<WebDriver, Boolean> readyStateShouldBe(final String state) {
		//state: complete
		return new Function<WebDriver, Boolean>() {
					@Override
					public Boolean apply(WebDriver webDriver) {
						try {
							return ((JavascriptExecutor) webDriver).executeScript("return document.readyState").toString().equals(state);
						} catch (Exception e) {
							return false;
						}
					}

					@Override
					public String toString() {
						return "Verify PageLoaded via readySate";
					}
				};
	}

	public static Function<WebDriver, WebElement> presenceOfElementLocatedBy(final By locator) {
		return new Function<WebDriver, WebElement>() {
					@Override
					public WebElement apply(WebDriver webDriver) {
						int n = 0;
						try {
							log.logInfo("Finding element")
							return webDriver.findElement(locator);
						} catch (Exception e) {
							n++;
							log.logInfo("Exception.... " + n)
							return null;
						}
					}

					@Override
					public String toString() {
						return "presence of element located by: " + locator;
					}
				};
	}
}
