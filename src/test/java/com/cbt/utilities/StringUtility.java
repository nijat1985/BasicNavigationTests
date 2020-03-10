package com.cbt.utilities;

public class StringUtility {
    public static void verifyEquals(String expected, String actual){
        if (actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
    }


    public static void verifyContains(String url, String title){
        if (url.contains(title)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("title: " + title);
            System.out.println("url: " + url);
        }
    }


    public static void verifyStartsWith(String url, String text){
        if (url.startsWith(text)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("text = " + text);
            System.out.println("url = " + url);
        }
    }

}
