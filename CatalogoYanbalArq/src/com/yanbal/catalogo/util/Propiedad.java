package com.yanbal.catalogo.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/*
 * @(#)Propiedad.java
 * Copyright 2015 Yanbal International Corporation. Derechos reservados. 
 * YANBAL CONFIDENCIAL. Esta clase esta sujeto a los t�rminos de licencia. 
 */

/**
 * Clase encargada de administracion de los properties de la aplicaci�n.
 * 
 * @version 1.0, 15/11/2013
 * @author isancho
 * @since 1.0
 */

public class Propiedad extends PropertyPlaceholderConfigurer {

    /**
     * Map de properties de la aplicaci�n.
     */
    private static Map<String, Object> mProperties;

    /**
     * Recupera los valores del archivo property para guardarlos en un objeto de
     * tipo Map.
     * 
     * @author isancho
     * @version 1.0, 22/11/2013
     * @param beanFactory Objeto de tipo ConfigurableListableBeanFactory.
     * @param props Objeto de tipo Properties.
     * @throws BeansException
     * @since 1.0
     */
    protected void processProperties(
            ConfigurableListableBeanFactory beanFactory, Properties props){
        super.processProperties(beanFactory, props);
        mProperties = new HashMap<String, Object>();
        for (Object key : props.keySet()) {
            String keyStr = key.toString();
            mProperties.put(keyStr, props.getProperty(keyStr));
        }
    }

    /**
     * Obtiene el valor de una llave del objeto de tipo Map que contiene los
     * valores del archivo de properties.
     * 
     * @author isancho
     * @version 1.0, 22/11/2013
     * @param strKey Llave del archivo property.
     * @return Valor.
     * @since 1.0
     */
    public static Object getValue(String strKey) {
        Object lObject = null;
        lObject = mProperties.get(strKey);
        return lObject;
    }
}
