package com.factories;

import com.enums.ConfigProperties;
import com.utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    private BrowserFactory(){

    }
    public static WebDriver setBrowser(){
        WebDriver driver;
        String browser= PropertyUtils.getValue(ConfigProperties.BROWSER);
        switch (browser) {
            case "chrome":
                driver=WebDriverManager.chromedriver().create();
                break;
            case "firefox":
                driver=WebDriverManager.firefoxdriver().create();
                break;
            default:
                throw new RuntimeException("Browser is not set properly");
        }
        return driver;
    }
}
