/**
 * Datos_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta;

public class Datos_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public Datos_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new Datos();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_24) {
          ((Datos)value).setFlagValidacion(strValue);
          return true;}
        else if (qName==QName_0_13) {
          ((Datos)value).setTipoUsuario(strValue);
          return true;}
        else if (qName==QName_0_14) {
          ((Datos)value).setUsuario(strValue);
          return true;}
        else if (qName==QName_0_25) {
          ((Datos)value).setStatus(strValue);
          return true;}
        else if (qName==QName_0_26) {
          ((Datos)value).setPerfil(strValue);
          return true;}
        else if (qName==QName_0_27) {
          ((Datos)value).setNombreCompleto(strValue);
          return true;}
        else if (qName==QName_0_28) {
          ((Datos)value).setEmail(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_27 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "nombreCompleto");
    private final static javax.xml.namespace.QName QName_0_26 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "perfil");
    private final static javax.xml.namespace.QName QName_0_25 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "status");
    private final static javax.xml.namespace.QName QName_0_28 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "email");
    private final static javax.xml.namespace.QName QName_0_13 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "tipoUsuario");
    private final static javax.xml.namespace.QName QName_0_14 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "usuario");
    private final static javax.xml.namespace.QName QName_0_24 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "flagValidacion");
}
