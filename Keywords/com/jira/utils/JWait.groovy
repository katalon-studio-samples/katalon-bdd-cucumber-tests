package com.jira.utils

import static java.util.concurrent.TimeUnit.*

import org.openqa.selenium.NotFoundException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.FluentWait
import org.openqa.selenium.support.ui.Wait

import internal.GlobalVariable


public class JWait {

	private WebDriver driver;
	private Wait<WebDriver> wait;

	public JWait(WebDriver web_driver) {
		driver = web_driver;
		wait = new FluentWait<>(driver)
				.withTimeout(GlobalVariable.element_timeout, SECONDS)
				.pollingEvery(1, SECONDS)
				.ignoring(NotFoundException.class)
				.withMessage("Waiting for... ");
	}

	public Wait<WebDriver> getWait() {
		return wait;
	}
}
