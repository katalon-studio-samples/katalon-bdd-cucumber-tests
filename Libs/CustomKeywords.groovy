
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.WebElement


def static "com.jira.components.JSelect.selectByText"(
    	TestObject container	
     , 	TestObject o	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	container
         , 	o
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	TestObject container	
     , 	String labelSelect	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	container
         , 	labelSelect
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	TestObject container	
     , 	WebElement el	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	container
         , 	el
         , 	optionText)
}
