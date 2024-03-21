package com.jspservlet.utils;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class FormUtil {
    public static <T> T toModel(Class<T> clazz, HttpServletRequest req) {
        T object = null;
        try {
            object = (T) clazz.newInstance();
            BeanUtils.populate(object, req.getParameterMap());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.print(e.getMessage());
        }
        return object;
    }
}
