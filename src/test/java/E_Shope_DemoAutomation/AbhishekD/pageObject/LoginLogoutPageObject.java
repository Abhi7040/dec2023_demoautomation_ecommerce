package E_Shope_DemoAutomation.AbhishekD.pageObject;

import E_Shope_DemoAutomation.AbhishekD.common.BaseClass;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.io.IOException;

public class LoginLogoutPageObject {
WebDriver driver;
@Test
    public void initialization() throws IOException {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    System.out.println(driver);
       // driver = BaseClass.init();
        driver.get("https://automationexercise.com/login");
        driver.manage().window().maximize();
    }
}
