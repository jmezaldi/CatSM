/**
 * IntegracionWSReq_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud;

public class IntegracionWSReq_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(IntegracionWSReq.class);

    static {
        typeDesc.setOption("buildNum","cf011133.09");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("cabecera");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "cabecera"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.comun.tramas.ws.integracionyanbalstore.yanbal.com", "Cabecera"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("detalle");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "detalle"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Detalle"));
        typeDesc.addFieldDesc(field);
    };

    /**
     * Return type metadata object
     */
    public static com.ibm.ws.webservices.engine.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new IntegracionWSReq_Ser(
            javaType, xmlType, typeDesc);
    };

    /**
     * Get Custom Deserializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new IntegracionWSReq_Deser(
            javaType, xmlType, typeDesc);
    };

}
