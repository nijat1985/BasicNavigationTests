package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
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

            if (actualUrls.get(0).contains(titles.get(0))) {
                System.out.println("PASS for --> " + actualUrls.get(0));
            } else {
                System.out.println("FAIL");
                System.out.println("titles = " + titles.get(0));
                System.out.println("actualUrls = " + actualUrls.get(0));
            }

            if (actualUrls.get(1).contains(titles.get(1))) {
                System.out.println("PASS for --> " + actualUrls.get(1));
            } else {
                System.out.println("FAIL");
                System.out.println("titles = " + titles.get(1));
                System.out.println("actualUrls = " + actualUrls.get(1));
            }

            if (actualUrls.get(2).contains(titles.get(2))) {
                System.out.println("PASS for --> " + actualUrls.get(2));
            } else {
                System.out.println("FAIL");
                System.out.println("titles = " + titles.get(2));
                System.out.println("actualUrls = " + actualUrls.get(2));
            }

            if (actualUrls.get(3).contains(titles.get(3))) {
                System.out.println("PASS for --> " + actualUrls.get(3));
            } else {
                System.out.println("FAIL");
                System.out.println("titles = " + titles.get(3));
                System.out.println("actualUrls = " + actualUrls.get(3));
            }

            driver.quit();
        }
    }
}
