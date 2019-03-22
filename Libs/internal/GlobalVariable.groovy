package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


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
     
    /**
     * <p></p>
     */
    public static Object authorization
     
    /**
     * <p></p>
     */
    public static Object latest_response
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            URL = selectedVariables['URL']
            password = selectedVariables['password']
            encrypted_password = selectedVariables['encrypted_password']
            username = selectedVariables['username']
            element_timeout = selectedVariables['element_timeout']
            ticket_sample = selectedVariables['ticket_sample']
            authorization = selectedVariables['authorization']
            latest_response = selectedVariables['latest_response']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
