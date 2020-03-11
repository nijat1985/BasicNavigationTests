package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com",
                "https://www.westelm.com",
                "https://www.walmart.com");
        List<String> titles = new ArrayList<>();
        List<String> actualUrls = new ArrayList<>();
        List<String> browsers = Arrays.asList("chrome", "firefox", "safari");

        WebDriver driver;
        for (String browser : browsers) {
            driver = BrowserFactory.getDriver(browser);
            for (String url : urls) {
                driver.get(url);
                titles.add(driver.getTitle().toLowerCase().replace(" ", ""));
                actualUrls.add(driver.getCurrentUrl().toLowerCase().replace(" ", ""));
            }
            System.out.println("===========" + browser + "==========");
            System.out.println("4. Verify that URL of the website contains the title of the website. Ignore spaces and case in comparison.");
            StringUtility.verifyContains(actualUrls.get(0), titles.get(0));
            System.out.println("4. Verify that URL of the website contains the title of the website. Ignore spaces and case in comparison.");
            StringUtility.verifyContains(actualUrls.get(1), titles.get(1));
            System.out.println("4. Verify that URL of the website contains the title of the website. Ignore spaces and case in comparison.");
            StringUtility.verifyContains(actualUrls.get(2), titles.get(2));
            System.out.println("4. Verify that URL of the website contains the title of the website. Ignore spaces and case in comparison.");
            StringUtility.verifyContains(actualUrls.get(3), titles.get(3));

            driver.quit();
        }
    }
}
