package E_Shope_DemoAutomation.AbhishekD.pageObject;


import E_Shope_DemoAutomation.common.BaseClass;
import E_Shope_DemoAutomation.utils.log.Log;
import org.testng.annotations.Test;

public class LoginLogoutPageObject extends BaseClass {
//WebDriver driver;
@Test
    public void initialization() throws Exception {
//    WebDriverManager.chromedriver().setup();
//    driver = new ChromeDriver();
//    System.out.println(driver);
         init();
        driver.get("https://automationexercise.com/login");
    Log.info("Browser lunch");
        driver.manage().window().maximize();
    }
}
