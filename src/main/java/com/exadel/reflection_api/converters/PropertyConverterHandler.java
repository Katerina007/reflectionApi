package com.exadel.reflection_api.converters;

import com.exadel.reflection_api.converters.PropertyConverterMetadata;
import com.exadel.reflection_api.utils.RuntimeHandler;

public class PropertyConverterHandler implements RuntimeHandler {
//    FIXME
    @Override
    public PropertyConverterMetadata process(Object parameter) {
        return new PropertyConverterMetadata("", Converter.class);
    }
}
