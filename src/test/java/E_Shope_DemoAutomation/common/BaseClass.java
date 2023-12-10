package E_Shope_DemoAutomation.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static E_Shope_DemoAutomation.common.Utility.log;

public class BaseClass {
public static Properties properties;
public static WebDriver driver;

    public static WebDriver init() throws IOException {
        properties = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\" + "Demo.properties");
        properties.load(file);
        String browser = properties.getProperty("browser");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            System.out.println(driver);
            driver.manage().window().maximize();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println(driver);
            driver.manage().window().maximize();
        }
        driver.get("https://automationexercise.com/login");
//        Log.info("Browser lunch");
        log("Browser lunch");
        driver.manage().window().maximize();
        return driver;
    }

        public void close() {
            driver.close();
        }
    }

