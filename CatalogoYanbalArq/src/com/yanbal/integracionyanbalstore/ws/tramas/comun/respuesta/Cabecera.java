/**
 * Cabecera.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf011133.09 v82411210542
 */

package com.yanbal.integracionyanbalstore.ws.tramas.comun.respuesta;

public class Cabecera  {
    private java.lang.String codigoInterfaz;
    private java.lang.String usuarioAplicacion;
    private java.lang.String codigoAplicacion;
    private java.lang.String codigoPais;
    private com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD[] codigosPaisOD;
    private java.lang.String idTransaccion;

    public Cabecera() {
    }

    public java.lang.String getCodigoInterfaz() {
        return codigoInterfaz;
    }

    public void setCodigoInterfaz(java.lang.String codigoInterfaz) {
        this.codigoInterfaz = codigoInterfaz;
    }

    public java.lang.String getUsuarioAplicacion() {
        return usuarioAplicacion;
    }

    public void setUsuarioAplicacion(java.lang.String usuarioAplicacion) {
        this.usuarioAplicacion = usuarioAplicacion;
    }

    public java.lang.String getCodigoAplicacion() {
        return codigoAplicacion;
    }

    public void setCodigoAplicacion(java.lang.String codigoAplicacion) {
        this.codigoAplicacion = codigoAplicacion;
    }

    public java.lang.String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(java.lang.String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD[] getCodigosPaisOD() {
        return codigosPaisOD;
    }

    public void setCodigosPaisOD(com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD[] codigosPaisOD) {
        this.codigosPaisOD = codigosPaisOD;
    }

    public java.lang.String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(java.lang.String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

}
