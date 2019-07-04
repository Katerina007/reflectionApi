package com.exadel.reflection_api.utils;

import lombok.SneakyThrows;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.aeonbits.owner.Converter;
import org.aeonbits.owner.loaders.Loader;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Properties;

public class PropertyFactory {

    ConfigFactory configFactory;

    void newInstance() {
        ConfigFactory.newInstance();
    }

    <T extends Config> T create(Class<? extends T> clazz, Map<?, ?>... imports) {
        return ConfigFactory.create(clazz, imports);
    }

    void setProperty(String key, String value) {
        ConfigFactory.setProperty(key, value);
    }

    Properties getProperties() {
        return ConfigFactory.getProperties();
    }

    void setProperties(Properties properties) {
        ConfigFactory.setProperties(properties);
    }

    String getProperty(String key) {
        return ConfigFactory.getProperty(key);
    }

    void clearProperty(String key) {
        ConfigFactory.clearProperty(key);
    }

    void registerLoader(Loader loader) {
        ConfigFactory.registerLoader(loader);
    }

    void setTypeConverter(Class<?> type, Class<? extends Converter<?>> converter) {
        ConfigFactory.setTypeConverter(type, converter);
    }

    void removeTypeConverter(Class<?> type) {
        ConfigFactory.removeTypeConverter(type);
    }

//FIXME: return statement
    public static <T extends Config> T createProperty(Class<? extends T> clazz) {
        return null;
    }

    @SneakyThrows
    public void removeAnnotationFromMethod(Method annotatedMethod, Class<? extends Annotation> annotationType) {
        boolean annotatedMethodAccessible;
        boolean annotationsFieldAccessible;

        annotatedMethodAccessible = annotatedMethod.isAccessible();
        annotatedMethod.setAccessible(true);
        annotatedMethod.getDeclaredAnnotations();

        Field annotations = annotatedMethod.getClass().getSuperclass().getDeclaredField("declaredAnnotations");
        annotationsFieldAccessible = annotations.isAccessible();
        annotations.setAccessible(true);

        ((Map<Class<? extends Annotation>, Annotation>) annotations.get(annotatedMethod)).remove(annotationType);

        annotations.setAccessible(annotationsFieldAccessible);
        annotatedMethod.setAccessible(annotatedMethodAccessible);
    }
}
