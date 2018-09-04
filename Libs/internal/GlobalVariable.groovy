package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : URL of the Application Under Test (AUT)</p>
     */
    public static Object URL
     
    /**
     * <p>Profile default : A valid account used during the test</p>
     */
    public static Object password
     
    /**
     * <p>Profile default : The password that has been encrypted used during the test</p>
     */
    public static Object encrypted_password
     
    /**
     * <p>Profile default : A valid account used during the test</p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object element_timeout
     
    /**
     * <p></p>
     */
    public static Object ticket_sample
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['URL' : 'https://katalon.atlassian.net', 'password' : '8eml3nBz19rJ6kP8oCYK', 'encrypted_password' : '3q63o6Jj3SJkOvMHtql0qi2TenXgkra+', 'username' : 'demo@katalon.com', 'element_timeout' : 60, 'ticket_sample' : 'Ticket created at 1528442112968'])
        allVariables.put('dev profile', allVariables['default'] + ['username' : 'bella'])
        allVariables.put('qa profile', allVariables['default'] + ['username' : 'tom'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        URL = selectedVariables['URL']
        password = selectedVariables['password']
        encrypted_password = selectedVariables['encrypted_password']
        username = selectedVariables['username']
        element_timeout = selectedVariables['element_timeout']
        ticket_sample = selectedVariables['ticket_sample']
        
    }
}
