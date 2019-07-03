package com.exadel.reflection_api.converters;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PropertyConverterMetadata {
    private String annotationName;
    private Class annotationClass;
}
