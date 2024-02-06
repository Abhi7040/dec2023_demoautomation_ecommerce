package E_Shope_DemoAutomation.common;

import E_Shope_DemoAutomation.utils.ExtentReport.ExtentTestManager;
import E_Shope_DemoAutomation.utils.log.Log;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static E_Shope_DemoAutomation.utils.ExtentReport.ExtentTestManager.startTest;

public class Utility extends BaseClass {
   public static Actions actions;
  public static  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

  public static void waitForElementVisible(WebElement element){

      wait.until(ExpectedConditions.visibilityOf(element));
  }

    public static void waitForElementClickable(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void doubleClick(WebElement element){
      waitForElementVisible(element);
      actions.doubleClick(element).build().perform();
    }

    public static void log(String log){
        startTest(Status.INFO.name(),log);
//        ExtentTestManager.test.log(Status.INFO,log);
        Log.info(log);
    }

    public static void selectClass(WebElement element,String value){
        Select select=new Select(element);
        select.selectByVisibleText(value);

    }

    public static void navigateBack(){
      driver.navigate().back();
//      driver.getCurrentUrl();
    }

    public static void clickElement(WebElement element){
      waitForElementVisible(element);
        element.click();
    }

    public static void scrollIntoView(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }


    public static void sendKey(WebElement element,String value){
        element.sendKeys(value);
    }
}
