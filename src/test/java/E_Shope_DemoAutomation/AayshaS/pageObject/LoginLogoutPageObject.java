package E_Shope_DemoAutomation.AayshaS.pageObject;


import E_Shope_DemoAutomation.common.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static E_Shope_DemoAutomation.common.Utility.*;

public class LoginLogoutPageObject extends BaseClass {

    @FindBy(xpath ="//*[@alt=\"Website for automation practice\"]" )
    public WebElement AutomationExerciseTest;

    @FindBy(xpath ="//*[contains(text(),\"Login to your account\")]" )
    public WebElement LoginText;

    @FindBy(xpath = "(//*[@placeholder=\"Email Address\"])[1]")
    public WebElement LoginEmailTextbox;

    @FindBy(xpath = "(//*[@placeholder=\"Email Address\"])[2]")
    public WebElement SignEmailTextbox;

    @FindBy(xpath = "(//*[@placeholder=\"Password\"])[1]")
    public WebElement LoginPasswordTextbox;

    @FindBy(xpath = "(//*[@placeholder=\"Password\"])[2]")
    public WebElement SignPasswordTextbox;

    @FindBy(xpath = "(//button[contains(text(),\"Login\")])")
    public WebElement LoginBtn;

    @FindBy(xpath = "(//button[contains(text(),\"Signup\")])")
    public WebElement SignupBtn;

    public LoginLogoutPageObject(){
        PageFactory.initElements(driver, this);
    }

    public void loginWithValidCredential(){
        try{
           Thread.sleep(3000);
           waitForElementVisible(AutomationExerciseTest);
           if( AutomationExerciseTest.isDisplayed()) {
               waitForElementVisible(LoginText);
               log("Log the account :" + LoginText);
           }
           waitForElementVisible(LoginEmailTextbox);
            LoginEmailTextbox.sendKeys(properties.getProperty("email"));
            log("Enter EmailId ");
            waitForElementVisible(LoginPasswordTextbox);
            LoginPasswordTextbox.sendKeys(properties.getProperty("password"));
            log("Enter Password");
            Thread.sleep(2000);
            clickElement(LoginBtn);


        }catch (Exception e){
           e.printStackTrace();
        }
    }



//    @Test
//    public void initialization() throws Exception {
////    WebDriverManager.chromedriver().setup();
////    driver = new ChromeDriver();
////    System.out.println(driver);
//        init();
//        driver.get("https://automationexercise.com/login");
////        Log.info("Browser lunch");
//        log("Browser lunch");
//        driver.manage().window().maximize();
////        clickElement();
//    }
}
