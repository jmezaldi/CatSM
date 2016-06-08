/**
 * WSMantenimientoUsuarios.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.beans;

public interface WSMantenimientoUsuarios extends java.rmi.Remote {
    public com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp validaUsuariosObj(com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.IntegracionWSReq integracionWSReq) throws java.rmi.RemoteException;
    public java.lang.String validaUsuarios(java.lang.String tramaEntradaXML) throws java.rmi.RemoteException;
}
