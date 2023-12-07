package E_Shope_DemoAutomation.AbhishekD.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
public static Properties properties;
public static WebDriver driver;
    public static WebDriver init() throws IOException {
        properties = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "src/main/resources/" + "Demo.properties.properties");
        properties.load(file);
        String browser = properties.getProperty("browser");
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println(driver);
            driver.manage().window().maximize();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println(driver);
            driver.manage().window().maximize();
        }
        return driver;
    }
        public void close() {
            driver.close();
        }
    }

