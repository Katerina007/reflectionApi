package com.exadel.reflection_api.converters;

import com.exadel.reflection_api.utils.RuntimeHandler;

public class PropertyConverterHandler implements RuntimeHandler {
    //    FIXME: fix type of parameter
    @Override
    public PropertyConverterMetadata process(Object parameter) {
        return new PropertyConverterMetadata("PropertyConverter", parameter.getClass());
    }
}
