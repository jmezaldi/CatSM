package com.yanbal.integracionyanbalstore.ws.beans;

public class WSMantenimientoUsuariosProxy implements com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios {
  private boolean _useJNDI = true;
  private boolean _useJNDIOnly = false;
  private String _endpoint = null;
  private com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios __wSMantenimientoUsuarios = null;
  
  public WSMantenimientoUsuariosProxy() {
    _initWSMantenimientoUsuariosProxy();
  }
  
  private void _initWSMantenimientoUsuariosProxy() {
  
    if (_useJNDI || _useJNDIOnly) {
      try {
        javax.naming.InitialContext ctx = new javax.naming.InitialContext();
        __wSMantenimientoUsuarios = ((com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuariosService)ctx.lookup("java:comp/env/service/WSMantenimientoUsuariosService")).getWSMantenimientoUsuarios();
      }
      catch (javax.naming.NamingException namingException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("JNDI lookup failure: javax.naming.NamingException: " + namingException.getMessage());
          namingException.printStackTrace(System.out);
        }
      }
      catch (javax.xml.rpc.ServiceException serviceException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("Unable to obtain port: javax.xml.rpc.ServiceException: " + serviceException.getMessage());
          serviceException.printStackTrace(System.out);
        }
      }
    }
    if (__wSMantenimientoUsuarios == null && !_useJNDIOnly) {
      try {
        __wSMantenimientoUsuarios = (new com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuariosServiceLocator()).getWSMantenimientoUsuarios();
        
      }
      catch (javax.xml.rpc.ServiceException serviceException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("Unable to obtain port: javax.xml.rpc.ServiceException: " + serviceException.getMessage());
          serviceException.printStackTrace(System.out);
        }
      }
    }
    if (__wSMantenimientoUsuarios != null) {
      if (_endpoint != null)
        ((javax.xml.rpc.Stub)__wSMantenimientoUsuarios)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
      else
        _endpoint = (String)((javax.xml.rpc.Stub)__wSMantenimientoUsuarios)._getProperty("javax.xml.rpc.service.endpoint.address");
    }
    
  }
  
  
  public void useJNDI(boolean useJNDI) {
    _useJNDI = useJNDI;
    __wSMantenimientoUsuarios = null;
    
  }
  
  public void useJNDIOnly(boolean useJNDIOnly) {
    _useJNDIOnly = useJNDIOnly;
    __wSMantenimientoUsuarios = null;
    
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (__wSMantenimientoUsuarios == null)
      _initWSMantenimientoUsuariosProxy();
    if (__wSMantenimientoUsuarios != null)
      ((javax.xml.rpc.Stub)__wSMantenimientoUsuarios)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp validaUsuariosObj(com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.IntegracionWSReq integracionWSReq) throws java.rmi.RemoteException{
    if (__wSMantenimientoUsuarios == null)
      _initWSMantenimientoUsuariosProxy();
    return __wSMantenimientoUsuarios.validaUsuariosObj(integracionWSReq);
  }
  
  public java.lang.String validaUsuarios(java.lang.String tramaEntradaXML) throws java.rmi.RemoteException{
    if (__wSMantenimientoUsuarios == null)
      _initWSMantenimientoUsuariosProxy();
    return __wSMantenimientoUsuarios.validaUsuarios(tramaEntradaXML);
  }
  
  
  public com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuarios getWSMantenimientoUsuarios() {
    if (__wSMantenimientoUsuarios == null)
      _initWSMantenimientoUsuariosProxy();
    return __wSMantenimientoUsuarios;
  }
  
}