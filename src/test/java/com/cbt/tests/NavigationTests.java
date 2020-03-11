package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class NavigationTests {
    public static void navigation(String browser){
        WebDriver driver = BrowserFactory.getDriver(browser);
        driver.get("https://www.google.com/");

        String titleGoogle = driver.getTitle();

        driver.get("https://www.etsy.com/");
        String titleEtsy = driver.getTitle();

        driver.navigate().back();

        String expectedTitle = titleGoogle;
        String actualTitle = driver.getTitle();
        System.out.println("7. Verify that title is same is in step 3");
        StringUtility.verifyEquals(expectedTitle,actualTitle);

        driver.navigate().forward();

        expectedTitle = titleEtsy;
        actualTitle = driver.getTitle();
        System.out.println("9. Verify that title is same is in step 5");
        StringUtility.verifyEquals(expectedTitle,actualTitle);

        driver.quit();
    }

    public static void main(String[] args) {
        List<String> browsers = Arrays.asList("chrome", "firefox", "safari");
        for(String browser : browsers){
            navigation(browser);
        }
    }
}
