package com.exadel.reflection_api.utils;

import com.exadel.reflection_api.annotations.PropertyConverter;
import com.exadel.reflection_api.converters.Converters;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:properties/test.properties")
public interface Property extends Config{

    @Key("browser")
//    @ConverterClass(Converters.class)
    String getBrowserName();

    @Key("scope")
    @PropertyConverter(converterClass = Converters.class, converterMethod = "convertScope")
    String getScope();

    @Key("browserVersion")
    @PropertyConverter(converterClass = Converters.class, converterMethod = "convertBrowserVersion")
    String getBrowserVersion();
}
