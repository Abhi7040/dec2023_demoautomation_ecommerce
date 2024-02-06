package E_Shope_DemoAutomation.AayshaS.pageObject;

import E_Shope_DemoAutomation.common.BaseClass;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static E_Shope_DemoAutomation.common.Utility.*;

public class Registration_PageObject extends BaseClass {

    @FindBy(xpath ="//*[@alt=\"Website for automation practice\"]" )
    public WebElement AutomationExerciseTest;

    @FindBy(xpath ="//*[contains(text(),\"Login to your account\")]" )
    public WebElement LoginText;

    @FindBy(xpath = "//*[contains(text(),\"New User Signup!\")]")
    public WebElement SignUpText;

    @FindBy(xpath = "//*[contains(text(),\"Enter Account Information\")]")
    public WebElement RegistrationPageText;

    @FindBy(xpath = "(//*[@placeholder=\"Email Address\"])[1]")
    public WebElement LoginEmailTextbox;

    @FindBy(xpath = "(//*[@placeholder=\"Email Address\"])[2]")
    public WebElement SignEmailTextbox;

    @FindBy(xpath = "(//*[@placeholder=\"Password\"])[1]")
    public WebElement LoginPasswordTextBox;

    @FindBy(xpath = "(//*[@placeholder=\"Name\"])[1]")
    public WebElement SignNameTextBox;

    @FindBy(xpath = "(//button[contains(text(),\"Login\")])")
    public WebElement LoginBtn;

    @FindBy(xpath = "(//button[contains(text(),\"Signup\")])")
    public WebElement SignupBtn;

    @FindBy(xpath = "//*[contains(text(),'Logout')]")
    public WebElement LogoutBtn;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement registrationPageHeadingText;

    @FindBy(xpath = "//b[text()='Address Information']")
    public WebElement addressInformationHeadingText;

    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement selectTitleMr;

    @FindBy(xpath = "//input[@value='Mrs']")
    public WebElement selectTitleMrs;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameText;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordText;

    @FindBy(xpath = "//select[@name='days']")
    public WebElement selectDay;

    @FindBy(xpath = "//select[@name='months']")
    public WebElement selectMonth;

    @FindBy(xpath = "//select[@name='years']")
    public WebElement selectYear;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement companyName;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement address1;

    @FindBy(xpath = "//input[@name='address2']")
    public WebElement address2;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='zipcode']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='mobile_number']")
    public WebElement mobile_number;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createButton;


    public Registration_PageObject(){
        PageFactory.initElements(driver, this);


    }


    public void verifySignWithInvalidCredential(){
        try {
            Thread.sleep(4000);
            if(SignUpText.isDisplayed()){
                waitForElementVisible(SignNameTextBox);
                SignNameTextBox.sendKeys(properties.getProperty("NewNameInvalid"));
                waitForElementVisible(SignEmailTextbox);
                SignEmailTextbox.sendKeys(properties.getProperty("NewPasswordInvalid"));
            Thread.sleep(3000);
                waitForElementVisible(SignupBtn);
                clickElement(SignupBtn);
                if(!RegistrationPageText.isDisplayed()){
                    log("Login Id Password Invalid ");
                }else {
                  log(RegistrationPageText.getText());
                }
            }

        }catch (Exception e){
            log("Signup not Working"+e);
        }
    }

    public void verifySignupWithValidCredential(){
       try {
           if(SignUpText.isDisplayed()){
               waitForElementVisible(SignNameTextBox);
               SignNameTextBox.clear();
               SignNameTextBox.sendKeys(properties.getProperty("NewNameValid"));
               waitForElementVisible(SignEmailTextbox);
               SignEmailTextbox.clear();
               SignEmailTextbox.sendKeys(properties.getProperty("NewPasswordValid"));
               Thread.sleep(3000);
               waitForElementVisible(SignupBtn);
               clickElement(SignupBtn);
//               if ()
           }

       }catch (Exception e){
           log("Signup not Working"+e);
       }
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
            waitForElementVisible(LoginPasswordTextBox);
            LoginPasswordTextBox.sendKeys(properties.getProperty("password"));
            log("Enter Password");
            Thread.sleep(2000);
            clickElement(LoginBtn);
            log("Login successfully");
            waitForElementVisible(LogoutBtn);
            clickElement(LogoutBtn);


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void  verifyAccountInformation(){
       try {
           waitForElementVisible(registrationPageHeadingText);
           log("Heading Text verify: "+registrationPageHeadingText.getText());
           waitForElementVisible(selectTitleMrs);
           clickElement(selectTitleMrs);
           log("Click on the title name");
           waitForElementVisible(passwordText);
           sendKey(passwordText, properties.getProperty("newPassword"));
           log("Enter the valid password");
           Thread.sleep(3000);
           selectClass(selectDay,"28");
           selectClass(selectMonth,"May");
           selectClass(selectYear,"1995");
           log("Select the DOB");
//           Select day=new Select(selectDay);
//           day.selectByVisibleText("28");

           scrollIntoView(addressInformationHeadingText);
           waitForElementVisible(addressInformationHeadingText);
           log("Heading Text verify: "+addressInformationHeadingText.getText());

           waitForElementVisible(firstName);
            sendKey(firstName,properties.getProperty("first_name"));
           log("Enter the valid firstName");

           waitForElementVisible(lastName);
           sendKey(lastName,properties.getProperty("last_name"));
           log("Enter the valid lastName");

           waitForElementVisible(companyName);
           sendKey(companyName,properties.getProperty("company"));
           log("Enter the valid companyName");

           waitForElementVisible(address1);
           sendKey(address1,properties.getProperty("address"));
           log("Enter the valid address1");

           waitForElementVisible(address2);
           sendKey(address2,properties.getProperty("address2"));
           log("Enter the valid address2");

           waitForElementVisible(country);
           selectClass(country,"india");
           log("Select the country");

           scrollIntoView(createButton);
           Thread.sleep(3000);

           waitForElementVisible(state);
           sendKey(state,properties.getProperty("state"));
           log("Enter the valid state");

           waitForElementVisible(city);
           sendKey(city,properties.getProperty("city"));
           log("Enter the valid city");

           waitForElementVisible(mobile_number);
           sendKey(mobile_number,properties.getProperty("mobileNum"));
           log("Enter the valid mobile_number");

//           waitForElementVisible(createButton);
//           clickElement(createButton);

       }catch (Exception e){

       }
    }

}
