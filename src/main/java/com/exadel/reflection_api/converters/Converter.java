package com.exadel.reflection_api.converters;

public class Converter {

    public String convertScope(String s) {
        return String.format("Time to start %s testing", s);
    }

    public String convertBrowser(String s) {
        return String.format("Please choose %s browser", s);
    }

    public String convertBrowserVersion(String s) {
        return String.format("!Check browser version is %s", s);
    }
}
