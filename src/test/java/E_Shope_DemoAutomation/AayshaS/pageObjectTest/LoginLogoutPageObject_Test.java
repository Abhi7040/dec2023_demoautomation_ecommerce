package E_Shope_DemoAutomation.AayshaS.pageObjectTest;

import E_Shope_DemoAutomation.AayshaS.pageObject.LoginLogoutPageObject;
import E_Shope_DemoAutomation.common.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import static E_Shope_DemoAutomation.common.Utility.log;
import static E_Shope_DemoAutomation.utils.ExtentReport.ExtentTestManager.startTest;


public class LoginLogoutPageObject_Test extends BaseClass {
public LoginLogoutPageObject loginLogoutPageObject;
    @BeforeTest
    public void Initialization() throws IOException {
        init();
        loginLogoutPageObject=new LoginLogoutPageObject();
    }

    @Test
    public void VerifyLoginLogout(Method method){
        startTest(method.getName(), "Testing Verify LoginLogout");
        log("==================================================");
        loginLogoutPageObject.loginWithValidCredential();

    }


}
