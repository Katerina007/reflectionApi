package com.exadel.reflection_api.converters;

public class Converters {

    public static String convertScope(String s) {
        return String.format("Time to start %s testing", s);
    }

    public static String convertBrowser(String s) {
        return String.format("Please choose %s browser", s);
    }

    public static String convertBrowserVersion(String s) {
        return String.format("!Check browser version is %s", s);
    }
}
