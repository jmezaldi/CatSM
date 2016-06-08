/**
 * IntegracionWSReq_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud;

public class IntegracionWSReq_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public IntegracionWSReq_Ser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    public void serialize(
        javax.xml.namespace.QName name,
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        context.startElement(name, addAttributes(attributes, value, context));
        addElements(value, context);
        context.endElement();
    }
    protected org.xml.sax.Attributes addAttributes(
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        IntegracionWSReq bean = (IntegracionWSReq) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_0_0;
          propValue = bean.getCabecera();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_2,
              true,null,context);
          propQName = QName_0_1;
          propValue = bean.getDetalle();
          serializeChild(propQName, null, 
              propValue, 
              QName_2_3,
              true,null,context);
        }
    }
    private final static javax.xml.namespace.QName QName_2_3 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com",
                  "Detalle");
    private final static javax.xml.namespace.QName QName_1_2 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://solicitud.comun.tramas.ws.integracionyanbalstore.yanbal.com",
                  "Cabecera");
    private final static javax.xml.namespace.QName QName_0_1 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "detalle");
    private final static javax.xml.namespace.QName QName_0_0 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "cabecera");
}
