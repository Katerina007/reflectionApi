package com.exadel.reflection_api.utils;

import com.exadel.reflection_api.annotations.PropertyConverter;
import com.exadel.reflection_api.converters.Converter;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:properties/test.properties")
public interface Property {

    @Config.Key("scope")
    @PropertyConverter(converterClass = Converter.class, converterMethod = "convertScope")
    String getScope();

    @Config.Key("browser")
    @PropertyConverter(converterClass = Converter.class, converterMethod = "convertBrowser")
    String getBrowserName();

    @Config.Key("browserVersion")
    @PropertyConverter(converterClass = Converter.class, converterMethod = "convertBrowserVersion")
    String getBrowserVersion();
}
