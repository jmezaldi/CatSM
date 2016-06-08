/**
 * Cabecera_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.tramas.comun.respuesta;

public class Cabecera_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public Cabecera_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new Cabecera();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_4) {
          ((Cabecera)value).setCodigoInterfaz(strValue);
          return true;}
        else if (qName==QName_0_5) {
          ((Cabecera)value).setUsuarioAplicacion(strValue);
          return true;}
        else if (qName==QName_0_6) {
          ((Cabecera)value).setCodigoAplicacion(strValue);
          return true;}
        else if (qName==QName_0_7) {
          ((Cabecera)value).setCodigoPais(strValue);
          return true;}
        else if (qName==QName_0_17) {
          ((Cabecera)value).setIdTransaccion(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_0_8) {
          if (objValue instanceof java.util.List) {
            com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD[] array = new com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD[((java.util.List)objValue).size()];
            ((java.util.List)objValue).toArray(array);
            ((Cabecera)value).setCodigosPaisOD(array);
          } else { 
            ((Cabecera)value).setCodigosPaisOD((com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD[])objValue);}
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "usuarioAplicacion");
    private final static javax.xml.namespace.QName QName_0_4 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "codigoInterfaz");
    private final static javax.xml.namespace.QName QName_0_17 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "idTransaccion");
    private final static javax.xml.namespace.QName QName_0_6 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "codigoAplicacion");
    private final static javax.xml.namespace.QName QName_0_8 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "codigosPaisOD");
    private final static javax.xml.namespace.QName QName_0_7 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "codigoPais");
}
