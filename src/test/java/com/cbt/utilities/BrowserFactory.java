package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browserType){
        browserType = browserType.toLowerCase();
        WebDriver driver;
        switch (browserType){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "safari":
                if (System.getProperty("os.name").equals("Mac OS X")){
                    driver = new SafariDriver();
                }else {
                    driver = null;
                }

                break;
            case "edge":
                if (System.getProperty("os.name").equals("Windows 10")){
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }else{
                    driver = null;
                }
                break;
            default:
                driver = null;
        }
        return driver;
    }
}
