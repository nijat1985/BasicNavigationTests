package com.cbt.tests;
import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                                          "https://wayfair.com",
                                          "https://www.westelm.com",
                                          "https://www.walmart.com");
        List<String> titles = new ArrayList<>();
        List<String> actualUrls = new ArrayList<>();

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for(String url: urls){
            driver.get(url);
            titles.add(driver.getTitle().toLowerCase().replace(" ",""));
            actualUrls.add(driver.getCurrentUrl().toLowerCase().replace(" ", ""));
        }

        StringUtility.verifyContains(actualUrls.get(0), titles.get(0));
        StringUtility.verifyContains(actualUrls.get(1), titles.get(1));
        StringUtility.verifyContains(actualUrls.get(2), titles.get(2));
        StringUtility.verifyContains(actualUrls.get(3), titles.get(3));

        driver.quit();

    }
}
