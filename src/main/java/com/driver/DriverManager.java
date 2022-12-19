package com.driver;

import com.constants.FrameworkConstants;
import com.enums.ConfigProperties;
import com.factories.BrowserFactory;
import com.utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Objects;

public class DriverManager {

    private static WebDriver driver=null;
    private DriverManager(){

    }
    public static void setup() {
        if (Objects.isNull(driver)) {
            driver = BrowserFactory.setBrowser();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FrameworkConstants.getPageLoadTime()));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.getImplicitWait()));
            driver.get(PropertyUtils.getValue(ConfigProperties.URL));
        }
    }
    public static void unloadDriver(){
        if(Objects.nonNull(driver)){
            driver.quit();
            driver=null;
        }
    }
    public static WebDriver getDriver(){
        return driver;

    }

}
