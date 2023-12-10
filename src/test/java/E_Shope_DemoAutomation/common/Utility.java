package E_Shope_DemoAutomation.common;

import E_Shope_DemoAutomation.utils.log.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility extends BaseClass {
  public static  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

  public static void waitForElementVisible(WebElement element){
      wait.until(ExpectedConditions.visibilityOf(element));
  }

    public static void waitForElementClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void log(String ele){

        Log.info(ele);
    }

    public static void clickElement(WebElement element){
      waitForElementVisible(element);
        element.click();
    }


    public static void sendKey(WebElement element,String value){
        element.sendKeys(value);
    }
}
