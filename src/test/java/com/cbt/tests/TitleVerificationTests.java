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

        if (titles.get(0).equals(titles.get(1))){
            System.out.println("Title test Pass. Title is: " + titles.get(0));
        }else {
            System.out.println("Title test Fail");
            System.out.println("title1 = " + titles.get(0));
            System.out.println("title2 = " + titles.get(1));
        }

        if (titles.get(0).equals(titles.get(2))){
            System.out.println("Title test Pass. Title is: " + titles.get(0));
        }else {
            System.out.println("Title test Fail");
            System.out.println("title1 = " + titles.get(0));
            System.out.println("title2 = " + titles.get(2));
        }

        if (titles.get(1).equals(titles.get(2))){
            System.out.println("Title test Pass. Title is: " + titles.get(1));
        }else {
            System.out.println("Title test Fail");
            System.out.println("title1 = " + titles.get(1));
            System.out.println("title2 = " + titles.get(2));
        }



        if (actualUrls.get(0).startsWith("http://practice.cybertekschool.com")){
            System.out.println("URL test PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrls.get(0));
        }

        if (actualUrls.get(1).startsWith("http://practice.cybertekschool.com")){
            System.out.println("URL test PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrls.get(1));
        }

        if (actualUrls.get(2).startsWith("http://practice.cybertekschool.com")){
            System.out.println("URL test PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrls.get(2));
        }


        driver.quit();

    }
}
