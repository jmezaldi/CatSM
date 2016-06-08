/**
 * WSMantenimientoUsuariosServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.beans;

public class WSMantenimientoUsuariosServiceLocator extends com.ibm.ws.webservices.multiprotocol.AgnosticService implements com.ibm.ws.webservices.multiprotocol.GeneratedService, com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuariosService {

    public WSMantenimientoUsuariosServiceLocator() {
        super(com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
           "http://beans.ws.integracionyanbalstore.yanbal.com",
           "WSMantenimientoUsuariosService"));

        context.setLocatorName("com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuariosServiceLocator");
    }

    public WSMantenimientoUsuariosServiceLocator(com.ibm.ws.webservices.multiprotocol.ServiceContext ctx) {
        super(ctx);
        context.setLocatorName("com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuariosServiceLocator");
    }

    // Utilizar para obtener la clase de proxy para WSMantenimientoUsuarios
    private final java.lang.String WSMantenimientoUsuarios_address = "https://perms283.unique-yanbal.com:443/WSIntegracionYanbalStoreWeb/services/WSMantenimientoUsuarios";

    public java.lang.String getWSMantenimientoUsuariosAddress() {
        if (context.getOverriddingEndpointURIs() == null) {
            return WSMantenimientoUsuarios_address;
        }
        String overriddingEndpoint = (String) context.getOverriddingEndpointURIs().get("WSMantenimientoUsuarios");
        if (overriddingEndpoint != null) {
            return overriddingEndpoint;
        }
        else {
            return WSMantenimientoUsuarios_address;
        }
    }

    private java.lang.String WSMantenimientoUsuariosPortName = "WSMantenimientoUsuarios";

    // The WSDD port name defaults to the port name.
    private java.lang.String WSMantenimientoUsuariosWSDDPortName = "WSMantenimientoUsuarios";

    public java.lang.String getWSMantenimientoUsuariosWSDDPortName() {
        return WSMantenimientoUsuariosWSDDPortName;
    }

    public void setWSMantenimientoUsuariosWSDDPortName(java.lang.String name) {
        WSMantenimientoUsuariosWSDDPortName = name;
    }

    public com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios getWSMantenimientoUsuarios() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getWSMantenimientoUsuariosAddress());
        }
        catch (java.net.MalformedURLException e) {
            return null; // es poco probable ya que URL se ha validado en WSDL2Java
        }
        return getWSMantenimientoUsuarios(endpoint);
    }

    public com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios getWSMantenimientoUsuarios(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios _stub =
            (com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios) getStub(
                WSMantenimientoUsuariosPortName,
                (String) getPort2NamespaceMap().get(WSMantenimientoUsuariosPortName),
                com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios.class,
                "com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuariosSoapBindingStub",
                portAddress.toString());
        if (_stub instanceof com.ibm.ws.webservices.engine.client.Stub) {
            ((com.ibm.ws.webservices.engine.client.Stub) _stub).setPortName(WSMantenimientoUsuariosWSDDPortName);
        }
        return _stub;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios.class.isAssignableFrom(serviceEndpointInterface)) {
                return getWSMantenimientoUsuarios();
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("WSWS3273E: Error: No hay ninguna implementación de apéndice para la interfaz:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        String inputPortName = portName.getLocalPart();
        if ("WSMantenimientoUsuarios".equals(inputPortName)) {
            return getWSMantenimientoUsuarios();
        }
        else  {
            throw new javax.xml.rpc.ServiceException();
        }
    }

    public void setPortNamePrefix(java.lang.String prefix) {
        WSMantenimientoUsuariosWSDDPortName = prefix + "/" + WSMantenimientoUsuariosPortName;
    }

    public javax.xml.namespace.QName getServiceName() {
        return com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://beans.ws.integracionyanbalstore.yanbal.com", "WSMantenimientoUsuariosService");
    }

    private java.util.Map port2NamespaceMap = null;

    protected synchronized java.util.Map getPort2NamespaceMap() {
        if (port2NamespaceMap == null) {
            port2NamespaceMap = new java.util.HashMap();
            port2NamespaceMap.put(
               "WSMantenimientoUsuarios",
               "http://schemas.xmlsoap.org/wsdl/soap/");
        }
        return port2NamespaceMap;
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            String serviceNamespace = getServiceName().getNamespaceURI();
            for (java.util.Iterator i = getPort2NamespaceMap().keySet().iterator(); i.hasNext(); ) {
                ports.add(
                    com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                        serviceNamespace,
                        (String) i.next()));
            }
        }
        return ports.iterator();
    }

    public javax.xml.rpc.Call[] getCalls(javax.xml.namespace.QName portName) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName no debe ser nulo.");
        }
        if  (portName.getLocalPart().equals("WSMantenimientoUsuarios")) {
            return new javax.xml.rpc.Call[] {
                createCall(portName, "validaUsuariosObj", "validaUsuariosObjRequest"),
                createCall(portName, "validaUsuarios", "validaUsuariosRequest"),
            };
        }
        else {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName no debe ser nulo.");
        }
    }
}
