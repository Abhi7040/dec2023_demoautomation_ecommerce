package E_Shope_DemoAutomation.AayshaS.Test;

import E_Shope_DemoAutomation.AayshaS.pageObject.LoginLogoutPageObject;
import E_Shope_DemoAutomation.AayshaS.pageObject.Registration_PageObject;
import E_Shope_DemoAutomation.common.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static E_Shope_DemoAutomation.common.Utility.log;
import static E_Shope_DemoAutomation.utils.ExtentReport.ExtentTestManager.startTest;

public class RegistrationPageObject_Test extends BaseClass {
    public Registration_PageObject registrationPageObject;

    @BeforeTest
    public void Initialization() throws IOException {
        init();
        registrationPageObject=new Registration_PageObject();
    }

    @Test
    public void VerifySignUp(Method method){
        startTest(method.getName(), "Testing Verify SignUp");
        log("==================================================");
//        registrationPageObject.loginWithValidCredential();
        registrationPageObject.verifySignWithInvalidCredential();
        registrationPageObject.verifySignupWithValidCredential();
        registrationPageObject.verifyAccountInformation();

    }
}
