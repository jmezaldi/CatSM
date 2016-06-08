/**
 * WSMantenimientoUsuariosSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.beans;

public class WSMantenimientoUsuariosSoapBindingStub extends com.ibm.ws.webservices.engine.client.Stub implements com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios {
    public WSMantenimientoUsuariosSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws com.ibm.ws.webservices.engine.WebServicesFault {
        if (service == null) {
            super.service = new com.ibm.ws.webservices.engine.client.Service();
        }
        else {
            super.service = service;
        }
        super.engine = ((com.ibm.ws.webservices.engine.client.Service) super.service).getEngine();
        super.messageContexts = new com.ibm.ws.webservices.engine.MessageContext[2];
        java.lang.String theOption = (java.lang.String)super._getProperty("lastStubMapping");
        if (theOption == null || !theOption.equals("com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuariosSoapBinding")) {
                initTypeMapping();
                super._setProperty("lastStubMapping","com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuariosSoapBinding");
        }
        super.cachedEndpoint = endpointURL;
        super.connection = ((com.ibm.ws.webservices.engine.client.Service) super.service).getConnection(endpointURL);
    }

    private void initTypeMapping() {
        javax.xml.rpc.encoding.TypeMapping tm = super.getTypeMapping(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
        java.lang.Class javaType = null;
        javax.xml.namespace.QName xmlType = null;
        javax.xml.namespace.QName compQName = null;
        javax.xml.namespace.QName compTypeQName = null;
        com.ibm.ws.webservices.engine.encoding.SerializerFactory sf = null;
        com.ibm.ws.webservices.engine.encoding.DeserializerFactory df = null;
        javaType = com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.IntegracionWSReq.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "IntegracionWSReq");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.comun.solicitud.Cabecera.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.comun.tramas.ws.integracionyanbalstore.yanbal.com", "Cabecera");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.Detalle.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Detalle");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.Parametros.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Parametros");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD[].class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "ArrayOf_tns4_nillable_CodigoPaisOD");
        compQName = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "CodigoPaisOD");
        compTypeQName = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://comun.tramas.ws.integracionyanbalstore.yanbal.com", "CodigoPaisOD");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.ArraySerializerFactory.class, javaType, xmlType, compQName, compTypeQName);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.ArrayDeserializerFactory.class, javaType, xmlType, compQName, compTypeQName);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://comun.tramas.ws.integracionyanbalstore.yanbal.com", "CodigoPaisOD");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "IntegracionWSResp");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.comun.respuesta.Cabecera.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.comun.tramas.ws.integracionyanbalstore.yanbal.com", "Cabecera");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.Detalle.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Detalle");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.Respuesta.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Respuesta");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.Datos.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Datos");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _validaUsuariosObjOperation0 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getvalidaUsuariosObjOperation0() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "integracionWSReq"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "IntegracionWSReq"), com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.IntegracionWSReq.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com}IntegracionWSReq");
        _params0[0].setOption("partName","IntegracionWSReq");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "validaUsuariosObjReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "IntegracionWSResp"), com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp.class, true, false, false, false, true, false); 
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partQNameString","{http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com}IntegracionWSResp");
        _returnDesc0.setOption("partName","IntegracionWSResp");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _validaUsuariosObjOperation0 = new com.ibm.ws.webservices.engine.description.OperationDesc("validaUsuariosObj", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosObj"), _params0, _returnDesc0, _faults0, "validaUsuariosObj");
        _validaUsuariosObjOperation0.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "WSMantenimientoUsuarios"));
        _validaUsuariosObjOperation0.setOption("usingAddressing","false");
        _validaUsuariosObjOperation0.setOption("inputName","validaUsuariosObjRequest");
        _validaUsuariosObjOperation0.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosObjResponse"));
        _validaUsuariosObjOperation0.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "WSMantenimientoUsuariosService"));
        _validaUsuariosObjOperation0.setOption("buildNum","cf011133.09");
        _validaUsuariosObjOperation0.setOption("ResponseNamespace","http://beans.ws.integracionyanbalstore.yanbal.com");
        _validaUsuariosObjOperation0.setOption("targetNamespace","http://beans.ws.integracionyanbalstore.yanbal.com");
        _validaUsuariosObjOperation0.setOption("outputName","validaUsuariosObjResponse");
        _validaUsuariosObjOperation0.setOption("ResponseLocalPart","validaUsuariosObjResponse");
        _validaUsuariosObjOperation0.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosObjRequest"));
        _validaUsuariosObjOperation0.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _validaUsuariosObjOperation0.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _validaUsuariosObjOperation0;

    }

    private int _validaUsuariosObjIndex0 = 0;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getvalidaUsuariosObjInvoke0(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_validaUsuariosObjIndex0];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(WSMantenimientoUsuariosSoapBindingStub._validaUsuariosObjOperation0);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("validaUsuariosObj");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_validaUsuariosObjIndex0] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp validaUsuariosObj(com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.IntegracionWSReq integracionWSReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getvalidaUsuariosObjInvoke0(new java.lang.Object[] {integracionWSReq}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return (com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp.class);
        }
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _validaUsuariosOperation1 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getvalidaUsuariosOperation1() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params1 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "tramaEntradaXML"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
          };
        _params1[0].setOption("inputPosition","0");
        _params1[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params1[0].setOption("partName","string");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc1 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "validaUsuariosReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false, false, false, true, false); 
        _returnDesc1.setOption("outputPosition","0");
        _returnDesc1.setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _returnDesc1.setOption("partName","string");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults1 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _validaUsuariosOperation1 = new com.ibm.ws.webservices.engine.description.OperationDesc("validaUsuarios", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuarios"), _params1, _returnDesc1, _faults1, "validaUsuarios");
        _validaUsuariosOperation1.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "WSMantenimientoUsuarios"));
        _validaUsuariosOperation1.setOption("usingAddressing","false");
        _validaUsuariosOperation1.setOption("inputName","validaUsuariosRequest");
        _validaUsuariosOperation1.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosResponse"));
        _validaUsuariosOperation1.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "WSMantenimientoUsuariosService"));
        _validaUsuariosOperation1.setOption("buildNum","cf011133.09");
        _validaUsuariosOperation1.setOption("ResponseNamespace","http://beans.ws.integracionyanbalstore.yanbal.com");
        _validaUsuariosOperation1.setOption("targetNamespace","http://beans.ws.integracionyanbalstore.yanbal.com");
        _validaUsuariosOperation1.setOption("outputName","validaUsuariosResponse");
        _validaUsuariosOperation1.setOption("ResponseLocalPart","validaUsuariosResponse");
        _validaUsuariosOperation1.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosRequest"));
        _validaUsuariosOperation1.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _validaUsuariosOperation1.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _validaUsuariosOperation1;

    }

    private int _validaUsuariosIndex1 = 1;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getvalidaUsuariosInvoke1(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_validaUsuariosIndex1];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(WSMantenimientoUsuariosSoapBindingStub._validaUsuariosOperation1);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("validaUsuarios");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_validaUsuariosIndex1] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public java.lang.String validaUsuarios(java.lang.String tramaEntradaXML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getvalidaUsuariosInvoke1(new java.lang.Object[] {tramaEntradaXML}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return (java.lang.String) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (java.lang.String) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), java.lang.String.class);
        }
    }

    private static void _staticInit() {
        _validaUsuariosOperation1 = _getvalidaUsuariosOperation1();
        _validaUsuariosObjOperation0 = _getvalidaUsuariosObjOperation0();
    }

    static {
       _staticInit();
    }
}
