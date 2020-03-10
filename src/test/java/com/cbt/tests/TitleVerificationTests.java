package com.cbt.tests;
import com.cbt.utilities.BrowserFactory;
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

        if (titles.get(0).equals(titles.get(1)) && titles.get(1).equals(titles.get(2))){
            System.out.println("Pass - all 3 titles are same");
        }else {
            System.out.println("Fail");
            System.out.println("titles = " + titles.toString());
        }

        if (actualUrls.get(0).startsWith("http://practice.cybertekschool.com")
            && actualUrls.get(1).startsWith("http://practice.cybertekschool.com")
            && actualUrls.get(2).startsWith("http://practice.cybertekschool.com")){
            System.out.println("PASS - all 3 URLs starts with --> http://practice.cybertekschool.com");
        }else {
            System.out.println("FAIL");
            System.out.println("actualUrls = " + actualUrls.toString());
        }

        driver.quit();

    }
}
