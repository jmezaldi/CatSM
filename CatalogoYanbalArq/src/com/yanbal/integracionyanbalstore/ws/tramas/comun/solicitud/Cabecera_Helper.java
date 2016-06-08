/**
 * Cabecera_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.tramas.comun.solicitud;

public class Cabecera_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(Cabecera.class);

    static {
        typeDesc.setOption("buildNum","cf011133.09");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("codigoInterfaz");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "codigoInterfaz"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("usuarioAplicacion");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "usuarioAplicacion"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("codigoAplicacion");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "codigoAplicacion"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("codigoPais");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "codigoPais"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("codigosPaisOD");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "codigosPaisOD"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "ArrayOf_tns4_nillable_CodigoPaisOD"));
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
          new Cabecera_Ser(
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
          new Cabecera_Deser(
            javaType, xmlType, typeDesc);
    };

}
