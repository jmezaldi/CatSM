/**
 * WSMantenimientoUsuariosServiceInformation.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.beans;

public class WSMantenimientoUsuariosServiceInformation implements com.ibm.ws.webservices.multiprotocol.ServiceInformation {

    private static java.util.Map operationDescriptions;
    private static java.util.Map typeMappings;

    static {
         initOperationDescriptions();
         initTypeMappings();
    }

    private static void initOperationDescriptions() { 
        operationDescriptions = new java.util.HashMap();

        java.util.Map inner0 = new java.util.HashMap();

        java.util.List list0 = new java.util.ArrayList();
        inner0.put("validaUsuarios", list0);

        com.ibm.ws.webservices.engine.description.OperationDesc validaUsuarios0Op = _validaUsuarios0Op();
        list0.add(validaUsuarios0Op);

        java.util.List list1 = new java.util.ArrayList();
        inner0.put("validaUsuariosObj", list1);

        com.ibm.ws.webservices.engine.description.OperationDesc validaUsuariosObj1Op = _validaUsuariosObj1Op();
        list1.add(validaUsuariosObj1Op);

        operationDescriptions.put("WSMantenimientoUsuarios",inner0);
        operationDescriptions = java.util.Collections.unmodifiableMap(operationDescriptions);
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _validaUsuarios0Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc validaUsuarios0Op = null;
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "tramaEntradaXML"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _params0[0].setOption("partName","string");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "validaUsuariosReturn"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false, false, false, true, false); 
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _returnDesc0.setOption("partName","string");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        validaUsuarios0Op = new com.ibm.ws.webservices.engine.description.OperationDesc("validaUsuarios", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuarios"), _params0, _returnDesc0, _faults0, null);
        validaUsuarios0Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "WSMantenimientoUsuarios"));
        validaUsuarios0Op.setOption("usingAddressing","false");
        validaUsuarios0Op.setOption("inputName","validaUsuariosRequest");
        validaUsuarios0Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosResponse"));
        validaUsuarios0Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "WSMantenimientoUsuariosService"));
        validaUsuarios0Op.setOption("buildNum","cf011133.09");
        validaUsuarios0Op.setOption("ResponseNamespace","http://beans.ws.integracionyanbalstore.yanbal.com");
        validaUsuarios0Op.setOption("targetNamespace","http://beans.ws.integracionyanbalstore.yanbal.com");
        validaUsuarios0Op.setOption("outputName","validaUsuariosResponse");
        validaUsuarios0Op.setOption("ResponseLocalPart","validaUsuariosResponse");
        validaUsuarios0Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosRequest"));
        validaUsuarios0Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return validaUsuarios0Op;

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _validaUsuariosObj1Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc validaUsuariosObj1Op = null;
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
        validaUsuariosObj1Op = new com.ibm.ws.webservices.engine.description.OperationDesc("validaUsuariosObj", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosObj"), _params0, _returnDesc0, _faults0, null);
        validaUsuariosObj1Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "WSMantenimientoUsuarios"));
        validaUsuariosObj1Op.setOption("usingAddressing","false");
        validaUsuariosObj1Op.setOption("inputName","validaUsuariosObjRequest");
        validaUsuariosObj1Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosObjResponse"));
        validaUsuariosObj1Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "WSMantenimientoUsuariosService"));
        validaUsuariosObj1Op.setOption("buildNum","cf011133.09");
        validaUsuariosObj1Op.setOption("ResponseNamespace","http://beans.ws.integracionyanbalstore.yanbal.com");
        validaUsuariosObj1Op.setOption("targetNamespace","http://beans.ws.integracionyanbalstore.yanbal.com");
        validaUsuariosObj1Op.setOption("outputName","validaUsuariosObjResponse");
        validaUsuariosObj1Op.setOption("ResponseLocalPart","validaUsuariosObjResponse");
        validaUsuariosObj1Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "validaUsuariosObjRequest"));
        validaUsuariosObj1Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return validaUsuariosObj1Op;

    }


    private static void initTypeMappings() {
        typeMappings = new java.util.HashMap();
        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "IntegracionWSReq"),
                         com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.IntegracionWSReq.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.comun.tramas.ws.integracionyanbalstore.yanbal.com", "Cabecera"),
                         com.yanbal.integracionyanbalstore.ws.tramas.comun.solicitud.Cabecera.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Detalle"),
                         com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.Detalle.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://solicitud.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Parametros"),
                         com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.Parametros.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "ArrayOf_tns4_nillable_CodigoPaisOD"),
                         com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD[].class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://comun.tramas.ws.integracionyanbalstore.yanbal.com", "CodigoPaisOD"),
                         com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "IntegracionWSResp"),
                         com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.comun.tramas.ws.integracionyanbalstore.yanbal.com", "Cabecera"),
                         com.yanbal.integracionyanbalstore.ws.tramas.comun.respuesta.Cabecera.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Detalle"),
                         com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.Detalle.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Respuesta"),
                         com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.Respuesta.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://respuesta.vusuarios.tramas.ws.integracionyanbalstore.yanbal.com", "Datos"),
                         com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.Datos.class);

        typeMappings = java.util.Collections.unmodifiableMap(typeMappings);
    }

    public java.util.Map getTypeMappings() {
        return typeMappings;
    }

    public Class getJavaType(javax.xml.namespace.QName xmlName) {
        return (Class) typeMappings.get(xmlName);
    }

    public java.util.Map getOperationDescriptions(String portName) {
        return (java.util.Map) operationDescriptions.get(portName);
    }

    public java.util.List getOperationDescriptions(String portName, String operationName) {
        java.util.Map map = (java.util.Map) operationDescriptions.get(portName);
        if (map != null) {
            return (java.util.List) map.get(operationName);
        }
        return null;
    }

}
