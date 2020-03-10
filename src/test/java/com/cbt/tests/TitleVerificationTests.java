package com.cbt.tests;
import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerificationTests {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                                          "http://practice.cybertekschool.com/dropdown",
                                          "http://practice.cybertekschool.com/login");
        List<String> titles = new ArrayList<>();
        List<String> actualUrls = new ArrayList<>();

        WebDriver driver = BrowserFactory.getDriver("chrome");
        for(String url : urls){
            driver.get(url);
            titles.add(driver.getTitle());
            actualUrls.add(driver.getCurrentUrl());
        }
        System.out.println("========== Verifying titles ===========");
        StringUtility.verifyEquals(titles.get(0),titles.get(1));
        StringUtility.verifyEquals(titles.get(0),titles.get(2));
        StringUtility.verifyEquals(titles.get(1),titles.get(2));

        System.out.println("========== Verifying urls that starts with http://practice.cybertekschool.com ===========");
        StringUtility.verifyStartsWith(actualUrls.get(0),"http://practice.cybertekschool.com");
        StringUtility.verifyStartsWith(actualUrls.get(1),"http://practice.cybertekschool.com");
        StringUtility.verifyStartsWith(actualUrls.get(2),"http://practice.cybertekschool.com");


        driver.quit();

    }
}
